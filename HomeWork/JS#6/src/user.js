// var user = new createNewUser();
// function createNewUser() {
//     this.firstName = prompt('What is your name?');
//     this.lastName = prompt('What is your last name?');
//     this.getLogin = function () {
//         return (this.firstName.charAt(0).toLowerCase() + this.lastName.toLowerCase());
//     };
// }
//     console.log(user.getLogin());

let userGet = new createNewUser();
function createNewUser() {
    this.firstName = prompt('What is your name?');
    this.lastName = prompt('What is your last name?');
    this.getLogin = function () {
        return (this.firstName.charAt(0).toLowerCase() + this.lastName.toLowerCase());
    };

}
alert(userGet.getLogin());

// var user = new createNewUser();
// function createNewUser(firstName, lastName) {
//
//     var firstName = prompt("Input your name", "");
//     var lastName = prompt("Input your lastName", "");
//     this.firstName = firstName;
//     this.lastName = lastName;
//     // var newUser = {
//     //     firstName: this.firstName,
//     //     lastName: this.lastName
//     // };
//     // console.log(newUser);
//
//     this.getLogin = function () {
//         return this.firstName.charAt(0).toLowerCase() + this.lastName.toLowerCase();
//     }
//     console.log(this.getLogin);
// }