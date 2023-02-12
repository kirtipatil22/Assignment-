/* Q.6] Take input of age of 3 people by user and determine oldest & youngest among them. */
let age1 = prompt("Enter the First age");
age1 = Number.parseInt(age1);
let age2 = prompt("Enter the Second age");
age2 = Number.parseInt(age2);
let age3 = prompt("Enter the Third age");
age3 = Number.parseInt(age3);
// For highest age
if (age1>age2)
{
  if (age1>age3)
  {
    console.log("\n Age %d is highest.", age1);
  }
  else
  {
    console.log("\n Age %d is highest.", age3);
  }
}
else
{
  if (age2>age3)
  {
    console.log("\n Age %d is highest.", age2);
  }
  else
  {
    console.log("\n Age %d is highest.", age3);
  }
}
// for lowest age
if (age1<age2)
{
  if (age1<age3)
  {
    console.log("\n Age %d is lowest.", age1);
  }
  else
  {
    console.log("\n Age %d is lowest.", age3);
  }
}
else
{
  if (age2<age3)
  {
    console.log("\n Age %d is lowest.", age2);
  }
  else
  {
    console.log("\n Age %d is lowest.", age3);
  }
}