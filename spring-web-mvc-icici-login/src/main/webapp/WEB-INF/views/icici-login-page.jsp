<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ICICI Login Page</title>

<style>
    *{
        margin:0;
        padding:0;
        box-sizing:border-box;
        font-family: Arial, sans-serif;
    }

    body{
        height:100vh;
        background:linear-gradient(135deg, #f58220, #b02a30);
        display:flex;
        justify-content:center;
        align-items:center;
    }

    .container{
        width:520px;
        background:white;
        border-radius:14px;
        padding:40px;
        text-align:center;
        box-shadow:0 8px 25px rgba(0,0,0,0.25);
    }

    .logo{
        color:#b02a30;
        font-size:38px;
        font-weight:bold;
        margin-bottom:8px;
    }

    .bank{
        color:#004b8d;
        font-size:22px;
        font-weight:bold;
        margin-bottom:25px;
    }

    h2{
        color:#333;
        margin-bottom:15px;
    }

    p{
        color:#555;
        line-height:1.8;
        font-size:16px;
        margin-bottom:12px;
    }

    .status{
        margin-top:25px;
        background:#004b8d;
        color:white;
        padding:12px;
        border-radius:8px;
        font-weight:bold;
    }

    .note{
        margin-top:15px;
        color:#b02a30;
        font-weight:bold;
    }
</style>

</head>

<body>

<div class="container">

    <div class="logo">ICICI</div>
    <div class="bank">Bank Login Portal</div>

    <h2>Welcome to ICICI Net Banking</h2>

    <p>
        This login page is currently under development.
    </p>

    <p>
        In future projects, users will be able to securely access
        their accounts, check balances, view transactions,
        and manage banking services online.
    </p>

    <p>
        More features will be added as the project grows.
    </p>

    <div class="status">
        Work in Progress 😅
    </div>

    <div class="note">
        Secure Banking Experience Coming Soon
    </div>

</div>

</body>
</html>