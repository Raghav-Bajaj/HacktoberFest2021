var time = new Date();
console.log(time.getHours() + ":" + time.getMinutes() + ":" + time.getSeconds()
);

function login() {
    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;

    if (username == "widikidiw" && password == "123") {
        window.location = "assets/Success.html";
        return false;
    }
    else {
        alert('You must fill in the data correctly!');
        return false;
    }
}


