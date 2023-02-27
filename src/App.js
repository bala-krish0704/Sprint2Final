import React, { useState, useEffect } from 'react';
import { CssBaseline } from '@material-ui/core';
import { commerce } from './lib/commerce';
import Products from './components/Products/Products';
import Navbar from './components/Navbar/Navbar';
import Cart from './components/Cart/Cart';
import Checkout from './components/CheckoutForm/Checkout/Checkout';
import ProductView from './components/ProductView/ProductView';
import Footer from './components/Footer/Footer';
import { BrowserRouter as Router, Switch, Route } from 'react-router-dom';

import 'bootstrap/dist/css/bootstrap.min.css';
import 'mdbreact/dist/css/mdb.css';
import '@fortawesome/fontawesome-free/css/all.min.css';

import AdminDashboard from './components/AdminDashboard/AdminDashboard';
import ProductPage from './components/AdminDashboard/AdminComponents/ProductPage/ProductPage';
import OrderPage from './components/AdminDashboard/AdminComponents/OrderPage/OrderPage';
import UserPage from './components/AdminDashboard/AdminComponents/UserPage/UserPage';
import SellerPage from './components/AdminDashboard/AdminComponents/SellerPage/SellerPage';


const App = () => {

  const [mobileOpen, setMobileOpen] = React.useState(false);
  const [products, setProducts] = useState([]);
  const [cart, setCart] = useState({});
  const [order, setOrder] = useState({});
  const [errorMessage, setErrorMessage] = useState('');

  const fetchProducts = async () => {
    const { data } = await commerce.products.list();
    //Printing in console
    console.log("Fetching books from server", data);
    setProducts(data);
  };

  const fetchCart = async () => {

    setCart(await commerce.cart.retrieve());
    //Printing in console
    console.log(" From Cart : ", await commerce.cart.retrieve());
  };

  const handleAddToCart = async (productId, quantity) => {
    const item = await commerce.cart.add(productId, quantity);
    //Printing in console
    console.log("Adding Item to Cart : ", item);
    setCart(item.cart);
  };

  const handleUpdateCartQty = async (lineItemId, quantity) => {
    const response = await commerce.cart.update(lineItemId, { quantity });
    //Printing in console
    console.log("Updating the quantity: ", response)
    setCart(response.cart);
  };

  const handleRemoveFromCart = async (lineItemId) => {
    const response = await commerce.cart.remove(lineItemId);

    //Printing in console
    console.log("Removing the item form cart " + response);
    setCart(response.cart);
  };

  const handleEmptyCart = async () => {
    const response = await commerce.cart.empty();
    //Printing in console
    console.log("Emptying the cart: ", response);
    setCart(response.cart);
  };

  const refreshCart = async () => {
    const newCart = await commerce.cart.refresh();

    //Printing in console
    console.log("Refreshing the cart", newCart);
    setCart(newCart);
  };

  const handleCaptureCheckout = async (checkoutTokenId, newOrder) => {

    console.log(`CheckOut Token Id : ${checkoutTokenId}`)
    console.log(newOrder);
    try {
      const incomingOrder = await commerce.checkout.capture(checkoutTokenId, newOrder);

      //Printing in console
      console.log("Checkout a order:", incomingOrder);
      setOrder(incomingOrder);

      refreshCart();
    } catch (error) {
      setErrorMessage(error.data.error.message);
    }
  };
  useEffect(() => {
    localStorage.removeItem("user_id");
    fetchProducts();
    fetchCart();
  }, []);

  const handleDrawerToggle = () => setMobileOpen(!mobileOpen);

  return (
    <div>
      <Router>
        <div style={{ display: 'flex' }}>
          <CssBaseline />
          <Navbar totalItems={cart.total_items} handleDrawerToggle={handleDrawerToggle} />
          <Switch>
            <Route exact path="/">
              <Products products={products} onAddToCart={handleAddToCart} handleUpdateCartQty />
            </Route>

            <Route exact path="/cart">
              <Cart cart={cart} onUpdateCartQty={handleUpdateCartQty} onRemoveFromCart={handleRemoveFromCart} onEmptyCart={handleEmptyCart} />
            </Route>

            <Route path="/checkout" exact>
              <Checkout cart={cart} order={order} onCaptureCheckout={handleCaptureCheckout} error={errorMessage} />
            </Route>

            <Route path="/product-view/:id" exact>
              <ProductView />
            </Route>
            <Route path={'/products'} component={ProductPage} />
            <Route path='/orders' component={OrderPage} />
            <Route path='/users' component={UserPage} />
            <Route path='/seller' component={SellerPage} />
          </Switch>
        </div>
      </Router>
      <Footer />
    </div>
  );
};

export default App;
