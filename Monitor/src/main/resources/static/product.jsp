
<html>
<head>
    <meta charset="UTF-8">
    <title>Product</title>

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

        input,
        select {
            width: 100%;
            padding: 10px;
            margin-top: 5px;
            box-sizing: border-box;
        }

        .radio-container {
            display: flex;
            gap: 20px;
            margin-top: 10px;
        }

        .radio-container input {
            width: auto;
            margin-right: 5px;
        }

        .radio-container label {
            display: inline;
            margin: 0;
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

    <h2>Product</h2>

    <form action="product" method="post">

        <label>Product Name</label>
        <input type="text"
               name="productName"
               placeholder="Enter Product Name">

        <label>Brand</label>
        <input type="text"
               name="brand"
               placeholder="Enter Brand">

        <label>Category</label>
        <select name="category">

            <option value="">Select Category</option>
            <option value="Electronics">Electronics</option>
            <option value="Clothing">Clothing</option>
            <option value="Grocery">Grocery</option>
            <option value="Furniture">Furniture</option>

        </select>

        <label>Price</label>
        <input type="number"
               name="price"
               placeholder="Enter Price">

        <label>Availability</label>

        <div class="radio-container">

            <label>
                <input type="radio"
                       name="availability"
                       value="Available">
                Available
            </label>

            <label>
                <input type="radio"
                       name="availability"
                       value="Not Available">
                Not Available
            </label>

        </div>

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