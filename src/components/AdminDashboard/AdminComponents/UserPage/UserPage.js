
import Sidebar from "../Sidebar/Sidebar"
import { UserComponent } from "../UserComponent"
import React from 'react';
const UserPage=()=>{
    return(
        <div>
         <div style={{display:"flex" , flexDirection : "row"}}>
        <Sidebar/>
        <UserComponent/>
        </div>
       
        </div>
    )
}
export default UserPage;