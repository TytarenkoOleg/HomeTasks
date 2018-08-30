var user = new createNewUser();
function createNewUser(firstName, lastName) {
    this.firstName = prompt('What is your name?');
    this.lastName = prompt('What is your last name?');
    this.getLogin = function () {
        return (this.firstName.charAt(0).toLowerCase() + this.lastName.toLowerCase());
    }
    console.log(this.getLogin);
}