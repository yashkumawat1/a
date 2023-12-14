//  Todo Apps In Java Script

let todo = [];

let req = prompt("Please Enter Your request");


while(true)
{

    if(req == "quit"){

        console.log("Quiting app");
        break;
    }

    if(req == "list")
    {
        console.log("------------------");

     for(let i =0; i<todo.length; i++)
        {

            console.log(i , todo[i]);


        }

        console.log("------------------");



    }

    else if(req == "add")
    {

        let task =prompt("please Enter the task you want to add");
        todo.push(task);
        console.log("task Added");
    } 
    else if(req == "delete")
    {

        let idx =prompt("please Enter the task Index");
        todo.splice(idx , 1);
        console.log("Task Deleted");





    }

    else
    {

        console.log("Wrong Request");
    }


    
    req = prompt("Please Enter Your request");

}









