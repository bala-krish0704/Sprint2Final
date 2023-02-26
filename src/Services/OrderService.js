import axios from "axios";
const PRODUCT_API_BASE_URL = 'http://localhost:8080/api';

class OrderService {

    //methods to get all products from backend using above URL
    //http://localhost:8080/product/listproducts
    getOrders(){
        return axios.get(PRODUCT_API_BASE_URL+'/orderdetails');
        }
}
export default new OrderService();