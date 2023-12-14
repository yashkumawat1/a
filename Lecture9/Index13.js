let greet  = "Hello";

function changegreet()
{

    let greet  = "namaste";
    console.log(greet);
    function innerfunc()
    {
        console.log(greet);
    }
}

console.log(greet);
 changegreet(innerfunc());

changegreet();

































