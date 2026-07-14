<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Paytm Signup</title>

<style>
*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial, sans-serif;
}

body{
    background:linear-gradient(135deg,#00baf2,#002970);
    height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
}

.signup-container{
    background:white;
    width:400px;
    padding:35px;
    border-radius:15px;
    box-shadow:0 10px 25px rgba(0,0,0,0.2);
}

.logo{
    text-align:center;
    font-size:38px;
    font-weight:bold;
    color:#002970;
    margin-bottom:20px;
}

.logo span{
    color:#00baf2;
}

h2{
    text-align:center;
    margin-bottom:25px;
    color:#333;
}

label{
    display:block;
    margin-bottom:6px;
    font-weight:bold;
    color:#444;
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
    border-color:#00baf2;
    box-shadow:0 0 5px rgba(0,186,242,0.4);
}

input[type=submit]{
    width:100%;
    padding:12px;
    border:none;
    border-radius:8px;
    background:#00baf2;
    color:white;
    font-size:16px;
    font-weight:bold;
    cursor:pointer;
    transition:0.3s;
}

input[type=submit]:hover{
    background:#0095d9;
}

.footer{
    text-align:center;
    margin-top:15px;
    font-size:12px;
    color:#666;
}
</style>

</head>
<body>

<div class="signup-container">

    <div class="logo">
        Pay<span>tm</span>
    </div>

    <h2>Create Your Account</h2>

    <form action="signup" method="post">

        <label>First Name</label>
        <input type="text" name="firstName">

        <label>Last Name</label>
        <input type="text" name="lastName">

        <label>Email</label>
        <input type="text" name="email">

        <label>Mobile Number</label>
        <input type="text" name="mob">

        <label>City</label>
        <input type="text" name="city">

        <input type="submit" value="Create Account">

    </form>

    <div class="footer">
        Secure signup powered by Kodewala Paytm Clone XD 🚀
    </div>

</div>

</body>
</html>
```
