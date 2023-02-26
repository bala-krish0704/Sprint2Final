import React, { useEffect, useState } from 'react';

import ProductService from '../../../Services/ProductService';

function ProductComponent() {

    //useState for state of the component
    const [books, setProducts] = useState([]);

    //this method call service method to get all products
    const getProducts = () => {
        ProductService.getProducts().then((response) => {
            setProducts(response.data);
            console.log(response.data);
        });
    };

    useEffect(() => {
        getProducts()
    }, []);

    return (
        <div>
            <div style={{ width: "190%" }} className="">

                <h1 style={{ paddingTop: "5%", textAlign: 'Left' }}> &nbsp;BOOK LIST</h1>
                <table className="table table-striped table-inverse table-resposive">
                    <thead className="thead-inverse">
                        <tr>
                            <th>Book Id</th>
                            <th>Book Name</th>
                            <th>Author Name</th>
                            <th>ISBN Number</th>
                            <th>Category</th> 
                            <th>Author</th>
                            <th>Quantity </th>
                            <th>price</th>
                            <th>published On</th>
                            <th>Publisher</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            books.map(
                                books =>
                                    <tr key={books.bookid}>

                                        <td>{books.bookId}</td>
                                        <td>{books.bookName}</td>
                                        <td>{books.bookAuthorName}</td>
                                        <td>{books.bookIsbn}</td>
                                        <td>{books.bookCategory}</td>
                                        <td>{books.bookAuthorName}</td>
                                        <td>{books.bookQuantity}</td>
                                        <td>{books.bookPrice}</td>
                                        <td>{books.bookPubYear}</td>
                                        <td>{books.bookpubName}</td>

                                    </tr>
                            )
                        }
                    </tbody>
                </table>
            </div>
        </div>
    )

}

export default ProductComponent;