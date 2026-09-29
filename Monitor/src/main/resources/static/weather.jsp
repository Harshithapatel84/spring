
<html>
<head>
    <title>Weather Info</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body>

<div class="container d-flex justify-content-center align-items-center min-vh-100">

    <div class="col-md-6">

        <h3 class="text-center text-primary mb-4">Weather Info</h3>

        <form action="weather">

            <div class="mb-3">
                <label class="form-label">City</label>
                <input type="text" name="city" class="form-control" placeholder="Enter city">
            </div>

            <div class="mb-3">
                <label class="form-label">Area</label>
                <input type="text" name="area" class="form-control" placeholder="Enter area">
            </div>

            <div class="mb-3">
                <label class="form-label">Temperature</label>
                <input type="text" name="temperature" class="form-control" placeholder="Enter temperature">
            </div>

            <div class="form-check mb-3">
                <input type="checkbox" name="raining" class="form-check-input">
                <label class="form-check-label">Raining</label>
            </div>

            <button type="submit" class="btn btn-primary">Submit</button>

        </form>

    </div>

</div>

</body>
</html>