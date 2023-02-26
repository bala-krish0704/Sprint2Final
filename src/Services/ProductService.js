import axios from "axios";
const PRODUCT_API_BASE_URL = 'http://localhost:8080/api/v1/book';

class ProductService {

    //methods to get all products from backend using above URL
    //http://localhost:8080/product/listproducts
    getProducts(){
        return axios.get(PRODUCT_API_BASE_URL+'/getbooks');
    }
    createProduct(product){
        alert("product added")
        return axios.post(PRODUCT_API_BASE_URL+'/saveproducts',product);
    }

    getProductById(productid){
        return axios.get(PRODUCT_API_BASE_URL+'/getproducts/'+productid);
    }
        
}
export default new ProductService();