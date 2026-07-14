<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Paytm Dashboard</title>

<style>
*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial, sans-serif;
}

body{
    background:#f5f7fa;
}

/* Navbar */
.navbar{
    background:#002970;
    color:white;
    height:70px;
    display:flex;
    justify-content:space-between;
    align-items:center;
    padding:0 30px;
}

.logo{
    font-size:34px;
    font-weight:bold;
}

.logo span{
    color:#00baf2;
}

.user-box{
    background:#003f9e;
    padding:10px 18px;
    border-radius:8px;
    font-size:14px;
}

/* Welcome Section */
.welcome{
    text-align:center;
    padding:60px 20px;
    background:white;
    margin:30px;
    border-radius:15px;
    box-shadow:0 3px 12px rgba(0,0,0,0.08);
}

.welcome h1{
    color:#002970;
    margin-bottom:15px;
}

.welcome p{
    color:#666;
    font-size:18px;
}

/* Cards */
.cards{
    display:flex;
    justify-content:center;
    flex-wrap:wrap;
    gap:20px;
    margin:30px;
}

.card{
    width:250px;
    background:white;
    padding:25px;
    border-radius:12px;
    text-align:center;
    box-shadow:0 3px 12px rgba(0,0,0,0.08);
    transition:0.3s;
}

.card:hover{
    transform:translateY(-5px);
}

.card h3{
    color:#002970;
    margin-bottom:10px;
}

.card p{
    color:#666;
}

/* Footer */
.footer{
    text-align:center;
    margin-top:40px;
    padding:20px;
    color:#666;
}
</style>

</head>
<body>

<div class="navbar">
    <div class="logo">
        Pay<span>tm</span>
    </div>

    <div class="user-box">
        User ID : <strong>${userId}</strong>
    </div>
</div>

<div class="welcome">
    <h1>Welcome to Paytm!</h1>
    <p>Your account has been created successfully.</p>
</div>

<div class="cards">

    <div class="card">
        <h3>💸 Wallet</h3>
        <p>Add money and manage your Paytm wallet.</p>
    </div>

    <div class="card">
        <h3>📱 Mobile Recharge</h3>
        <p>Recharge prepaid mobile numbers instantly.</p>
    </div>

    <div class="card">
        <h3>💡 Bill Payments</h3>
        <p>Pay electricity, water and broadband bills.</p>
    </div>

    <div class="card">
        <h3>🏦 Bank Transfer</h3>
        <p>Transfer money securely to bank accounts.</p>
    </div>

</div>

<div class="footer">
    © 2026 Paytm Clone | Built with Spring MVC by Kodewala 🚀
</div>

</body>
</html>
```
