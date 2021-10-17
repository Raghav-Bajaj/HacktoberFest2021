//Debouncing in javascript

let counter = 0;

const getData = () => {
  console.log("Fetching data", counter++);
};

const debouncing = function (fn, d) {
  let timer;
  return function () {
    let context = this;
    args = arguments;
    clearTimeout(timer);
    timer = setTimeout(() => {
      getData.apply(context, arguments);
    }, d);
  };
};

const betterFunction = debouncing(getData, 300);
