class ControlFlow {

  public static void main (String[] args) {
    // int n = 1;
    // int twoPowerN = 1;

    // while (n < 10) {
    //   System.out.println(n + "and" + (n+10));
    //   n++;
    // }

    // while (n < 10) {
    //   twoPowerN *= 2;
    //   System.out.println(n + "and" + (twoPowerN));
    //   n++;
    // }

    // for(int n = 1; n < 10; n++) {
    //   twoPowerN *= 2;
    //   System.out.println(n + " and " + (n+10) + " and " + (twoPowerN));
    // }

    // Preference: I don't mind which way I use.
    // I think I prefer for loop for the initialization, condition and increment all being on 1 line

    // ------------------------------------------------------------------------------------------

    // int dayNumber = 5;
    // String dayString = "";
    // if (dayNumber <= 5) {
    //   System.out.println("It is a weekday!");
    // }
    // else {
    //   System.out.println("It is the weekend! Whoop!");
    // }
    // switch (dayNumber) {
    //   case 1: dayString = "Weekday";
    //   case 2: dayString = "Weekday";
    //   case 3: dayString = "Weekday";
    //   case 4: dayString = "Weekday";
    //   case 5: dayString = "Weekday";
    //             break;
    //   case 6: dayString = "Weekend! Whoop!";
    //   case 7: dayString = "Weekend! Whoop!";
    // }
    // System.out.println(dayString);

    // for(int day = 1; day <= 7; day++) {
    //   if (day <= 5) {
    //     System.out.println("It is a weekday!");
    //   }
    //   else {
    //     System.out.println("It is the weekend! Whoop!");
    //   }
    // }

    // ------------------------------------------------------------------------------------------


    for (int year = 1900; year <= 2021; year++) {
      if (year % 4 == 0 && (year % 100 != 0 | year % 400 == 0)) {
        System.out.println(year + " is a leap year!");
      }
      else {
        System.out.println(year + " is NOT a leap year...");
      }
    }


  }

}
