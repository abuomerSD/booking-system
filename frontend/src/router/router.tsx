import { createBrowserRouter, type RouteObject } from "react-router-dom";
import UserBookings from "../pages/user/Bookings";
import App from "../App";
import Home from "../pages/Home";
import AdminBookings from "../pages/admin/Bookings";
import NotFound from "../pages/NotFound";
import UserDashboard from "../pages/user/Dashboard";
import UserPayments from "../pages/user/Payments";
import UserServices from "../pages/user/Services";
import AdminDashboard from "../pages/admin/Dashboard";
import AdminPayments from "../pages/admin/Payments";
import AdminServices from "../pages/admin/Services";

const userRoutes: RouteObject[] = [
  {
    path: "bookings",
    element: <UserBookings />,
  },
  {
    path: "dashboard",
    element: <UserDashboard />,
  },
  {
    path: "payments",
    element: <UserPayments />,
  },
  {
    path: "services",
    element: <UserServices />,
  },
];

const adminRoutes: RouteObject[] = [
  {
    path: "bookings",
    element: <AdminBookings />,
  },
  {
    path: "dashboard",
    element: <AdminDashboard />,
  },
  {
    path: "payments",
    element: <AdminPayments />,
  },
  {
    path: "services",
    element: <AdminServices />,
  },
];

const router = createBrowserRouter([
  {
    path: "/",
    element: <App />,
    children: [
      {
        index: true,
        element: <Home />,
      },
      {
        path: "user",
        children: userRoutes,
      },
      {
        path: "admin",
        children: adminRoutes,
      },
      {
        path: "*",
        element: <NotFound />,
      },
    ],
  },
]);

export default router;
