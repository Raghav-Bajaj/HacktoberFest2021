a(); //Here hoisting is used and will not throw an error
//b(); //Here hoisting is used too but it will throw an error
//This is the diffrence b/w Function statement and Function Expression

//Function Statement  aka Function Declaration
function a() {
  console.log("a called");
}
//a();

//Function Expression

var b = function () {
  console.log("b called");
};
b();

//Anonyomous Function
//An anonymous function is a function without a name. An anonymous function is often not accessible after its initial creation
// function () {

// }

//Named Function Expression
//This is same as Function Expression but not with anonyomous Function
var c = function xyz() {
  console.log("c called");
};
c();

//Difference b/w Parameters & Arguments

var d = function (param1, param2) {
  console.log(param1, param2);
};
d(1, 2); //here 1 ,2 are arguments

//First class Function
// A function can be passed as an argument to other functions, can be returned by another function and can be assigned as a value to a variable.
