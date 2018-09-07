const getAge = () => {
    let currentDate = new Date();
    let year = currentDate.getFullYear();
    return year - new Date(birthday).getFullYear();
};

const getZodiacSign = () => {
    let month = new Date(birthday).getMonth();
    let day = new Date(birthday).getDate();
    let sign;

    if ((month == 11 && day >= 22) || (month == 0 && day <= 19)) return sign="Capricorn";
    else if ((month == 0 && day >= 20) || (month == 1 && day <= 18)) return sign="Aquarius";
    else if ((month == 1 && day >= 19) || (month == 2 && day <= 20)) return sign="Pisces";
    else if ((month == 2 && day >= 21) || (month == 3 && day <= 20)) return sign="Aries";
    else if ((month == 3 && day >= 21) || (month == 4 && day <= 20)) return sign="Taurus";
    else if ((month == 4 && day >= 21) || (month == 5 && day <= 20)) return sign="Gemini";
    else if ((month == 5 && day >= 21) || (month == 6 && day <= 22)) return sign="Cancer";
    else if ((month == 6 && day >= 23) || (month == 7 && day <= 22)) return sign="Leo";
    else if ((month == 7 && day >= 23) || (month == 8 && day <= 23)) return sign="Virgo";
    else if ((month == 8 && day >= 24) || (month == 9 && day <= 23)) return sign="Libra";
    else if ((month == 9 && day >= 24) || (month == 10 && day <= 21)) return sign="Scorpio";
    else if ((month == 10 && day >= 22) || (month == 11 && day <= 21)) return sign="Sagittarius";
};

let birthday = prompt('What is the date of your birthday? (mm.dd.yyyy)');
birthday = Date.parse(birthday);

alert('Your age is ' + getAge());
alert('Your zodiac is ' + getZodiacSign());

