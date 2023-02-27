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
            <div style={{paddingRight: "10%"}}>
                <h1 style={{ paddingTop: "5%", textAlign: 'center', marginTop: "100px"}}>List of Orders</h1>
                <table class="table table-striped">
                    <thead class="thead-inverse">
                        <tr>
                            <th scope="col" className="col-sm-3" style={{textOverflow: "ellipsis"}}>Order Id</th>
                            <th scope="col" className="col-sm-3" style={{textOverflow: "ellipsis"}}>Book Id</th>
                            <th scope="col" className="col-sm-3" style={{textOverflow: "ellipsis"}}>Book Name</th>
                            <th scope="col" className="col-sm-3" style={{textOverflow: "ellipsis"}}>Quantity</th>
                            <th scope="col" className="col-sm-3" style={{textOverflow: "ellipsis"}}>Total Cost</th>
                            <th scope="col" className="col-sm-3" style={{textOverflow: "ellipsis"}}>Reader Id</th>
                        </tr>
                    </thead>
                    <tbody>
                        { orders.map(order =>
                            <tr key={order.orderid}>
                                <td>{order.orderId} </td>
                                <td>{order.bookId}  </td>
                                <td>{order.bookName} </td>
                                <td>{order.quantity} </td>
                                <td>{order.totalCost}</td>
                                <td>{order.readerId} </td>
                            </tr>
                        )}
                    </tbody>
                </table>
            </div>
        </div>
    )


}

export default OrderComponent;

