let max_num  = prompt("Enter the maximum Number");

let randnum = Math.floor( Math.random()* max_num);

console.log(randnum);

while(true)
{

    let guess  = prompt("Enter the guess  number");

    if(guess == randnum)
    {

        console.log("Yaa Your Guesing number is Right");
        break;
    }
    else if(guess > randnum)
    {
        prompt("you guess bigger number");
    }
    else if(guess < randnum)
    {

        prompt("You guess lower number");


    }
    

    else if(guess == "quit")
    {
        console.log("Bro You leave The Match");
        break;


    }
    



    

    // guess  = prompt("Enter the guess  number");

    


}


