import React, { useEffect, useState } from 'react';
import UserService from '../../../Services/UserService';

export function SellerComponent() {

    //useState for state of the component
    const [seller, setSeller] = useState([]);

    //this method call service method to get all products
    const getSeller = () => {
        UserService.getSeller().then((response) => {
            setSeller(response.data);
            console.log(response.data);
        });
    };

    useEffect(() => {
        getSeller()
    }, []);

    return (
        <div>
            <div style={{ width: "200%" }} className="">

                <h1 style={{ paddingTop: "5%", textAlign: 'center' }}>Seller List</h1>
                <table class="table table-striped table-inverse">
                    <thead class="thead-inverse">
                        <tr>
                            <th>Seller Id</th>
                            <th>Seller Name</th>
                            <th>Seller Email Id</th>
                            <th>Seller Mobile NO</th>
                            <th>Seller Gender</th>
                            <th>Seller GSTIN no</th>
                            <th>Seller Address</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            seller.map(
                                (seller, i) =>
                                    <tr key={i}>

                                        <td>{seller.sellerId}</td>
                                        <td>{seller.sellerName}</td>
                                        <td>{seller.sellerEmail}</td>
                                        <td>{seller.mobileNumber}</td>
                                        <td>{seller.sellerGender}</td> 
                                        <td>{seller.GstinNo}</td>   
                                        <td>{seller.sellerAddress}</td>                                  {}
                                        
                                    </tr>
                            )
                        }
                    </tbody>
                </table>
            </div>
        </div>
    )


}
