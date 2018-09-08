var peoplelist = [{
    name: "Ivan",
    surname: "Ivanov",
    gender: "male",
    age: 30
},
    {
        name: "Sergey",
        surname: "Petrov",
        gender: "male",
        age: 30
    }];

var excluded = [{
    name: "Anna",
    surname: "Ivanova",
    gender: "female",
    age: 22
},
    {
        name: "Ivan",
        surname: "Korneev",
        gender: "male",
        age: 58
    }];

function excludeBy(peoplelist, excluded, field) {
    var users = peoplelist.filter(function (peoplelist_el) {

        var exclude = false;
        excluded.some(function (excluded_el) {

            if(peoplelist_el[field] === excluded_el[field]) {
                exclude = true;
                return true;
            }

            return false;
        });

        if(exclude) return false;
        return true;

    });

    return users;
}

console.log(excludeBy(peoplelist, excluded, 'name'));