<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SBI Signup Page</title>

<style>
*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial, sans-serif;
}

body{
    background:#e8edf5;
    min-height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
}

.signup-container{
    width:450px;
    background:white;
    border-radius:15px;
    overflow:hidden;
    box-shadow:0 8px 25px rgba(0,0,0,0.15);
}

.header{
    background:#1b4f9c;
    color:white;
    text-align:center;
    padding:25px;
}

.logo{
    font-size:40px;
    font-weight:bold;
    margin-bottom:8px;
}

.tagline{
    font-size:14px;
    opacity:0.9;
}

.form-section{
    padding:30px;
}

.form-section h2{
    text-align:center;
    color:#1b4f9c;
    margin-bottom:25px;
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
    border:1px solid #ccc;
    border-radius:8px;
    margin-bottom:15px;
    font-size:14px;
}

input[type=text]:focus{
    outline:none;
    border-color:#1b4f9c;
    box-shadow:0 0 6px rgba(27,79,156,0.4);
}

input[type=submit]{
    width:100%;
    background:#1b4f9c;
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
    background:#123a73;
}

.footer{
    text-align:center;
    color:#777;
    margin-top:15px;
    font-size:12px;
}
</style>

</head>
<body>

<div class="signup-container">

    <div class="header">
        <div class="logo">SBI</div>
        <div class="tagline">State Bank of India</div>
    </div>

    <div class="form-section">

        <h2>Create Your SBI Account</h2>

        <form action="signup" method="post">

            <label>First Name</label>
            <input type="text" name="firstName">

            <label>Last Name</label>
            <input type="text" name="lastName">

            <label>Email Address</label>
            <input type="text" name="email">

            <label>Mobile Number</label>
            <input type="text" name="mob">

            <label>Alternate Mobile Number</label>
            <input type="text" name="altMob">

            <label>City</label>
            <input type="text" name="city">

            <label>State</label>
            <input type="text" name="state">

            <input type="submit" value="Open Account">

        </form>

        <div class="footer">
            Secure Banking • Trusted Since 1955
        </div>

    </div>

</div>

</body>
</html>