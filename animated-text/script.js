const text = document.querySelector("h1");
const textValue = text.textContent;
const textSplit = textValue.split("");

text.textContent = "";

for (let i = 0; i < textSplit.length; i++) {
  text.innerHTML += `<span>${textSplit[i]}</span>`;
}

let char = 0;
let interval = setInterval(onTick, 50);

function onTick() {
  const spans = text.querySelectorAll("span")[char];
  spans.classList.add("fade");
  char++;

  if (char === textSplit.length) {
    complete();
    return;
  }
}

function complete() {
  clearInterval(interval);
  interval = null;
}
