import Sidebar from "../Sidebar/Sidebar"
import React from 'react';
import ProductComponent from "../ProductComponent"
const ProductPage=()=>{
    return(
        <div>
         <div style={{display:"flex" , flexDirection : "row"}}>
        <Sidebar/>
        <ProductComponent/>
        </div>
        </div>
    )
}

export default ProductPage;