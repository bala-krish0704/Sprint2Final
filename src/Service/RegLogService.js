import axios from "axios";

const BASE_URL = 'http://localhost:8080/api/v1';

class Register{

    //Reader Register
    saveNewReader(readerInfo){
        return axios.post(BASE_URL+"/register",readerInfo);
    }

    //Reader Login 
    checkReaderLogin(readerInfo){
        return axios.post("/login",readerInfo);
    }
    //Seller Register
    saveNewSeller(sellerInfo){
        return axios.post(BASE_URL+'/registers',sellerInfo);
    }

    //Seller Login
    checkSellerLogin(sellerInfo){
        return axios.post(BASE_URL+'/logins',sellerInfo);
    }
}
export default new Register();