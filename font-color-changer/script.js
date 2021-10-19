const title = document.querySelector(".title");
const colorLinks = document.querySelectorAll(".color-links");

console.log(colorLinks);

colorLinks.forEach((colorLink) => {
  colorLink.addEventListener("click", () => {
    color = colorLink.getAttribute("value");

    if (color === "red") {
      title.style.color = "#cf4141";
    } else if (color === "orange") {
      title.style.color = "#cf6b41";
    } else if (color === "yellow") {
      title.style.color = "#cfb841";
    } else if (color === "green") {
      title.style.color = "#66cf41";
    } else if (color === "blue") {
      title.style.color = "#41becf";
    } else {
      window.alert("Invalid color has selected");
    }
  });
});
