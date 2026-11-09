
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Inventory Management System</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
          rel="stylesheet">

    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f5f7fa;
            margin: 0;
        }

        /* Navbar */
        .navbar {
            background-color: #172b4d;
            padding: 15px 0;
        }

        .navbar-brand {
            color: #ffffff !important;
            font-size: 23px;
            font-weight: bold;
        }

        .nav-link {
            color: #ffffff !important;
            margin-left: 18px;
            font-weight: 500;
        }

        .nav-link:hover {
            color: #dbeafe !important;
        }

        .navbar-toggler {
            border: 1px solid white;
        }

        /* Hero Section */
        .hero {
            min-height: 430px;
            display: flex;
            align-items: center;
            justify-content: center;
            text-align: center;
            background-color: #eaf0f7;
            padding: 70px 20px;
        }

        .hero h1 {
            color: #172b4d;
            font-size: 42px;
            font-weight: bold;
        }

        .hero p {
            color: #5b6573;
            font-size: 18px;
            max-width: 650px;
            margin: 20px auto;
            line-height: 1.7;
        }

        .btn-primary {
            background-color: #172b4d;
            border-color: #172b4d;
            padding: 11px 28px;
        }

        .btn-primary:hover {
            background-color: #294b78;
            border-color: #294b78;
        }

        /* Features */
        .features {
            padding: 55px 20px;
        }

        .feature-card {
            background: white;
            padding: 30px 20px;
            border-radius: 10px;
            text-align: center;
            height: 100%;
            box-shadow: 0 3px 12px rgba(0,0,0,0.06);
            transition: 0.3s;
        }

        .feature-card:hover {
            transform: translateY(-5px);
        }

        .feature-icon {
            font-size: 35px;
            margin-bottom: 15px;
        }

        .feature-card h5 {
            color: #172b4d;
            font-weight: bold;
        }

        .feature-card p {
            color: #6c757d;
            font-size: 14px;
        }

        /* Footer */
        footer {
            background-color: #172b4d;
            color: #d5dce5;
            text-align: center;
            padding: 22px;
        }

        footer h5 {
            color: white;
        }

        /* Responsive */
        @media (max-width: 768px) {
            .hero h1 {
                font-size: 30px;
            }

            .hero p {
                font-size: 16px;
            }

            .nav-link {
                margin-left: 0;
            }
        }
    </style>

</head>

<body>

<!-- Navigation Bar -->
<nav class="navbar navbar-expand-lg">

    <div class="container">

        <a class="navbar-brand"
           href="${pageContext.request.contextPath}/">
            📦 Inventory System
        </a>

        <button class="navbar-toggler"
                type="button"
                data-bs-toggle="collapse"
                data-bs-target="#navbarMenu">

            <span class="navbar-toggler-icon"></span>

        </button>

        <div class="collapse navbar-collapse" id="navbarMenu">

            <ul class="navbar-nav ms-auto">

                <li class="nav-item">
                    <a class="nav-link"
                       href="${pageContext.request.contextPath}/">
                        Home
                    </a>
                </li>

                <li class="nav-item">
                    <a class="nav-link"
                       href="${pageContext.request.contextPath}/register">
                        Register
                    </a>
                </li>

                <li class="nav-item">
                    <a class="nav-link"
                       href="${pageContext.request.contextPath}/register/login">
                        Admin
                    </a>
                </li>

                <li class="nav-item">
                    <a class="nav-link"
                       href="${pageContext.request.contextPath}/register/userLogin">
                        User
                    </a>
                </li>

            </ul>

        </div>

    </div>

</nav>


<!-- Hero Section -->
<section class="hero">

    <div class="container">

        <h1>Inventory Management System</h1>

        <p>
            Manage your inventory efficiently with a simple and
            reliable platform. Keep track of products, organize
            stock information and make inventory management easier.
        </p>

        <div class="mt-4">

            <a href="${pageContext.request.contextPath}/register"
               class="btn btn-primary">
                Get Started
            </a>

        </div>

    </div>

</section>


<!-- Features Section -->
<section class="features">

    <div class="container">

        <div class="text-center mb-5">

            <h2 class="fw-bold" style="color:#172b4d;">
                Our Features
            </h2>

            <p class="text-secondary">
                Everything you need to manage your inventory.
            </p>

        </div>

        <div class="row g-4">

            <!-- Product Management -->
            <div class="col-md-4">

                <div class="feature-card">

                    <div class="feature-icon">📦</div>

                    <h5>Product Management</h5>

                    <p>
                        Manage and organize product details
                        in one convenient place.
                    </p>

                </div>

            </div>

            <!-- Stock Management -->
            <div class="col-md-4">

                <div class="feature-card">

                    <div class="feature-icon">📊</div>

                    <h5>Stock Management</h5>

                    <p>
                        Maintain stock information and
                        keep inventory records organized.
                    </p>

                </div>

            </div>

            <!-- Secure Login -->
            <div class="col-md-4">

                <div class="feature-card">

                    <div class="feature-icon">🔐</div>

                    <h5>Secure Login</h5>

                    <p>
                        Separate admin and user login
                        for convenient system access.
                    </p>

                </div>

            </div>

        </div>

    </div>

</section>


<!-- Footer -->
<footer>

    <h5>📦 Inventory Management System</h5>

    <p class="mb-1">
        Simplifying Inventory Management
    </p>

    <small>
        &copy; 2026 Inventory System. All Rights Reserved.
    </small>

</footer>


<!-- Bootstrap JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js">
</script>

</body>
</html>