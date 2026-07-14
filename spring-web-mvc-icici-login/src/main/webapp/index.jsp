<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ICICI Bank</title>

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
        background:linear-gradient(135deg, #f58220, #b02a30);
    }

    .container{
        background:white;
        width:420px;
        padding:40px;
        border-radius:15px;
        text-align:center;
        box-shadow:0 8px 25px rgba(0,0,0,0.25);
    }

    .logo{
        font-size:40px;
        font-weight:bold;
        color:#b02a30;
        margin-bottom:5px;
    }

    .bank{
        color:#004b8d;
        font-size:20px;
        font-weight:bold;
        margin-bottom:25px;
    }

    .welcome{
        color:#444;
        margin-bottom:30px;
    }

    .login-btn{
        display:inline-block;
        text-decoration:none;
        background:#004b8d;
        color:white;
        padding:14px 28px;
        border-radius:8px;
        font-size:18px;
        font-weight:bold;
        transition:0.3s;
    }

    .login-btn:hover{
        background:#00376a;
        transform:scale(1.05);
    }

    .footer{
        margin-top:25px;
        color:#666;
        font-size:14px;
    }
</style>

</head>

<body>

<div class="container">

    <div class="logo">ICICI</div>
    <div class="bank">Internet Banking</div>

    <p class="welcome">
        Welcome to ICICI Bank's secure login portal.
    </p>

    <a href="doLogin" class="login-btn">
        Login to Your Account
    </a>

    <div class="footer">
        Safe • Secure • Trusted Banking
    </div>

</div>

</body>
</html>