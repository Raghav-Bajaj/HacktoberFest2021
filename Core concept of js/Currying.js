//function currying using bind method .
// here we are currying our function like multiply method which  can be used as many time by currying it.

let multiply = function (x, y) {
  console.log(x * y);
};

let multiplyByTwo = multiply.bind(this, 2);
multiplyByTwo(5);

//here we are using closure concept

let Multiply = function (x) {
  return function (y) {
    console.log(x * y);
  };
};

let multiplyByThree = Multiply(3);
multiplyByThree(5);
