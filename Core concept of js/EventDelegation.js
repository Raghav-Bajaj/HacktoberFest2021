//Event Delegation is acheived using Event Bubbling.

document.querySelector("#category").addEventListener("click", (e) => {
  console.log(e.target.id);
  if (e.target.tagName == "LI") {
    window.location.href = "/" + e.target.id;
  }
});

//Behaviour pattern can be achieved using Event Delegation

document.querySelector("#form").addEventListener("keyup", (e) => {
  console.log(e);
  if (e.target.dataset.uppercase != undefined) {
    e.target.value = e.target.value.toUpperCase();
  }
});
