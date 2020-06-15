package Week1;

public class LeapYearOperators_7 {

    public static void main(String[] args) {

        int year = 1900;
        boolean leap = false;

        /* When is a year a leap year? - divisible by 4 and 100 and 400
        https://docs.microsoft.com/en-us/office/troubleshoot/excel/determine-a-leap-year

        To determine whether a year is a leap year, follow these steps:
        1.  If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
        2.  If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
        3.  If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
        4.  The year is a leap year (it has 366 days).
        5.  The year is not a leap year (it has 365 days).
         */

        /*
        How do we know if a number is divisible by another number? We use modular arithmetic.
        if 1000 is divisible by 2 then 1000 mod 2 is equal to 0 (ie no remainder after division)
        In java we use '%' for mod, so 1000 mod 2 is 100 % 2

         */

        if(year % 4 == 0) // the year is divisible by 4
        {
            if( year % 100 == 0) // the year is divisible by 100 (and by 4)
            {
                // year is divisible by 400 (and by 100 and by 4. Hence, it is a leap year)
                if ( year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;

        if(leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}
