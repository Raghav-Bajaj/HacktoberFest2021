<?php

session_start();
header('location:index.php');

$con = mysqli_connect('sql311.epizy.com','epiz_26548248','l1glE8jRm8f1MPN');
	if($con){
		echo"connection";
	}

	mysqli_select_db($con,'epiz_26548248_subs');


	$username = $_POST['user'];
	$password = $_POST['pass'];
	

	// echo $username;
	// echo $password;

	$check = "select * from quizregistration where user='$username' && pass='$password' ";
	$resultcheck = mysqli_query($con,$check);	

	 $row = mysqli_num_rows($resultcheck);
			if($row == 1){
			
				
			}	else{

				$q = "insert into quizregistration(user, pass) values ('$username', '$password')"  ;

				$result = mysqli_query($con,$q);

			}



?>


