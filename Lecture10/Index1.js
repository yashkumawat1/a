//  This Keyword in JavaScript
//  This keyword refers to an object that is Executing the current piece of code
const student = {

    name : "yash",
    age : 23,
    eng : 95,
    math : 93,
    phy : 97,
    getAvg() {
        console.log(this);

        let avg = (this.eng + this.math + this.phy) /3;
        console.log(avg);

    }
}

// console.log(student.getAvg());

function getAvg()
{
    console.log(this);
}

console.log(getAvg());