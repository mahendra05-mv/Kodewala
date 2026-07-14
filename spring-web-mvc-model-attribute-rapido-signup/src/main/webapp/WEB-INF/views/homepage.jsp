<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Rapido Dashboard</title>

<style>
*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial, sans-serif;
}

body{
    background:#f5f5f5;
}

/* Navbar */
.navbar{
    background:#FFD400;
    height:70px;
    display:flex;
    justify-content:space-between;
    align-items:center;
    padding:0 30px;
    box-shadow:0 2px 10px rgba(0,0,0,0.1);
}

.logo{
    font-size:36px;
    font-weight:bold;
    color:black;
}

.user-box{
    background:black;
    color:white;
    padding:10px 18px;
    border-radius:8px;
    font-size:14px;
}

/* Welcome Section */
.hero{
    text-align:center;
    padding:60px 20px;
}

.hero h1{
    color:#222;
    margin-bottom:15px;
}

.hero p{
    color:#666;
    font-size:18px;
}

/* Ride Cards */
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
    color:#111;
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
    <div class="logo">Rapido</div>

    <div class="user-box">
        Guest ID : <strong>${userId}</strong>
    </div>
</div>

<div class="hero">
    <h1>Ride Booked Successfully 🚕</h1>
    <p>Thank you for choosing Rapido. Your ride request has been received.</p>
</div>

<div class="cards">

    <div class="card">
        <h3>🏍 Bike Ride</h3>
        <p>Fast and affordable rides through city traffic.</p>
    </div>

    <div class="card">
        <h3>🛺 Auto Ride</h3>
        <p>Comfortable auto rides at transparent prices.</p>
    </div>

    <div class="card">
        <h3>🚖 Cab Ride</h3>
        <p>Book a cab for longer and more comfortable journeys.</p>
    </div>

</div>

<div class="footer">
    © 2026 Rapido Clone | Built with Spring MVC 🚀
</div>

</body>
</html>
```
