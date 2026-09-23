
<html>
<head>
    <meta charset="UTF-8">
    <title>Contact</title>


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
        textarea,
        select {
            width: 100%;
            padding: 10px;
            margin-top: 5px;
            box-sizing: border-box;
        }

        textarea {
            height: 100px;
            resize: none;
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

    <h2>Contact Us</h2>

    <form action="contact" method="post">

        <label>Name</label>
        <input type="text"
               name="name"
               placeholder="Enter Name">

        <label>Email</label>
        <input type="email"
               name="email"
               placeholder="Enter Email">

        <label>Phone Number</label>
        <input type="number"
               name="phoneNumber"
               placeholder="Enter Phone Number">

        <label>Subject</label>
        <select name="subject">

            <option value="">Select Subject</option>
            <option value="Enquiry">Enquiry</option>
            <option value="Feedback">Feedback</option>
            <option value="Complaint">Complaint</option>
            <option value="Support">Support</option>

        </select>

        <label>Message</label>
        <textarea name="message"
                  placeholder="Enter your message"></textarea>

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