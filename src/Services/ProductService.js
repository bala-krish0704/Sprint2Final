import axios from "axios";
const BOOKS_API_BASE_URL = 'http://localhost:8080/api/v1/book';

class ProductService {

    //methods to get all products from backend using above URL
    //http://localhost:8080/product/listproducts
    getProducts(){
        return axios.get(BOOKS_API_BASE_URL+'/getbooks');
    }
    createProduct(book){
        alert("product added")
        return axios.post(BOOKS_API_BASE_URL+'/savebook',book);
    }

    getProductById(productid){
        return axios.get(BOOKS_API_BASE_URL+'/getproducts/'+productid);
    }
        
}
export default new ProductService();