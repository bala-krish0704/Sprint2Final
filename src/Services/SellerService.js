import axios from "axios";
const SELLER_API_BASE_URL = 'http://localhost:8080/api/v1/seller';

class SellerService {

    //methods to get all products from backend using above URL
    //http://localhost:8080/api/v1/readers/allreader
    getSeller(){
        return axios.get(SELLER_API_BASE_URL+'/allreader');
        }
}
export default new SellerService();