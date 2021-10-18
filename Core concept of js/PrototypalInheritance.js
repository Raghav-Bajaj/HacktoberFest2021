//Everything in a javascript is nothing but an object.
let arr = ["Akash", "Roshan"];
let object = {
  name: "Akash",
  city: "Phagwara",
  getIntro: function () {
    console.log(this.name + " " + this.city);
  },
};

let object2 = {
  name: "Harneet",
};

object2.__proto__ = object;
