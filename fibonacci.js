let i;
let fList = [];

fList[0] = 0;
fList[1] = 1;

for (i = 2; i <= 10; i++) {
  fList[i] = fList[i - 2] + fList[i - 1];
}

console.log("Fibonacci", fList.toString());
