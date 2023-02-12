/* Q.4] A company decided to give bonus of 10% to employee if their time of service is more than 5 years. Ask user for their salary per month, years of service and print net bonus and total salary.*/
let bonus, salary, tsalary;
let service = prompt("Enter years of service");
service = Number.parseInt(service);
if (service >= 5) {
  salary = prompt("Enter your salary");
  salary = Number.parseInt(salary);
  if (salary <= 100000 && salary >= 1000) {
    bonus = salary * 0.1;
    console.log("\n Bonus allowed = %d", bonus);
    tsalary = salary + bonus;
    console.log("\n Total salary = %d", tsalary);
  }
  else {
    console.log("Invalid Input.");
  }
}
else {
  salary = prompt("Enter your salary");
  salary = Number.parseInt(salary);
  if (salary <= 100000 && salary >= 1000) {
    bonus = salary * 0.05;
    console.log("\n Bonus allowed = %d", bonus);
    tsalary = salary + bonus;
    console.log("\n Total salary = %d", tsalary);
  }
  else {
    console.log("Invalid Input.");
  }
}