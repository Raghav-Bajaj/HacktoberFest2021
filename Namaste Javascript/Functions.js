var x = 1; //Here global declaration is made up
a(); //Here hoisting concept is used and function a() is being invoked.
b(); //Here hoisting concept is used and function b() is being invoked.
console.log(x);

function a() {
  var x = 10;
  console.log(x);
}

function b() {
  var x = 100;
  console.log(x);
}
