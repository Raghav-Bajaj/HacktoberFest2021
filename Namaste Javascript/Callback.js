//What is Callback Function in javascript

setTimeout(function () {
  console.log("timer");
}, 5000);

function x(y) {
  console.log("x");
  y();
}
x(function y() {
  console.log("y");
});

//JavaScript is a synchronous and single-threaded language.

//Blocking the main thread
//Here debug the line4 and line 12.

//Power of Callbacks?

//Deep about Event listeners.

function attachEventListener() {
  let count = 0;
  document.getElementById("clickMe").addEventListener("click", function xyz() {
    console.log("Hello I am called.", count++);
  });
}
attachEventListener();

//In above attachEventListener we did closure with EventListner where attachEventListener is just a name of a function.

//Garbage Collection and removeEventListeners
