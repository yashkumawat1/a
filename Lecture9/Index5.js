//  Function return the table ;;

function table(num)
{

    for(let i =1; i<=10; i++)
    {

      console.log( num ,"*" ,i, "==", num*i);  
       

    }

}

// table(5);


let nums = prompt("Enter the number Which Table are you want to show on the console Window");
table(nums);
