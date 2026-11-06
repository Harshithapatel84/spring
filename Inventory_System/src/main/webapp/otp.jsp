<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Verify OTP</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light">

<div class="container mt-5">
    <div class="card mx-auto p-4 shadow" style="max-width: 400px;">

        <h3 class="text-center mb-3">Verify OTP</h3>
        <p class="text-center text-muted">Enter the OTP sent to your email.</p>

        <form action="${pageContext.request.contextPath}/register/validateOtp" method="post">

            <div class="mb-3">
                <label class="form-label">Email</label>
                <input type="email" name="email" value="${email}" class="form-control" readonly required>
            </div>

            <div class="mb-3">
                <label class="form-label">Enter OTP</label>
                <input type="text" name="otp" class="form-control" placeholder="Enter 6-digit OTP" maxlength="6" pattern="[0-9]{6}" required>
            </div>

            <div class="text-danger mb-3">${error}</div>

            <button type="submit" class="btn btn-primary w-100">Verify OTP</button>

        </form>

        <div class="text-center mt-3">
            <a href="${pageContext.request.contextPath}/register/userLogin">Back to Login</a>
        </div>

    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>