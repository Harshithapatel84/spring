<html>
<head>
    <meta charset="UTF-8">
    <title>Register</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
        }

        .container {
            width: 400px;
            margin: 50px auto;
            padding: 25px;
            background-color: white;
            border-radius: 10px;
            box-shadow: 0 0 10px gray;
        }

        h2 {
            text-align: center;
            color: #333;
        }

        label {
            display: block;
            margin-top: 15px;
        }

        input {
            width: 100%;
            padding: 10px;
            margin-top: 5px;
            box-sizing: border-box;
        }

        /* Checkbox styling */
        .checkbox-container {
            display: flex;
            align-items: center;
            margin-top: 15px;
        }

        .checkbox-container input[type="checkbox"] {
            width: auto;
            margin: 0 8px 0 0;
            padding: 0;
        }

        .checkbox-container label {
            display: inline;
            margin: 0;
        }

        button {
            width: 100%;
            padding: 10px;
            margin-top: 20px;
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 5px;
        }
    </style>
</head>

<body>

<div class="container">

    <h2>Register</h2>

    <form action="register" method="post">

        <label>First Name</label>
        <input type="text" name="name" placeholder="Enter Name">

        <label>Mobile Number</label>
        <input type="text" name="phNumber" placeholder="Enter phone number">

        <label>Email</label>
        <input type="email" name="email" placeholder="Enter Email">

        <label>Address</label>
        <input type="text" name="address" placeholder="Enter Address">

        <div class="checkbox-container">
            <input type="checkbox" name="infoCorrect" value="yes" required>
            <label>The above information is correct</label>
        </div>

        <button type="submit">Register</button>

    </form>

    <h3>${message}</h3>

</div>

<div class="text-center mt-4 mb-4">
    <a href="index.jsp" class="btn btn-outline-primary">
        Home
    </a>
</div>

</body>
</html>