<?php
   session_start();
   
   if(!isset($_SESSION['username'])){
   	header('location:index.php');
   }
   
   
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

<?php include 'nav.php' ?>


    <div>
    
        <div class="container" style="margin-top: 70px;"><br>
            <div class="container">
                <div class=" col-lg-12 text-center">
                    <h3 class="text-white"> <a href="#" class="text-uppercase text-warning animateuse"> <?php echo $_SESSION['username']; ?>,</a>
                        Welcome to COVID Quiz </h3>
                </div>
                <br>
                <div class="col-lg-8 d-block m-auto quizsetting ">
                    <div class="card">
                        <p class="card-header text-center"> <?php echo $_SESSION['username']; ?>, you have to select
                            only one out of 4. Best of Luck :) </i> </p>
                    </div>
                    <br>

                    <form action="checked.php" method="POST">

                    <?php

                    for($i = 1; $i<=6 ; $i++){

                    $q = " select* from questions where qid=$i";
                    $query = mysqli_query($con, $q);

                    while ($rows = mysqli_fetch_array($query)) {
                        ?>

                        <div class="card">
                            <h4 class="card-header">
                                <?php echo $rows['question']
                                ?>
                            </h4>
                        <?php
                             $q = " select* from answers where ans_id = $i";
                             $query = mysqli_query($con, $q);
         
                             while ($rows = mysqli_fetch_array($query)) {
                                 ?>

                            <div class="card-body">
                                <input type="radio" name="quizcheck[<?php echo $rows['ans_id']; ?>]" value="<?php echo $rows['aid'];  ?>">
                                <?php echo $rows['answer'];

                                ?>

                            </div>

                        
                        
                        
                    
                    <?php
                    }
                }
                }
                    ?>
                    
                <input type="submit" name="submit" value="submit" class="btn btn-success m-auto d-block">
                <br>
                    



                </form>
                </div>
                    <p id="letc"></p>
                </div>
                <br>
                <a href="logout.php" class="btn btn-primary d-block m-auto text-white"> Logout </a> <br>
                <h5 class="text-center"> &copy2021 Rahul Kalyankar </h5>

            </div>
            
            
        </div>


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