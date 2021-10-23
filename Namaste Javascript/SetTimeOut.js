console.log("start");

setTimeout(function abc() {
  console.log("Callback");
}, 3000);

console.log("End");

let startDate = new Date().getTime();
let endDate = startDate;
while (endDate < startDate + 10000) {
  endDate = new Date().getTime();
}

console.log("while expires");
