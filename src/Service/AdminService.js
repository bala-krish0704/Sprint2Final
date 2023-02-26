import axios from "axios";

const BASE_URL = 'http://localhost:8080/api/v1/admin';

class AdminService{

     //Get Seller Details By ID
     getSellerByID(sellerId){
        return axios.get(BASE_URL+'/view_seller/'+sellerId);
    }

     //Get All Seller
     getAllSeller(){
        return axios.get(BASE_URL+'/view_sellers');
    }
    
    //Get All Readers
    getAllReaders(){
        return axios.get(BASE_URL+'/view_readers');
    }

     
    //Get Reader Details By ID
    getReaderById(readerId){
        return axios.get(BASE_URL+'/view_reader/'+readerId);
    }


    //Get All Books by SellerID
    getAllBookBySId(){
        return axios.get(BASE_URL+'/view_seller_books');
    }

    //Get a Book using BookID
    getBookByBId(bookId){
        return axios.get(BASE_URL+'/book/'+bookId)
    }

    //Get orders By SellerId
    getOrdersBySId(sellerId){
        return axios.get(BASE_URL+'/view_orders_bys/'+sellerId);
    }

    //Get Orders By OrderID
    getOrderByOId(orderId){
        return axios.get(BASE_URL+'/view_orders/'+orderId);
    }

    //Get Orders By Book ID
    getOrdersByBId(bookId){
        return axios.get(BASE_URL+'/view_orders_byb/'+bookId);
    }

    //Get Orders by ReaderId
    getOrdersByRId(readerId){
        return axios.get(BASE_URL+'/view_orders_byr/'+readerId);
    }

    //Update Seller Information using sellerID
    updateSellerInfo(sellerID,sellerInfo){
        return axios.put(BASE_URL+'/update_seller',sellerInfo);
    }

    //DeActivate Book using Book ID and SellerID
    deActivateBook(bookID){
        return axios.put(BASE_URL+'/deactivate_book/'+bookId);
    }

    //Deactivate Account
    deactivateAccount(){
        let updateStatus = {status: 'InActive'};
        return axios.put(BASE_URL+'/deactivate',updateStatus);
    }

}
export default new AdminService;