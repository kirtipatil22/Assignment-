/* Q.10] Write program using Switch-case statement for Months of Year.  */
let ch = 'y', month;
while (ch == 'y') {
  let month = prompt("\nEnter a no for Months of Year:");
  month = Number.parseInt(month);
  switch (month) {
    case 1:
      console.log("\n It's January.");
      break;
    case 2:
      console.log("\n It's February.");
      break;
    case 3:
      console.log("\n It's March.");
      break;
    case 4:
      console.log("\n It's April.");
      break;
    case 5:
      console.log("\n It's May.");
      break;
    case 6:
      console.log("\n It's June.");
      break;
    case 7:
      console.log("\n It's July.");
      break;
    case 8:
      console.log("\n It's August.");
      break;
    case 9:
      console.log("\n It's September.");
      break;
    case 10:
      console.log("\n It's October.");
      break;
    case 11:
      console.log("\n It's November.");
      break;
    case 12:
      console.log("\n It's December.");
      break;
    default:
      console.log("\n Invalid Input.");
      break;
  }
  ch = prompt("\n Do you want to continue? y/n = ");
}