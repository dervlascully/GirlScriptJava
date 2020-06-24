package Week1;

public class largestNumber {

    public static void main(String[] args) {
        double x = 2.0, y = 3.4, z = 1.3;

        if(x > y && x > z)
        {
            System.out.println("The Largest number is: " + x);
        }
        else if(y > z) // we know that x <= y
        {
            System.out.println("The Largest number is: " + y);
        }
        else // we know that x <= y and y <= z, so z > x and y
        {
            System.out.println("The Largest number is: " + z);
        }
    }

}
