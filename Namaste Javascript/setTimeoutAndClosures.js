//This will print Hello world and after 1 second it will print 1000.

function x() {
  var x = 100;
  setTimeout(() => {
    console.log(x);
  }, 1000);
  console.log("Hey there! ");
}
x();

//This will print 1 to 5 after 1 sec each.

function x() {
  for (let i = 1; i <= 5; i++) {
    // let has a block scope and creates new copy of i every time.
    setTimeout(() => {
      console.log(i);
    }, i * 1000);
  }
}
x();

//This works same as above

function x() {
  for (var i = 1; i <= 5; i++) {
    function close(x) {
      setTimeout(() => {
        console.log(x);
      }, x * 1000);
    }
    close(i);
  }
}
x();
