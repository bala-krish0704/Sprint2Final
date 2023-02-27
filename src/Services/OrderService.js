import axios from "axios";
const ORDER_API_BASE_URL = 'http://localhost:8080/api/v1';

class OrderService {

    //methods to get all products from backend using above URL
    //http://localhost:8080/product/listproducts
    getOrders(){
        return axios.get(ORDER_API_BASE_URL+'/orders');
        }
}
export default new OrderService();