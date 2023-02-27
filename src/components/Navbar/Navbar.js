import React from 'react';
import { Dropdown, DropdownButton } from "react-bootstrap";
import { AccountCircle, Dashboard, ExitToApp } from "@material-ui/icons";
import { AppBar, Toolbar, IconButton, Badge, Typography } from '@material-ui/core';
import { ShoppingCart, AccountCircleSharp } from '@material-ui/icons';
import { Link, useLocation } from 'react-router-dom';
import logo from '../../assets/circles.png';
import useStyles from './styles';
import { useState } from 'react';
import { Modal, Button, Form } from 'react-bootstrap';
import RegLogService from '../../Service/RegLogService';

const Navbar = ({ totalItems }) => {
  const classes = useStyles();
  const location = useLocation();


  //Registration Modal Instances
  const [show, setShow] = useState(false);
  const [name, setName] = useState('');
  const [mobileNo, setMobileNo] = useState('');
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [validated, setValidated] = useState(false);

  //Login Modal Instances
  const [lshow, lsetShow] = useState(false);
  const [lemail, lsetEmail] = useState('');
  const [lpassword, lsetPassword] = useState('');
  const [lvalidated, lsetValidated] = useState(false);

  //Admin Login Modal Instances
  const [Ashow, AsetShow] = useState(false);
  const [Aemail, AsetEmail] = useState('');
  const [Apassword, AsetPassword] = useState('');
  const [Avalidated, AsetValidated] = useState(false);

  //Sign-up model
  const reghandleClose = () => setShow(false);
  const reghandleShow = () => setShow(true);

  //sign-in modal
  const loghandShow = () => lsetShow(true);
  const loghandClose = () => lsetShow(false)

  //Admin Modal
  const AhandShow = () => AsetShow(true);
  const AhandClose = () => AsetShow(false)

  //Loggin CHek
  let isLoggedIn =() =>{
    let ulog = localStorage.getItem('user_email');
    let alog = localStorage.getItem('admin_email');
    if(alog !==null && ulog!==null){
      return true;
    } else {
      return false;
    }
  }


  // boolean dat = 
  const [BtnVisible, setBtnVisible] = useState(true);

  const handleSubmit = (event) => {
    let reqBody = {};
    event.preventDefault();
    const form = event.currentTarget;
    if (form.checkValidity() === false) {
      event.stopPropagation();
    } else {
      reqBody = {
        readerName: name,
        readerEmail: email.toLowerCase(),
        readerMobileNo: mobileNo,
        readerPassword: password
      }
      console.log(reqBody);
      let res = RegLogService.saveNewReader(reqBody);
      console.log(res);
      if (res !== null || res != undefined) {
        reghandleClose();
        loghandShow();
        alert(`Registered Successfully : ${name}`);
      }
      console.log(`Name: ${name}, Email: ${email}, MobileNo : ${mobileNo},Password: ${password}`);
    }
    setValidated(true);
  };

  const loghandleSubmit = (event) => {
    event.preventDefault();
    const form = event.currentTarget;
    if (form.checkValidity() === false) {
      event.stopPropagation();
    } else {

      localStorage.setItem('user_email', lemail.toString());
      localStorage.setItem('user_id', 12345);
      localStorage.setItem('user_name', "Shiva");

      let log = localStorage.getItem('user_email');
      // console.log(`Email: ${lemail}, Password: ${lpassword}`);
      alert(`Logged In Successfully ${log}`);
    }
    lsetValidated(true);
  };

  const AhandleSubmit = (event) => {
    event.preventDefault();
    const form = event.currentTarget;
    if (form.checkValidity() === false) {
      event.stopPropagation();
    } else {

      localStorage.setItem('admin_email', Aemail.toString());
      localStorage.setItem('admin_id', 10004);
      localStorage.setItem('admin_name', "Admin");

      let log = localStorage.getItem('admin_email');
      // console.log(`Email: ${Aemail}, Password: ${Apassword}`);
      alert(`Logged In As Admin :${log}`);
    }
    AsetValidated(true);
  };

  function gotoLogin() {
    reghandleClose();
    loghandShow();
  }

  function gotoSignup() {
    loghandClose();
    reghandleShow();
  }

  function handleLogout() {
    localStorage.removeItem('user_name');
    localStorage.removeItem('user_id');
    localStorage.removeItem('user_email');
    localStorage.removeItem('admin_email');
    localStorage.removeItem('admin_name');
    localStorage.removeItem('admin_id');
  }

  return (
    <div>
      <AppBar position="fixed" className={classes.appBar} color="inherit">
        <Toolbar>
          <Typography component={Link} to="/" variant="h5" className={classes.title} color="inherit">
            <img src={logo} alt="Book Store App" height="50px" className={classes.image} />
            <strong >BOOK-A-BOOK</strong>
          </Typography>

          <div className={classes.Modal}>
            <Modal show={show} onHide={reghandleClose} className="modal fade mt-5">
              <Modal.Header closeButton className={'centered'}>
                <Modal.Title className='justify-content-center text-center'>Sign-Up</Modal.Title>
              </Modal.Header>
              <Modal.Body>
                <Form noValidate validated={validated} onSubmit={handleSubmit}>
                  <Form.Group className="mb-3" controlId="name">
                    <Form.Label>Name</Form.Label>
                    <Form.Control
                      type="text"
                      placeholder="Enter name"
                      value={name}
                      onChange={(e) => setName(e.target.value)}
                      required
                    />
                    <Form.Control.Feedback type="invalid">
                      Please provide a valid name.
                    </Form.Control.Feedback>
                  </Form.Group>

                  <Form.Group className="mb-3" controlId="mobileNo">
                    <Form.Label>Mobile No</Form.Label>
                    <Form.Control
                      type="number"
                      placeholder="Enter Mobile No"
                      value={mobileNo}
                      onChange={(e) => setMobileNo(e.target.value)}
                      required
                    />
                    <Form.Control.Feedback type="invalid">
                      Please provide a valid MobileNo.
                    </Form.Control.Feedback>
                  </Form.Group>

                  <Form.Group className="mb-3" controlId="email">
                    <Form.Label>Email address</Form.Label>
                    <Form.Control
                      type="email"
                      placeholder="Enter email"
                      value={email}
                      onChange={(e) => setEmail(e.target.value)}
                      required
                    />
                    <Form.Control.Feedback type="invalid">
                      Please provide a valid email address.
                    </Form.Control.Feedback>
                  </Form.Group>

                  <Form.Group className="mb-3" controlId="password">
                    <Form.Label>Password</Form.Label>
                    <Form.Control
                      type="password"
                      placeholder="Password"
                      value={password}
                      onChange={(e) => setPassword(e.target.value)}
                      minLength="8"
                      required
                    />
                    <Form.Control.Feedback type="invalid">
                      Password must be at least 8 characters.
                    </Form.Control.Feedback>
                  </Form.Group>

                  <Button className='btn shadow btn-sm float-end' variant="primary" type="submit" style={{ backgroundColor: 'orange' }}>
                    Sign-up
                  </Button>
                </Form>
              </Modal.Body>
              <Modal.Footer>
                <p className='align-center '>if Already Registered ? </p><a href="#" onClick={gotoLogin}>Sign in here</a>
              </Modal.Footer>
            </Modal>
          </div>

          <div className={classes.Modal}>
            <Modal show={lshow} onHide={loghandClose} className="modal fade mt-5">

              <Modal.Header closeButton>
                <Modal.Title>Sign-In</Modal.Title>
              </Modal.Header>
              <Modal.Body>
                <Form noValidate validated={lvalidated} onSubmit={loghandleSubmit}>

                  <Form.Group className="mb-3" controlId="email">
                    <Form.Label>Email address</Form.Label>
                    <Form.Control
                      type="email"
                      placeholder="Enter email"
                      value={lemail}
                      onChange={(e) => lsetEmail(e.target.value)}
                      required
                    />
                    <Form.Control.Feedback type="invalid">
                      Please provide a valid email address.
                    </Form.Control.Feedback>
                  </Form.Group>

                  <Form.Group className="mb-3" controlId="password">
                    <Form.Label>Password</Form.Label>
                    <Form.Control
                      type="password"
                      placeholder="Password"
                      value={lpassword}
                      onChange={(e) => lsetPassword(e.target.value)}
                      minLength="8"
                      required
                    />
                    <Form.Control.Feedback type="invalid">
                      Password must be at least 8 characters.
                    </Form.Control.Feedback>
                  </Form.Group>

                  <Button className='btn btn-info shadow btn-sm' color="secondary" type="submit" onClick={loghandClose}>
                    <a href='/'>Login</a>
                  </Button>
                </Form>
              </Modal.Body>
              <Modal.Footer>
                <p className='align-center '>if you're new user ? </p><a href="#" onClick={gotoSignup}>Sign UP</a>
              </Modal.Footer>
            </Modal>
          </div>

          <div className={classes.grow} />
          {location.pathname === '/' && (
            <div className={classes.button}>
              <IconButton component={Link} to="/cart" aria-label="Show cart items" color="inherit">
                <Badge badgeContent={totalItems} color="secondary">
                  <ShoppingCart />
                </Badge>
              </IconButton>
            </div>
          )}

          {(location.pathname === '/cart'|| location.pathname === '/products' ||
          location.pathname === '/orders' || location.pathname === '/users' ||
          location.pathname === '/checkout')&& (<DropdownButton
            variant="contained"
            title={<AccountCircle fontSize="large" />}
            className={classes.dropdown}
            color="inherit"
          >
            {/* <Dropdown.Item as={Link} to="/profile" style={{ fontSize: "1.5em" }}><AccountCircleSharp /> My Profile</Dropdown.Item> */}
            <Dropdown.Item as={Link} to="/products" style={{ fontSize: "1.5em", marginBottom: '5px' }}><Dashboard /> My Dashboard</Dropdown.Item>
            <Dropdown.Divider />
            <Dropdown.Item onClick={handleLogout} as={Link} to="/" style={{ fontSize: "1.5em" }} ><ExitToApp fontSize="medium" />Logout</Dropdown.Item>
          </DropdownButton>
          )}

          {(location.pathname === '/'&& isLoggedIn) && (<Button
            className="btn btn-outline-light text-dark btn-md ml-auto"
            variant="primary"
            onClick={reghandleShow}>
            Sign-Up
          </Button>
          )}
          {(location.pathname === '/'&& isLoggedIn)&&(<Button
            className="btn btn-outline-light text-dark btn-md ml-auto"
            variant="primary"
            onClick={AhandShow}
          >
            Admin
          </Button>
          )}
          <div className={classes.Modal}>
            <Modal show={Ashow} onHide={AhandClose} className="modal fade mt-5">

              <Modal.Header closeButton>
                <Modal.Title>Admin Login</Modal.Title>
              </Modal.Header>
              <Modal.Body>
                <Form noValidate validated={Avalidated} onSubmit={AhandleSubmit}>

                  <Form.Group className="mb-3" controlId="email">
                    <Form.Label>Email address</Form.Label>
                    <Form.Control
                      type="email"
                      placeholder="Enter email"
                      value={Aemail}
                      onChange={(e) => AsetEmail(e.target.value)}
                      required
                    />
                    <Form.Control.Feedback type="invalid">
                      Please provide a valid email address.
                    </Form.Control.Feedback>
                  </Form.Group>

                  <Form.Group className="mb-3" controlId="password">
                    <Form.Label>Password</Form.Label>
                    <Form.Control
                      type="password"
                      placeholder="Password"
                      value={Apassword}
                      onChange={(e) => AsetPassword(e.target.value)}
                      minLength="8"
                      required
                    />
                    <Form.Control.Feedback type="invalid">
                      Password must be at least 8 characters.
                    </Form.Control.Feedback>
                  </Form.Group>

                  <Button className='btn btn-danger shadow btn-md btn-block' color="secondary" type="submit" as={Link} to="/products" onClick={AhandClose}>
                    Login as Admin
                  </Button>
                </Form>
              </Modal.Body>
            </Modal>
          </div>
        </Toolbar>
      </AppBar>
    </div>
  )
}

export default Navbar
