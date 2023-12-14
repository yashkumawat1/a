function dice()
{

    let num = prompt("enter the number");
   let roll  = Math.floor( Math.random(num)*6)+1;
   console.log(roll);
   


}

dice();