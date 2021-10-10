var num = document.getElementById("keys");
var display = document.getElementById("display");
var equation = "";

num.addEventListener('click',function(e){
  if(e.target.matches("button")&&e.target.id!="equate"){

    if(e.target.value==".")
      document.getElementById("dot").disabled=true;

    if(e.target.value=="+"||e.target.value=="-"||e.target.value=="x"||e.target.value=="÷"){
      document.getElementById("sum").disabled=true;
      document.getElementById("sub").disabled=true;
      document.getElementById("mul").disabled=true;
      document.getElementById("di").disabled=true;
      document.getElementById("dot").disabled=false;
    }
    else{
      document.getElementById("sum").disabled=false;
      document.getElementById("sub").disabled=false;
      document.getElementById("mul").disabled=false;
      document.getElementById("di").disabled=false;
    }
    
    equation+=e.target.value;
    display.innerHTML=equation;
  }
});

document.getElementById("clear").addEventListener('click',function(){
  equation="";
  display.innerHTML="";
  document.getElementById("dot").disabled=false;
});

document.getElementById("equate").addEventListener('click',function(){
  var str = equation;
  str = str.replaceAll("x","*");
  str = str.replaceAll("÷","/");
  console.log(str);
  var ans = eval(str);
  display.innerHTML=ans;
  equation=ans;
});