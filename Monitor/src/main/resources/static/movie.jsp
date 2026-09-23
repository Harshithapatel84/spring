
<html>
<head>
    <meta charset="UTF-8">
    <title>Movie</title>

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

        .message {
            text-align: center;
            color: green;
            margin-top: 20px;
        }
    </style>
</head>

<body>

<div class="container-box">

    <h2>Movie Details</h2>

    <form action="movie" method="post">

        <label>Movie Name</label>
        <input type="text"
               name="movieName"
               placeholder="Enter Movie Name">

        <label>Hero</label>
        <input type="text"
               name="hero"
               placeholder="Enter Hero Name">

        <label>Heroine</label>
        <input type="text"
               name="heroine"
               placeholder="Enter Heroine Name">

        <label>Language</label>
        <select name="language">

            <option value="">Select Language</option>
            <option value="Kannada">Kannada</option>
            <option value="Telugu">Telugu</option>
            <option value="Tamil">Tamil</option>
            <option value="Hindi">Hindi</option>
            <option value="Malayalam">Malayalam</option>
            <option value="English">English</option>

        </select>

        <label>Rating</label>
        <input type="number"
               name="rating"
               step="0.1"
               min="0"
               max="10"
               placeholder="Enter Rating">

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

