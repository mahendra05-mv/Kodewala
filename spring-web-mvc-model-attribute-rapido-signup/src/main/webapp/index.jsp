<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Rapido Signup</title>

<style>
*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial, sans-serif;
}

body{
    background:#f5f5f5;
    display:flex;
    justify-content:center;
    align-items:center;
    min-height:100vh;
}

.signup-container{
    width:450px;
    background:white;
    border-radius:15px;
    overflow:hidden;
    box-shadow:0 8px 20px rgba(0,0,0,0.15);
}

.header{
    background:#FFD400;
    color:black;
    text-align:center;
    padding:25px;
}

.header h1{
    font-size:38px;
}

.header p{
    margin-top:8px;
    font-size:14px;
}

.form-section{
    padding:30px;
}

label{
    display:block;
    margin-bottom:6px;
    font-weight:bold;
    color:#333;
}

input[type=text]{
    width:100%;
    padding:12px;
    margin-bottom:15px;
    border:1px solid #ccc;
    border-radius:8px;
    font-size:14px;
}

input[type=text]:focus{
    outline:none;
    border-color:#FFD400;
    box-shadow:0 0 6px rgba(255,212,0,0.5);
}

input[type=submit]{
    width:100%;
    background:black;
    color:white;
    border:none;
    padding:14px;
    border-radius:8px;
    font-size:16px;
    font-weight:bold;
    cursor:pointer;
    transition:0.3s;
}

input[type=submit]:hover{
    background:#222;
}

.footer{
    text-align:center;
    margin-top:15px;
    color:#777;
    font-size:12px;
}
</style>

</head>
<body>

<div class="signup-container">

    <div class="header">
        <h1>Rapido</h1>
        <p>India's Bike Taxi Platform</p>
    </div>

    <div class="form-section">

        <form action="signup" method="post">

            <label>First Name</label>
            <input type="text" name="firstName">

            <label>Last Name</label>
            <input type="text" name="lastName">

            <label>Mobile Number</label>
            <input type="text" name="mob">

            <label>Email Address</label>
            <input type="text" name="email">

            <label>Pickup Location</label>
            <input type="text" name="source">

            <label>Drop Location</label>
            <input type="text" name="destination">

            <input type="submit" value="Book Ride as Guest 🚕">

        </form>

        <div class="footer">
            Fast • Affordable • Reliable
        </div>

    </div>

</div>

</body>
</html>
```
