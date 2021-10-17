//This is normal function without throttling
//Here throttling is not used here so when window resize event is fired many api's call will be fired .
//This will lead to webpage freeze.
// To stop this we have better function in which throttling is used.
const normalFunc = () => {
  console.log("Normal Function");
};

normalFunc();

//window.addEventListener("resize", normalFunc);

//This is our better logger function in which Throttling is used .
//Here we can see in each window resize api call is not fired .
//It is fired after  a given limit (here 1000ms) so that our system doesnt freeze.

const loggerFunc = () => {
  console.log("Throttled function");
};

loggerFunc();

const throttle = (fn, limit) => {
  let flag = true;
  return function () {
    let context = this;
    let args = arguments;
    if (flag) {
      fn.apply(context, args);
      flag = false;
      setTimeout(() => {
        flag = true;
      }, limit);
    }
  };
};

const betterLoggerFunction = throttle(loggerFunc, 1000);

window.addEventListener("resize", betterLoggerFunction);
