package Week1;

public class PositiveNumbers_6 {

    public static void main(String[] args) {

        parity(6);
        parity(7);

    }

    public static void parity(int number){
        if(number%2 == 0)
            System.out.println("Even");
        else{
            System.out.println("Odd");
        }
    }




//    public static void positiveNumber(double number){
//
//        // true if number is less than 0
//        if (number < 0.0)
//            System.out.println(number + " is a negative number.");
//
//
//            // true if number is greater than 0
//        else if ( number > 0.0)
//            System.out.println(number + " is a positive number.");
//
//            // if both test expression is evaluated to false
//        else
//            System.out.println(number + " is 0.");
//
//    }

    public static String positiveNumber(double number){

        // true if number is less than 0
        if (number < 0.0)
            return "negative";


            // true if number is greater than 0
        else if ( number > 0.0)
            return "positive";

            // if both test expression is evaluated to false
        else
            return "zero";

    }


}

