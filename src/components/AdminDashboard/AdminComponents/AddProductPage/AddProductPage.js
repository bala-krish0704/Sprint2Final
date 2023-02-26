import {AddProductComponent} from "../AddProductComponent"
import Sidebar from "../Sidebar/Sidebar"
export const AddProductPage=()=>{
    return(
        <div>
         <Navbar/>
        <div style={{display:"flex" , flexDirection : "row"}}>
        <Sidebar/>
        <AddProductComponent/>
        </div>
        <Footer/>
        </div>
    )
}