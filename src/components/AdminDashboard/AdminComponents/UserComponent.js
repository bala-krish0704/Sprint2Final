import React, { useEffect, useState } from 'react';

import UserService from '../../../Services/UserService';
import Sidebar from './Sidebar/Sidebar';

export function UserComponent() {

    //useState for state of the component
    const [users, setUsers] = useState([]);

    //this method call service method to get all products
    const getUsers = () => {
        UserService.getUsers().then((response) => {
            setUsers(response.data);
            console.log(response.data);
        });
    };

    useEffect(() => {
        getUsers()
    }, []);

    return (
        <div>
            <div style={{ width: "200%" }} className="mt-5">

                <h1 style={{ paddingTop: "5%", textAlign: 'center' }}>Readers List</h1>
                <table class="table table-striped table-dark">
                    <thead class="thead-inverse">
                        <tr>
                            <th scope='col'>Reader Id</th>
                            <th scope='col'>Reader Name</th>
                            <th scope='col'>Reader Email Id</th>
                            <th scope='col'>Reader Mobile No</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            users.map(
                                (user, i) =>
                                    <tr key={i}>

                                        <td>{user.readerId}</td>
                                        <td>{user.readerName}</td>
                                        <td>{user.readerEmail}</td>
                                        <td>{user.readerMobileNo}</td>
                                    </tr>
                            )
                        }
                    </tbody>
                </table>
            </div>
        </div>
    )


}

