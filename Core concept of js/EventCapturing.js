//Here true means a flag which is set to true and event cpaturing will happen.
//Here the heirarchy will follow downward manner .
// grandparent --> parent --> child  would be hirarchy if child is clicked.

document.querySelector("#grandparent").addEventListener(
  "click",
  () => {
    console.log("Grandparent clicked");
  },
  true
);

document.querySelector("#parent").addEventListener(
  "click",
  () => {
    console.log("parent clicked");
  },
  true
);

document.querySelector("#child").addEventListener(
  "click",
  () => {
    console.log("Child clicked");
  },
  true
);
