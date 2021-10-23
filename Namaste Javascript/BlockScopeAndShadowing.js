//Here the statement which is wrapped in curly braces is block statement.

// if (true) {
//   //Compound Statement
//   var a = 10;
//   console.log(a);
// }

{
  var a = 10;
  let b = 20; // Let and const are block scope.
  const c = 30; // Let and const are block scope.

  console.log(a);
  console.log(b); // All  three can be accessed here in block only
  console.log(c);
}
console.log(a);
console.log(b); // But as soon as it moves out of the block only var can be accessed because let and const are in block scope and moreover var is in global scope.
console.log(c);
