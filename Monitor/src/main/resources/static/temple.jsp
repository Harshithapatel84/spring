<html>
<head>
    <meta charset="UTF-8">
    <title>Temple Visit</title>

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

        input,
        select {
            width: 100%;
            padding: 10px;
            margin-top: 5px;
            box-sizing: border-box;
        }

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

    <h2>Temple Visit</h2>

    <form action="temple" method="post">

        <label>Temple Name</label>
        <input type="text" name="name" placeholder="Enter Temple Name">

        <label>Place</label>
        <input type="text" name="place" placeholder="Enter Place">


        <label>Opening Time</label>
        <input type="text" name="openingTime" placeholder="Enter Opening Time">

        <label>Closing Time</label>
        <input type="text" name="closingTime" placeholder="Enter Closing Time">

        <label>Ticket Price</label>
        <select name="ticketPrice">
            <option value="">Select Ticket Price</option>
            <option value="100">100</option>
            <option value="200">200</option>
            <option value="300">300</option>
            <option value="500">500</option>
        </select>


        <button type="submit">Submit</button>

    </form>

    <h3 >${message}</h3>

</div>

<div class="text-center mt-4 mb-4">
    <a href="index.jsp" class="btn btn-outline-primary">
        Home
    </a>
</div>

</body>
</html>