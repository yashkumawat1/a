function add(a,b)
{
    console.log("HEllo");
    console.log("HEllo");
    

    return a+b;

    //  after return statement no execution of the code

    console.log("HEllo2");
    console.log("HEllo2");
}


// console.log(add( add(2,3),5));
// console.log(add(4,4));



function isAdult(age)
{

    if(age>=18)
    {
        return "you are eligible";
    }
    else
    {
        return "You are not eligible";
    }
}


    console.log(isAdult(19));

