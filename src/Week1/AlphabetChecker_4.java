package Week1;

public class AlphabetChecker_4 {

    public static void main(String[] args) {

        // Every character (a, b, c, ....., 1, 2, 3, ...., *, &, %) refers to a specific integer between 0 and 127
        // ASCII Table: http://www.asciitable.com see decimal number & character
        // ASCII - American Standard Code for Information Interchange - a character encoding standard for electronic communication

        char c = '*'; // 42 in ASCII

        // Is this character in the alphabet?, ie in a, b, c, ....., x, y, z

        // The ascii values are in order so a, b, ..., z is 97, 98, ..... , 122
        // Capital letters are A, B, ... , Z : 65, 66, ... , 90

        // we can check if the chacater is between a and z or between A and Z
        // if it is it is in the alphabet
        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println(c + " is an alphabet.");

        // if it is not then it is not in the alphabet
        else
            System.out.println(c + " is not in the alphabet.");

        // using our method:
        System.out.println(inAlphabet('k'));
        System.out.println(inAlphabet('4'));
        System.out.println(inAlphabet('&'));
    }

    // We can put this in a method so that we can reuse the code for lots of characters
    // returns true or false (boolean)
    public static boolean inAlphabet(char ch){
        if( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            return true;

        return false;
    }
}
