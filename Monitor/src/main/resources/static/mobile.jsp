
<html>
<head>
    <meta charset="UTF-8">
    <title>Mobile</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
          rel="stylesheet">

    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
        }

        .container-box {
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

        input, select {
            width: 100%;
            padding: 10px;
            margin-top: 5px;
            box-sizing: border-box;
        }

        .message {
            text-align: center;
            color: green;
            margin-top: 20px;
        }
    </style>
</head>

<body>

<div class="container-box">

    <h2>Mobile Details</h2>

    <form action="mobile" method="post">

        <label>Brand</label>
        <input type="text" name="brand" placeholder="Enter Brand">

        <label>Model</label>
        <input type="text" name="model" placeholder="Enter Model">

        <label>Price</label>
        <input type="number" name="price" placeholder="Enter Price">

        <label>Storage</label>
        <select name="storage">
            <option value="">Select Storage</option>
            <option value="64GB">64 GB</option>
            <option value="128GB">128 GB</option>
            <option value="256GB">256 GB</option>
            <option value="512GB">512 GB</option>
        </select>

        <label>Color</label>
        <input type="text" name="color" placeholder="Enter Color">

        <button type="submit" class="btn btn-primary w-100 mt-4">
            Submit
        </button>

    </form>

    <h3 class="message">${message}</h3>

</div>

<div class="text-center mt-4 mb-4">
    <a href="index.jsp" class="btn btn-outline-primary">
        Home
    </a>
</div>

</body>
</html>