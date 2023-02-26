import React, { useEffect, useState } from 'react';

import UserService from '../../../Services/UserService';

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
            <div style={{ width: "200%" }} className="">

                <h1 style={{ paddingTop: "5%", textAlign: 'center' }}>Reader List</h1>
                <table class="table table-striped table-inverse">
                    <thead class="thead-inverse">
                        <tr>
                            <th>Reader Id</th>
                            <th>Reader Name</th>
                            <th>Reader Email Id</th>
                            <th>Reader Mobile No</th>
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

