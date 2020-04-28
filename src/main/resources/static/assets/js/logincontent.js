var loginForm ;
var passForm ;
var loginButton = document.getElementById("loginButton");




    function getLoginPassword()
    {

        loginForm = document.getElementById("login").value;
        passForm = document.getElementById("password").value;

            console.log(loginForm);
            console.log(passForm);
    }

        loginButton.onclick = function () {getLoginPassword()};

