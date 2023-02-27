import React from 'react';
import Home from "../AdminDashboard/AdminComponents/Home/Home";
import ProductPage from "../AdminDashboard/AdminComponents/ProductPage/ProductPage";
import OrderPage from "../AdminDashboard/AdminComponents/OrderPage/OrderPage";
import UserPage from "../AdminDashboard/AdminComponents/UserPage/UserPage";
import SellerPage from "../AdminDashboard/AdminComponents/SellerPage/SellerPage";
import { BrowserRouter as Router, Route } from 'react-router-dom'; 

function AdminDashboard() {

    return (
        <>
            <Router>
                    <Route path='/dashboard' element={<Home />} />
                    <Route path='/products' element={<ProductPage />} />
                    <Route path='/orders' element={<OrderPage />} />
                    <Route path='/users' element={<UserPage />} />
                    <Route path='/seller' element={<SellerPage />} />

            </Router>
        </>

    );
}

export default AdminDashboard;