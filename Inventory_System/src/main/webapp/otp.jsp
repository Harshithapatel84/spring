<form action="${pageContext.request.contextPath}/register/verifyOtp"
      method="post">

    <div class="mb-3">
        <label class="form-label">Email</label>
        <input type="email"
               name="email"
               value="${email}"
               class="form-control"
               readonly>
    </div>

    <div class="mb-3">
        <label class="form-label">Enter OTP</label>
        <input type="text"
               name="otp"
               class="form-control"
               placeholder="Enter OTP"
               maxlength="6"
               required>
    </div>

    <button type="submit" class="btn btn-primary w-100">
        Verify OTP
    </button>
</form>