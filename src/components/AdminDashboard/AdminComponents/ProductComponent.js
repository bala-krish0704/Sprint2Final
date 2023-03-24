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
            <div style={{ paddingRight: "10%" }}>
                <h1 style={{ paddingTop: "5%", textAlign: 'center', marginTop: "100px" }}>List of Books</h1>
                <table className="table table-striped" >
                    <thead>
                        <tr>
                            <th scope="col">Id</th>
                            <th scope="col" className="col-sm-4" style={{ textOverflow: "ellipsis" }}>Book Name</th>
                            <th scope="col" className="col-sm-4" style={{ textOverflow: "ellipsis" }}>Author Name</th>
                            <th scope="col" className="col-sm-3" style={{ textOverflow: "ellipsis" }}>ISBN Number</th>
                            <th scope="col" className="col-sm-3" style={{ textOverflow: "ellipsis" }}>Category</th>
                            <th scope="col" className="col-sm-3" style={{ textOverflow: "ellipsis" }}>Quantity </th>
                            <th scope="col" className="col-sm-3" style={{ textOverflow: "ellipsis" }}>price</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            books.map(
                                book =>
                                    <tr key={book.bookId}>
                                        <td>{book.bookId}</td>
                                        <td>{book.bookName}</td>
                                        <td>{book.bookAuthorName}</td>
                                        <td>{book.bookIsbn}</td>
                                        <td>{book.bookCategory}</td>
                                        <td>{book.bookQuantity}</td>
                                        <td>{book.bookPrice}</td>
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