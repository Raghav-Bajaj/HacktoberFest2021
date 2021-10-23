const arr = [2, 3, 5, 7, 8, 9, 3, 4];

function isOdd(x) {
  return x % 2; //returning odd
}

function isEven(x) {
  return x % 2 == 0; // returning even
}

const output = arr.filter(isEven);

console.log(output);

//Advance Example of filter

const users = [
  { firstName: "Akash", lastName: "kumar", age: "20", rollNo: "51" },
  { firstName: "Roshan", lastName: "kumar", age: "21", rollNo: "53" },
  { firstName: "Tarun", lastName: "singh", age: "21", rollNo: "68" },
  { firstName: "Harneet", lastName: "kaur", age: "19", rollNo: "69" },
  { firstName: "Rajvardhan", lastName: "rathore", age: "20", rollNo: "59" },
  {
    firstName: "Aditeyndra",
    lastName: "pratap singh",
    age: "20",
    rollNo: "42",
  },
];

const userAgeOutput = users
  .filter((user) => {
    return user.age < 21;
  })
  .map((user) => {
    return user.firstName;
  });

console.log(userAgeOutput);
