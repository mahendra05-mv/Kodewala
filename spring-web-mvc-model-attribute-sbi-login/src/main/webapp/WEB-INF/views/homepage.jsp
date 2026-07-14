<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SBI Internet Banking</title>

<style>
*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial, sans-serif;
}

body{
    background:#eef2f7;
}

/* Navbar */
.navbar{
    background:#1b4f9c;
    color:white;
    height:75px;
    display:flex;
    justify-content:space-between;
    align-items:center;
    padding:0 30px;
    box-shadow:0 2px 10px rgba(0,0,0,0.15);
}

.logo{
    font-size:34px;
    font-weight:bold;
}

.user-box{
    background:white;
    color:#1b4f9c;
    padding:10px 18px;
    border-radius:8px;
    font-weight:bold;
}

/* Welcome Section */
.hero{
    background:white;
    margin:30px;
    padding:40px;
    border-radius:15px;
    text-align:center;
    box-shadow:0 3px 12px rgba(0,0,0,0.08);
}

.hero h1{
    color:#1b4f9c;
    margin-bottom:15px;
}

.hero p{
    color:#666;
    font-size:18px;
}

/* Banking Cards */
.cards{
    display:flex;
    justify-content:center;
    flex-wrap:wrap;
    gap:20px;
    margin:30px;
}

.card{
    width:260px;
    background:white;
    border-radius:12px;
    padding:25px;
    text-align:center;
    box-shadow:0 3px 12px rgba(0,0,0,0.08);
    transition:0.3s;
}

.card:hover{
    transform:translateY(-5px);
}

.card h3{
    color:#1b4f9c;
    margin-bottom:10px;
}

.card p{
    color:#666;
}

/* Footer */
.footer{
    text-align:center;
    padding:25px;
    color:#666;
}
</style>

</head>
<body>

<div class="navbar">

    <div class="logo">
        SBI
    </div>

    <div class="user-box">
        Customer ID : ${userId}
    </div>

</div>

<div class="hero">

    <h1>Welcome to SBI Internet Banking</h1>

    <p>
        Your account has been successfully created.
        Thank you for banking with State Bank of India.
    </p>

</div>

<div class="cards">

    <div class="card">
        <h3>💰 Savings Account</h3>
        <p>Manage your savings account and transactions.</p>
    </div>

    <div class="card">
        <h3>💳 Debit Card</h3>
        <p>View and manage your SBI debit card services.</p>
    </div>

    <div class="card">
        <h3>🏦 Fund Transfer</h3>
        <p>Transfer money securely across bank accounts.</p>
    </div>

    <div class="card">
        <h3>📈 Fixed Deposits</h3>
        <p>Create and manage fixed deposits online.</p>
    </div>

</div>

<div class="footer">
    © 2026 State Bank of India | Secure Banking Portal
</div>

</body>
</html>