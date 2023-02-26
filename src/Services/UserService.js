import axios from "axios";
const PRODUCT_API_BASE_URL = 'http://localhost:8080/api/v1/readers';

class UserService {

    //methods to get all products from backend using above URL
    //http://localhost:8080/api/v1/readers/allreader
    getUsers(){
        return axios.get(PRODUCT_API_BASE_URL+'/allreader');
        }
}
export default new UserService();