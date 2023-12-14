//  Higher Order Function in JavaScript

//  A function that does one or both :

//   takes one or multiple function  as arguments'
// Returns a Function


    function multiplegreet(func , count)    // higher 
    {

        for(let i = 1; i<=count; i++)
        {

            console.log(i);
            func();




        }

    }


let greet =  function(){
    console.log("Hello Ji kese ho app sabb");


}

// multiplegreet(greet , 59);
multiplegreet(function() {console.log("namaste")},5);


