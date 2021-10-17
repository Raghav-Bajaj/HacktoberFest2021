//By default false is meant by Event bubbling.
//Here the heirarchy will follow in upward direction.
//child --> parent --> grandparent  would be the heirarchy if child is clicked.

document.querySelector("#grandparent").addEventListener(
  "click",
  () => {
    console.log("Grandparent clicked");
  },
  false
);

document.querySelector("#parent").addEventListener(
  "click",
  (e) => {
    console.log("parent clicked");
    e.stopPropagation(); //As soon as stopPropagation is encountered it will stop thereby itself.
  },
  false
);

document.querySelector("#child").addEventListener(
  "click",
  () => {
    console.log("Child clicked");
  },
  false
);
