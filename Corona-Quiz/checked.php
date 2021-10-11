<?php
session_start();

   $con = mysqli_connect('sql311.epizy.com','epiz_26548248','l1glE8jRm8f1MPN');
   	// if($con){
   	// 	echo"connection";
   	// }
   	mysqli_select_db($con,'epiz_26548248_subs');
   ?>
<!DOCTYPE html>
<html>
   <head>
      <title>COVID Quiz</title>
      <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
      <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>


   </head>


   <body class="text-white" style="background: linear-gradient(90deg, #1CB5E0 0%, #000851 100%);">

   <?php include 'nav.php' ?>


     <div class="container text-center" style="margin-top: 50px;" >
     	<br><br>
    	<h1 class="text-center text-success text-uppercase animateuse" >  COVID Quiz</h1>
    	<br><br><br><br>
      <table class="table text-center table-bordered table-hover">
      	<tr>
      		<th colspan="2" class="bg-dark"> <h1 class="text-white"> Results </h1></th>
      		
      	</tr>
      	<tr>
		      	<td>
		      		Questions Attempted
		      	</td>

	         <?php
         $counter = 0;
         $Resultans = 0;
            if(isset($_POST['submit'])){
            if(!empty($_POST['quizcheck'])) {
            // Counting number of checked checkboxes.
            $checked_count = count($_POST['quizcheck']);
            // print_r($_POST);
            ?>

        	<td>
            <?php
            echo "Out of 6, You have attempt ".$checked_count." option."; ?>
            </td>
        
          	
            <?php
            // Loop to store and display values of individual checked checkbox.
            $selected = $_POST['quizcheck'];
            
            $q1= " select ans_id from questions ";
            $ansresults = mysqli_query($con,$q1);
            $i = 1;
            while($rows = mysqli_fetch_array($ansresults)) {
              // print_r($rows);
            	$flag = $rows['ans_id'] == $selected[$i];
            	
            			if($flag){  
            				// echo "correct ans is ".$rows['ans']."<br>";				
            				$counter++;
            				$Resultans++;
            				// echo "Well Done! your ". $counter ." answer is correct <br><br>";
            			}else{
            				$counter++;
            				// echo "Sorry! your ". $counter ." answer is innncorrect <br><br>";
            			}					
            		$i++;		
            	}
            	?>
            	
    		
    		<tr>
    			<td>
    				Your Total score
    			</td>
    			<td colspan="2">
	    	<?php 
	            echo " Your score is ". $Resultans.".";
	            }
	            else{
	            echo "<b>Please Select Atleast One Option.</b>";
	            }
	            } 
	          ?>
	          </td>
            </tr>

            <?php 

            $name = $_SESSION['username']; 
            $finalresult = " insert into usersession(username, totalques, answerscorrect) values ('$name','6','$Resultans') ";
            $queryresult= mysqli_query($con,$finalresult); 
            // if($queryresult){
            // 	echo "successssss";
            // }
            ?>


      </table>

      	<a href="logout.php" class="btn btn-success"> LOGOUT </a>
      </div>
   </body>
</html>












<!-- 

<?php

session_start();
if(!isset($_SESSION['username'])){
header('location:login.php');
}

 $con = mysqli_connect('localhost','root');
    if($con){
      echo"connection";
    }
   
    mysqli_select_db($con,'quizdatabases');


    if(isset($_POST['submit'])){

      if(!empty($_POST['quizcheck'])){

        $count = count($_POST['quizcheck']);
          echo "you count is". $count;

          $selected = $_POST['quizcheck'];
          print_r($selected);

          $q = " select * from question ";
          $query = mysqli_query($con,$q);

          $result = 0;
          $i = 1;
          while ( $rows = mysqli_fetch_array($query)) {
            
              print_r($rows['ans_id']);

              $stored  = $rows['ans_id'] == $selected[$i];

              if($stored){

                $result++;

              }

              $i++;

          }

          echo $result;

      }

    }


?> -->