package Week1;

public class PositiveNumbers_6 {

    public static void main(String[] args) {

        double number = 12.3;

        // true if number is less than 0
        if (number < 0.0)
            System.out.println(number + " is a negative number.");

            // true if number is greater than 0
        else if ( number > 0.0)
            System.out.println(number + " is a positive number.");

            // if both test expression is evaluated to false
        else
            System.out.println(number + " is 0.");
    }




    // we can also make this into a method

    public static void positive(double number){
        // true if number is less than 0
        if (number < 0.0)
            System.out.println(number + " is a negative number.");

            // true if number is greater than 0
        else if ( number > 0.0)
            System.out.println(number + " is a positive number.");

            // if both test expression is evaluated to false
        else
            System.out.println(number + " is 0.");
    }
}