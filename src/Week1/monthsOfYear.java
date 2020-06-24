package Week1;

import java.util.Scanner;

public class monthsOfYear {

    public static void main(String[] args) {

        System.out.println("\nEnter a month\n");


        Scanner sc = new Scanner(System.in); // initialise scanner
        String month = sc.next(); // read input from user

        // make sure it is in the right format. e.g, sePtEmbER -> September
        month = month.substring(0, 1).toUpperCase() + month.substring(1).toLowerCase();
        System.out.println(month);


        switch (month){
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                System.out.println("31");
                break;

            case "February":
                System.out.println("28, or 29 in a leap year");
                break;

            case "April":
            case "June":
            case "September":
            case "November":
                System.out.println("30");
                break;

            default:
                System.out.println("Invalid input");
        }
    }
}
