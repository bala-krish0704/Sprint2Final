import axios from "axios";

const BASE_URL = 'http://localhost:8080/api/v1/seller';

class SellerService{

    //Get Seller Details By ID
    getSellerByID(sellerId){
        return axios.get(BASE_URL+'/'+sellerId)
    }

    //Get All Books by SellerID
    getAllBookBySId(){
        return axios.get(BASE_URL+'/books');
    }

    //Get a Book using BookID with SellerID ***add seller id
    getBookByBId(bookId){
        return axios.get(BASE_URL+'/book/'+bookId)
    }

    //Get orders By SellerId
    getOrdersBySId(){
        return axios.get(BASE_URL+'/view_orders');
    }

    //Get Orders By OrderID with SellerID
    getOrderByOId(orderId){
        return axios.get(BASE_URL+'/view_order/'+orderId);
    }

    //Add New Book
    addBook(bookInfo){
        return axios.post(BASE_URL+'/upload_book',bookInfo);
    }

    //Update a Existing Book
    updateBookById(bookId){
        return axios.put(BASE_URL+'/book/'+bookId)
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
export default new SellerService;