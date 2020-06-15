package Week1;

public class dataTypes_3 {

    public static void main(String[] args) {

        /****** What can we do with these variables? ******/

        int x = 11;             // x = 11

        // Addition
        int y = x + 2;          // y = 13

        // Multiplication
        int z = x * 3;          // z = 33

        // Division
        int w = x / 2;          // w = 5. w is an integer so w == 5

        // Type Casting
        // if we want to get the exact value (ie double) of x / 2 we first have to typecast x to double

        double k = (double)x;    // Type Casting: newDataType newVariableName = (newDataType) oldVariableName
        double v = k / 2;       // v == 5.5

        // Boolean
        boolean u = (y == 17);
        // if y == 17, u == true
        // if y != 17, u == false

        // Strings
        String a = "Dervla";
        String b = "Scully";
        String c = a + b;           // c = "DervlaScully"
        String d = a + " " + b;     // d = "Dervla Scully"


        System.out.println(c);
        System.out.println(d);
        System.out.println(x + " " + y + " " + z + " " + w + " " + v + " " + u);



        /****** Or we can manipulate the variables directly, instead of making new variables ******/

        // above we declared int x = 11, so currently the variable x holds the integer value 11

        // Addition
        x = x + 2;
        // or we can do:
        x += 2;

        // Multiplication
        x = x*2;
        //or
        x *= 2;

        // Division
        x = x / 4;
        x /= 4;



    }
}
