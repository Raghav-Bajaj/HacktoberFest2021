// A closure is a function having access to the parent scope, even after the parent function has closed.

function x() {
  var a = 10;
  function y() {
    console.log(a);
  }
  y();
}
x();
