import React, { useState } from "react";

const Sidebar = () => {
  const [showSidebar, setShowSidebar] = useState(false);

  let a = localStorage.getItem("user_name");

  return (
    <nav
      className="col-md-3 col-lg-2 d-md-block bg-light sidebar collapse"
      id="sidebar"
    >
      <div className="sidebar-sticky pt-3">
        <button
          className="btn btn-link btn-block d-md-none"
          type="button"
          onClick={() => setShowSidebar(!showSidebar)}
        >
          {showSidebar ? "Hide" : "Show"} Menu
        </button>
        <ul className={`nav flex-column ${showSidebar ? "show" : ""}`}>
          <li className="nav-item mb-2 mt-3">
            <a className="nav-link text-secondary" href="#">
              <h5>{a}</h5>
            </a>
          </li>
          <li className="nav-item mb-2">
            <a className="nav-link text-secondary" href="/dashboard/products">
              <i className="far fa-chart-bar font-weight-bold"></i>{" "}
              <span className="ml-3">Books List</span>
            </a>
          </li>
          <li className="nav-item mb-2">
            <a className="nav-link text-secondary" href="/dashboard/orders">
              <i className="fas fa-file-export font-weight-bold"></i>
              <span className="ml-3">Orders List</span>
            </a>
          </li>
          <li className="nav-item mb-2">
            <a className="nav-link text-secondary" href="/dashboard/users">
              <i className="fas fa-tablet-alt font-weight-bold"></i>
              <span className="ml-3">Reader List</span>
            </a>
          </li>
          <li className="nav-item mb-2">
            <a className="nav-link text-secondary" href="/dashboard/seller">
              <i className="fas fa-atom font-weight-bold"></i>{" "}
              <span className="ml-3">Seller List</span>
            </a>
          </li>
        </ul>
      </div>
    </nav>
  );
};

export default Sidebar;
