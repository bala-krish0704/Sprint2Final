import axios from "axios";

const BASE_URL = 'http://localhost:8080/api/v1';

class ReaderService{

    //Get Reader By ReaderID
    getReaderById(readerID){
        return axios.get(BASE_URL+'/view_reader/'+readerID);
    }

    //Get All Books
    getAllBooks(){
        return axios.get(BASE_URL+'/view_books');
    }

    //Get a Book using BookID
    getBookByBId(bookId){
        return axios.get(BASE_URL+'/view_book/'+bookId)
    }

    //Get Seller By ID
    getSellerByID(sellerId){
        return axios.get(BASE_URL+'/view_seller/'+sellerId);
    }

    //Get Order By ID
    getOrderByID(orderId){
        return axios.get(BASE_URL+'/view_order/'+orderId);
    }

    //Get All Order By ReaderID
    getAllOrderByRId(readerId){
        return axios.get(BASE_URL+'/view_orders/'+readerId);
    }

    //Save Order using post method
    addOrder(orderInfo){
        return axios.post(BASE_URL+'/new_order',orderInfo);
    }

    //Update Reader Details using ReaderId
    updateReaderDetails(readerId,readerInfo){
        return axios.put(BASE_URL+'/update_reader/'+readerId,readerInfo);
    }

    //Deactivate Account
    deActivate(readerId){
        let updateStatus = {status: 'InActive'};
        return axios.put(BASE_URL+'/deactivate',updateStatus);
    }
}

export default new ReaderService();