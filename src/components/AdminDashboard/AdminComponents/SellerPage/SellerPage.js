import { SellerComponent } from "../SellerComponent"
import Sidebar from "../Sidebar/Sidebar"
import React from 'react';
const SellerPage = () => {
    return (
        <div>
            <div style={{ display: "flex", flexDirection: "row" }}>
                <Sidebar />
                <SellerComponent />
            </div>
        </div>
    )
}
export default SellerPage;