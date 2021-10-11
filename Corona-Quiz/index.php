<?php 

	$con = mysqli_connect('sql311.epizy.com','epiz_26548248','l1glE8jRm8f1MPN');

	mysqli_select_db($con,'epiz_26548248_subs');

?>


<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />

    <!-- Google Font -->
    <link href="https://fonts.googleapis.com/css2?family=Muli:wght@200;400&display=swap" rel="stylesheet">


    <!-- FontAwesome CDN -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"
        integrity="sha512-iBBXm8fW90+nuLcSKlbmrPcLa0OT92xO1BIsZ+ywDWZCvqsWgccV3gFoRBv0z+8dLJgyAHIhR35VZc2oM/gI1w=="
        crossorigin="anonymous" referrerpolicy="no-referrer" />

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous" />

    <!-- MY CSS -->
    <link rel="stylesheet" href="style.css" />

    <title>COVID Quiz</title>
</head>

<body style="background: linear-gradient(90deg, #1CB5E0 0%, #000851 100%);">

<div>
<?php include 'nav.php' ?>

</div>

    <div class="container">
        <h1 class="text-center"> Welcome to COVID Quiz </h1><br>
        <h1 class="text-center text-light"> Welcome to COVID Quiz </h1><br>

        <div class="row">

            <div class="col-lg-6">
                <div class="card">
                    <h4 class="card-header text-center"> Login Form </h4>
                    <br>
                    <form class="card-body" action="login.php" method="post">
                        <div class="form-group">
                            <label for="user "> Email: </label>
                            <input type="text" name="user" id="user" class="form-control">
                        </div>
                        <div class="form-group">
                            <label for="pass "> Password: </label>
                            <input type="password" name="pass" id="pass" class="form-control">
                        </div><br>
                        <button class="btn btn-success d-block m-auto" type="submit"> Submit </button>
                    </form>

                </div>
            </div>

            <div class="col-lg-6">
                <div class="card">
                    <h4 class="card-header text-center"> SignUp Form </h4>
                    <br>
                    <form class="card-body" action="registration.php" method="post">
                        <div class="form-group">
                            <label for="user "> Email: </label>
                            <input type="text" name="user" id="user" class="form-control">
                        </div>
                        <div class="form-group">
                            <label for="pass "> Password: </label>
                            <input type="password" name="pass" id="pass" class="form-control">
                        </div><br>
                        <button class="btn btn-success d-block m-auto" type="submit"> Submit </button>
                        <div class="duplicate"> </div>
                    </form>

                </div>
            </div>
        </div>
    </div>

    </div>

    </div>

    <h5 class="text-center" style="position: fixed;
    left: 0;
    bottom: 0;
    width: 100%;"> 
        &copy;2021 Rahul Kalyankar 
    </h5>


</body>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Bootstrap JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
    crossorigin="anonymous"></script>

<!-- MY JS -->
<script src="../main.js"></script>

<script src="../back-top.js"></script>

</html>