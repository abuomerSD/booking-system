import { Link } from "react-router-dom";

const AdminNavbar = () => {
  return (
    <div className="navbar  bg-amber-200">
      <nav className="flex justify-between items-center w-5/6 m-auto h-10">
        <img src="/images/logo.svg" alt="logo" />
        <ul className="flex">
          <li className="mr-2">
            <Link to="/admin/dashboard">Dashboard</Link>
          </li>
          <li className="mr-2">
            <Link to="/admin/bookings">Bookings</Link>
          </li>
          <li className="mr-2">
            <Link to="/admin/payments">Payments</Link>
          </li>
          <li className="mr-2">
            <Link to="/admin/services">Services</Link>
          </li>
        </ul>
      </nav>
    </div>
  );
};

export default AdminNavbar;
