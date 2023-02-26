
import OrderComponent from "../OrderComponent"
import Sidebar from "../Sidebar/Sidebar"
import React from 'react';
const OrderPage=()=>{
    return(
        <div>
         <div style={{display:"flex" , flexDirection : "row"}}>
        <Sidebar/>
        <OrderComponent/>
        </div>
        </div>
    )
}

export default OrderPage;