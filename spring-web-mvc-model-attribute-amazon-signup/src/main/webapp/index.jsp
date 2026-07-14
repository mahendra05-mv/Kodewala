<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Amazon Signup</title>

<style>
body {
    font-family: Arial, sans-serif;
    background-color: #ffffff;
}

.container {
    width: 350px;
    margin: 40px auto;
}

.logo {
    text-align: center;
    font-size: 32px;
    font-weight: bold;
    margin-bottom: 20px;
}

.logo span {
    color: #ff9900;
}

.signup-box {
    border: 1px solid #ddd;
    border-radius: 8px;
    padding: 25px;
}

.signup-box h2 {
    font-weight: normal;
    margin-bottom: 20px;
}

label {
    font-weight: bold;
    font-size: 14px;
}

input[type=text] {
    width: 100%;
    padding: 10px;
    margin-top: 5px;
    margin-bottom: 15px;
    border: 1px solid #a6a6a6;
    border-radius: 4px;
    box-sizing: border-box;
}

input[type=text]:focus {
    outline: none;
    border-color: #007185;
    box-shadow: 0 0 5px rgba(0,113,133,0.4);
}

input[type=submit] {
    width: 100%;
    background-color: #FFD814;
    border: 1px solid #FCD200;
    border-radius: 20px;
    padding: 10px;
    cursor: pointer;
    font-size: 14px;
}

input[type=submit]:hover {
    background-color: #f7ca00;
}

.terms {
    font-size: 12px;
    margin-top: 20px;
    color: #555;
}

.footer {
    text-align: center;
    margin-top: 20px;
    color: #555;
    font-size: 13px;
}
</style>

</head>
<body>

<div class="container">

    <div class="logo">
        amazon<span>.</span>
    </div>

    <div class="signup-box">

        <h2>Create Account</h2>

        <form action="signUp" method="post">

            <label>First Name</label>
            <input type="text" name="firstName">

            <label>Last Name</label>
            <input type="text" name="lastName">

            <label>Email Address</label>
            <input type="text" name="email">

            <label>Mobile Number</label>
            <input type="text" name="mob">

            <input type="submit" value="Create your Amazon account">

        </form>

        <div class="terms">
            By creating an account, you agree to Kodewala Academy's
            Conditions of Use and Privacy Notice.
        </div>

    </div>

    <div class="footer">
        © 2026 Kodewala Academy XD
    </div>

</div>

</body>
</html>
```
