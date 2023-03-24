import Sidebar from "../Sidebar/Sidebar"
import React from 'react';
import { AddBookComponent } from "../AddBookComponent";
const OrderPage=()=>{
    return(
        <div>
         <div style={{display:"flex" , flexDirection : "row"}}>
        <Sidebar/>
        <AddBookComponent />
        </div>
        </div>
    )
}

export default OrderPage;