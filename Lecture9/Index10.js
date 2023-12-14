//  Scope determines the accessibility of variables , objects , and functions from different parts of the code

//  Function scope

//  Variables defined inside a function are not accesible (visible) from outside the function

let sum = 54; //Global Scope

function calsum(a,b){

    let sum = a+b;  // functio scope
    
}

console.log(sum);
calsum(5,5);



