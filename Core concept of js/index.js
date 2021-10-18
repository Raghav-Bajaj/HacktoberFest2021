let name = {
  firstName: "Akash",
  lastName: "kumar",
};

let printFullName = function (hometown, state) {
  console.log(
    this.firstName + " " + this.lastName + " from " + hometown + "," + state
  );
};

printFullName.call(name, "Phagwara", "Punjab");

let name2 = {
  firstName: "Roshan",
  lastName: "kumar",
};

//function borrowing

printFullName.call(name2, "siwan", "Bihar");

printFullName.apply(name2, ["siwan", "Bihar"]);

//bind method
let printMyname = printFullName.bind(name2, "Mumbai", "Maharahtra");
console.log(printMyname);
printMyname();
