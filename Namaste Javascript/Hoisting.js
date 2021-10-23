//Hoisting is JavaScript's default behavior of moving all declarations to the top of the current scope (to the top of the current script or the current function).

var x = 10;

function getName() {
  console.log("Aksh kumar");
}

getName();
console.log(getName);
console.log(x);