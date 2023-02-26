import React from 'react';
import Home from "../AdminDashboard/AdminComponents/Home/Home";
import ProductPage from "../AdminDashboard/AdminComponents/ProductPage/ProductPage";
import OrderPage from "../AdminDashboard/AdminComponents/OrderPage/OrderPage";
import UserPage from "../AdminDashboard/AdminComponents/UserPage/UserPage";
import SellerPage from "../AdminDashboard/AdminComponents/SellerPage/SellerPage";
import { BrowserRouter as Router, Switch, Route } from 'react-router-dom'; 

function AdminDashboard() {

    return (
        <>
            <Router>
                    <Route exact path='/' element={<Home />} />
                    <Switch>
                    <Route exact path='/dashboard/Products' element={<ProductPage />} />
                    <Route exact path='/dashboard/Orders' element={<OrderPage />} />
                    <Route exact path='/dashboard/Users' element={<UserPage />} />
                    <Route exact path='/dashboard/Seller' element={<SellerPage />} />
                    </Switch>
            </Router>
        </>

    );
}

export default AdminDashboard;