//  Lexical Scope in JavaScript
//   A variable defined outside a function can be accesible inside another function defined after the variable declaration
//  The Oppsite is not True 

function outerfunc()
{

    let x = 5;
    let y = 6;

    
    function innerfunc()
    {

        console.log(x);


    }

    outerfunc();
}