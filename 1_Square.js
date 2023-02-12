/*Q.1] Take value of length & breadth of a rectangle from user and check if it's square */
let length = prompt("Enter the length: ");
length = Number.parseInt(length);
let breadth = prompt("Enter the breadth: ");
breadth = Number.parseInt(breadth);
if (length==breadth) 
{
  console.log("the shape is a sqauare");
}
else 
{
  console.log("The shape is a rectangle");
}
