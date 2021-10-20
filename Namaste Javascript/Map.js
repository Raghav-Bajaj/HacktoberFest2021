const arr = [1, 3, 4, 3, 6]; // This is an array.

function double(x) {
  return x * 2; // Here we are returnig double of the respective array.
}

function triple(x) {
  return x * 3; // Here we are returning triple of the respective array.
}

function binary(x) {
  return x.toString(2); // Here we are converting in binary form.
}

const output = arr.map(binary);

console.log(output);
