<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Rapido Login</title>

<style>
    *{
        margin:0;
        padding:0;
        box-sizing:border-box;
        font-family: Arial, sans-serif;
    }

    body{
        background-color:#f7c600;
        height:100vh;
        display:flex;
        justify-content:center;
        align-items:center;
    }

    .container{
        background:white;
        padding:40px;
        border-radius:15px;
        text-align:center;
        box-shadow:0 5px 20px rgba(0,0,0,0.2);
        width:400px;
    }

    .logo{
        font-size:42px;
        font-weight:bold;
        color:black;
        margin-bottom:10px;
    }

    .tagline{
        color:#555;
        margin-bottom:30px;
    }

    .login-btn{
        display:inline-block;
        background:black;
        color:#f7c600;
        text-decoration:none;
        padding:15px 30px;
        border-radius:8px;
        font-size:18px;
        font-weight:bold;
        transition:0.3s;
    }

    .login-btn:hover{
        background:#222;
        transform:scale(1.05);
    }
</style>

</head>

<body>

    <div class="container">
        <div class="logo">RAPIDO</div>

        <div class="tagline">
            India's Bike Taxi Service
        </div>

        <a href="doLogin" class="login-btn">
            Login to Your Account
        </a>
    </div>

</body>
</html>