//   Array Refrences in Java Script 


//  Refrence means Address in Memory


let arr = [1,2];
let prr;
let arrcpy = arr;
arrcpy.push(3);
console.log(arrcpy);
console.log(arr);

if(arr === arrcpy)
{

    console.log(true);
}
else
{
    console.log(false);
}