<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HDFC Bank Login</title>

<style>
    *{
        margin:0;
        padding:0;
        box-sizing:border-box;
        font-family: Arial, sans-serif;
    }

    body{
        height:100vh;
        display:flex;
        justify-content:center;
        align-items:center;
        background:#f4f7fb;
    }

    .container{
        background:white;
        width:420px;
        padding:40px;
        border-radius:12px;
        text-align:center;
        box-shadow:0 6px 20px rgba(0,0,0,0.15);
        border-top:6px solid #004c97;
    }

    .logo{
        font-size:38px;
        font-weight:bold;
        color:#004c97;
        margin-bottom:8px;
    }

    .bank{
        color:#e31837;
        font-size:18px;
        font-weight:bold;
        margin-bottom:25px;
    }

    .welcome{
        color:#555;
        margin-bottom:30px;
        line-height:1.6;
    }

    .login-btn{
        display:inline-block;
        text-decoration:none;
        background:#004c97;
        color:white;
        padding:14px 28px;
        border-radius:8px;
        font-size:18px;
        font-weight:bold;
        transition:0.3s;
    }

    .login-btn:hover{
        background:#003b75;
        transform:scale(1.05);
    }

    .footer{
        margin-top:25px;
        color:#777;
        font-size:14px;
    }
</style>

</head>

<body>

<div class="container">

    <div class="logo">HDFC</div>
    <div class="bank">Bank Internet Banking</div>

    <p class="welcome">
        Welcome to HDFC Bank's secure online banking portal.
    </p>

    <a href="doLogin" class="login-btn">
        Login to Your Account
    </a>

    <div class="footer">
        Secure • Convenient • Trusted Banking
    </div>

</div>

</body>
</html>