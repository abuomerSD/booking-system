# 🏨 Booking Website

A **full-stack booking platform** built with **React (frontend)** and **Spring Boot (backend)**.  
Users can browse services, make bookings, and manage payments, while admins can manage services and view bookings.

---

## 📌 Features

### User

- Register & login with JWT authentication
- Browse available services
- Book a service (choose date & time)
- Manage bookings (view, update, cancel)
- Make payments (mock / Stripe test mode)
- View upcoming bookings on dashboard

### Admin

- Manage services (create, update, delete)
- View all bookings
- Track payments
- Access admin dashboard with stats

---

## 🗄️ Database Design

**Main Entities:**

- **Users** → authentication & roles (customer/admin)
- **Services** → bookable items (hotel rooms, events, etc.)
- **Bookings** → reservations linked to users & services
- **Payments** → linked to bookings

(Relational database: PostgreSQL / MySQL)

---

## 🏗️ Tech Stack

### Frontend

- **React 18** (with React Router)
- **Axios** (API calls)
- **Tailwind CSS / Material UI** (styling)
- **Vite** or Create React App

### Backend

- **Spring Boot 3**
- **Spring Security + JWT**
- **Spring Data JPA**
- **Hibernate**
- **PostgreSQL** (or MySQL)

### Tools

- **Maven** (backend build)
- **npm / yarn** (frontend build)
- **Docker Compose** (optional: run frontend + backend together)

---

## 📂 Project Structure
