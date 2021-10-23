const arr = [4, 5, 6, 8, 9, 23, 54, 66, 90];

//Here we are finding the total sum of this given array.

function findSum(arr) {
  let sum = 0;
  for (let i = 0; i < arr.length; i++) {
    sum = sum + arr[i];
  }
  return sum;
}

console.log(findSum(arr));

//Now using reduce function

const output = arr.reduce((acc, curr) => {
  acc = acc + curr;
  return acc;
}, 0);

console.log(output);

//Here we are finding the maximum value

function findMax(arr) {
  let max = 0;
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] > max) {
      max = arr[i];
    }
  }
  return max;
}

console.log(findMax(arr));

//Now using reduce function

const findMaxOutput = arr.reduce((acc, curr) => {
  if (curr > acc) {
    acc = curr;
  }
  return curr;
}, 0);

console.log(findMaxOutput);

//Advance Example of reduce function

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

const userOutput = users.map((user) => {
  return user.firstName + " " + user.lastName;
});

const userAgeOutput = users.reduce((acc, curr) => {
  if (acc[curr.age]) {
    acc[curr.age] = ++acc[curr.age];
  } else {
    acc[curr.age] = 1;
  }
  return acc;
}, {});

console.log(userAgeOutput);
