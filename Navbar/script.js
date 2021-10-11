// ----------------------------------------------Final Scripts-----------------------------------------------------

// --------------Scripts for navbar-responsive---------------------
let menuOpen = false

function showElement(query) {
  document.querySelector(query).style.visibility = "visible";
  document.querySelector(query).style.display = "block";
}
function hideElement(query) {
  document.querySelector(query).style.visibility = "collapse";
  document.querySelector(query).style.display = "none";
}
function openMenu() {
  showElement(".nav-container ul");
  showElement(".nav-container .close");
  menuOpen = true;
}
function closeMenu() {
  hideElement(".nav-container ul");
  hideElement(".nav-container .close");
  menuOpen = false;
}
// document.querySelector(".hamburger").addEventListener("click", openMenu)
// document.querySelector(".close").addEventListener("click", closeMenu);


function toggleHam(e) {
  const ul = document.querySelector(".nav-container ul")
  const a = document.querySelectorAll(".nav-container ul li a");
  const hamburger = document.querySelector(".hamburger");
  if (!menuOpen && hamburger.contains(e.target)) {
    console.log("Opening Menu")
    openMenu()
  }
  else if (menuOpen && !ul.contains(e.target)) {
    console.log("Closing Menu")
    closeMenu()
  }
  else{
    return null
  }
}
window.addEventListener("click",toggleHam)

document.querySelectorAll('.nav-container ul li a').forEach((a) => {
  a.addEventListener("click", () => {
    if (window.innerWidth <= 768)
      console.log("Closing Menu for small device")
      closeMenu()
  })
})
