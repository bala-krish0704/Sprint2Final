import React, { useEffect, useState } from 'react';
import OrderService from '../../../Services/OrderService';

function OrderComponent() {

    //useState for state of the component
    const [orders, setOrders] = useState([]);

    //this method call service method to get all products
    const getOrders = () => {
        OrderService.getOrders().then((response) => {
            setOrders(response.data);
            console.log(response.data);
        });
    };

    useEffect(() => {
        getOrders()
    }, []);

    return (
        <div>

            <div style={{ width: "200%" }} className="">
                <h1 style={{ paddingTop: "5%", textAlign: 'Left' }}> <br></br>&nbsp;ORDER LIST</h1>
                <table class="table table-striped table-inverse table-responsive">
                    <thead class="thead-inverse">
                        <tr>
                            <th>Order Id</th>
                            <th>Book Id</th>
                            <th>Quantity</th>
                            <th>Total Cost</th>
                            <th>Reader Id</th>
                            <th>Seller Id</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            orders.map(
                                order =>
                                    <tr key={order.orderid}>
                                        <td>{order.orderId}</td>
                                        <td>{order.bookId}</td>
                                        <td>{order.quantity}</td>
                                        <td>{order.totalcost}</td>
                                        <td>{order.readerId}</td>
                                        <td>{order.sellerId}</td>
                                    </tr>
                            )
                        }
                    </tbody>
                </table>
            </div>
        </div>
    )


}

export default OrderComponent;