
import React, { useState } from "react";
const Sidebar = () => {
  const [showSidebar, setShowSidebar] = useState(false);

  let a = localStorage.getItem("user_name") || localStorage.getItem('admin_email');

  return (
    <nav
      className="col-md-3 col-lg-2 d-md-block bg-light sidebar collapse "
      id="sidebar"
      style={{
        position: "static",
        top: 0,
        left: 0,
        bottom: 0,
        width: "300px",
        overflow: 'hidden',
        boxShadow: "0 0 10px rgba(0, 0, 0, 0.1)",
        zIndex: 4,
        marginRight: "50px",
      }}
    >
      <div className="sidebar-sticky ">
        <button
          className="btn btn-link btn-block d-md-none"
          type="button"
          onClick={() => setShowSidebar(!showSidebar)}
        >
          {showSidebar ? "Hide" : "Show"} Menu
        </button>
        <ul className={`nav flex-column ${showSidebar ? "show" : ""}`}>
          <li className="nav-item mb-2 mt-3">
            <h5 className="text-center" style={{ marginTop: "150px", marginBottom: "50px", fontSize: "2rem", fontFamily: "monospace" }}>Dashboard</h5>
          </li>
          <li className="nav-item mb-5">
            <a className="nav-link text-secondary" href="/products">
              <i className="far fa-chart-bar font-weight-bold"></i>{" "}
              <span className="ml-3" style={{ padding: "1rem", fontSize: "1.5rem", fontFamily: "cursive" }}>Books List</span>
            </a>
          </li>
          <li className="nav-item mb-5">
            <a className="nav-link text-secondary" href="/orders">
              <i className="fas fa-file-export font-weight-bold"></i>
              <span className="ml-3" style={{ padding: "1rem", fontSize: "1.5rem", fontFamily: "cursive" }}>Orders List</span>
            </a>
          </li>
          <li className="nav-item mb-5">
            <a className="nav-link text-secondary" href="users">
              <i className="fas fa-tablet-alt font-weight-bold"></i>
              <span className="ml-3" style={{ padding: "1rem", fontSize: "1.5rem", fontFamily: "cursive" }}>Reader List</span>
            </a>
          </li>
        </ul>
      </div>
    </nav>
  );
};

export default Sidebar;
