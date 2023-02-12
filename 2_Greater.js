/*Q 2] take two int values from user & print gretest among them.*/
let a = prompt("Enter first value: ");
a = Number .parseInt(a);
let b = prompt("Enter the second value:");
b= Number.parseInt(b);
if (a>b)
{
  console.log("%d is greater than %d",a,b);
}  
else
{
  console.log("%d is greater than %d",b,a);
}
  
