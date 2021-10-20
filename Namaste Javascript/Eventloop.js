// console.log("Start");

// document.getElementById("clickMe").addEventListener("click", function abc() {
//   console.log("Callback");
// });

// console.log("End");

console.log("Start");

setTimeout(function abc() {
  console.log(" abc Timeout ");
}, 3000);

fetch("https://jsonplaceholder.typicode.com/todos/1")
  .then(function xyz() {
    console.log("xyz Youtube");
  })
  .catch("Error");

console.log("End");
