<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Amazon Home</title>

<style>
*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial, sans-serif;
}

body{
    background:#eaeded;
}

/* Navbar */
.navbar{
    background:#131921;
    color:white;
    height:60px;
    display:flex;
    align-items:center;
    justify-content:space-between;
    padding:0 30px;
}

.logo{
    font-size:30px;
    font-weight:bold;
}

.logo span{
    color:#ff9900;
}

.user{
    background:#232f3e;
    padding:8px 15px;
    border-radius:5px;
    font-size:14px;
}

/* Hero Section */
.hero{
    text-align:center;
    padding:80px 20px;
    background:white;
    margin:30px;
    border-radius:10px;
    box-shadow:0px 2px 8px rgba(0,0,0,0.1);
}

.hero h1{
    color:#131921;
    margin-bottom:15px;
}

.hero p{
    color:#555;
    font-size:18px;
    margin-bottom:25px;
}

.btn{
    background:#ffd814;
    color:black;
    padding:12px 25px;
    border:none;
    border-radius:20px;
    cursor:pointer;
    font-size:15px;
    text-decoration:none;
}

.btn:hover{
    background:#f7ca00;
}

/* Cards */
.cards{
    display:flex;
    justify-content:center;
    gap:20px;
    margin:30px;
}

.card{
    background:white;
    width:250px;
    padding:20px;
    border-radius:10px;
    box-shadow:0px 2px 8px rgba(0,0,0,0.1);
}

.card h3{
    margin-bottom:10px;
}

.card p{
    color:#666;
}
</style>

</head>
<body>

<div class="navbar">
    <div class="logo">
        amazon<span>.</span>
    </div>

    <div class="user">
        User ID : ${userId}
    </div>
</div>

<div class="hero">
    <h1>Welcome to Amazon!</h1>
    <p>Your account has been created successfully.</p>
    <a href="#" class="btn">Start Shopping</a>
</div>

<div class="cards">
    <div class="card">
        <h3>Mobiles</h3>
        <p>Explore the latest smartphones and accessories.</p>
    </div>

    <div class="card">
        <h3>Laptops</h3>
        <p>Find powerful laptops for work and gaming.</p>
    </div>

    <div class="card">
        <h3>Fashion</h3>
        <p>Discover trending styles and great deals.</p>
    </div>
</div>

</body>
</html>
```
