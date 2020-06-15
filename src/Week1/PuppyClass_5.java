package Week1;

// Puppy age example for variables and data types as well as an intro to if statements and methods

public class PuppyClass_5 {

    public static void main(String args[]) {

        String dogName = "Rex"; // Strings must go in brackets
        int dogAge = 2;
        double dogWeight = 4.3;
        String dogBreed = "Labrador";
        boolean dogGender = false; // we are going by true = male, false = female

        puppy(dogName, dogAge, dogWeight, dogBreed, dogGender);

        // The variables names can also be the same as the variable names in the method
        String name = "Spike"; // Strings must go in brackets
        int age = 3;
        double weight = 4.2;
        String breed = "Poodle";
        boolean gender = true;

        puppy(name, age, weight, breed, gender);

        // We can also just pass in variables directly without having to declare them first

        puppy("Taylor", 4, 5.6, "Bulldog", false);
    }

    public static void puppy(String name, int age, double weight, String breed, boolean gender) { // gender: true = male, false = female
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Breed: " + breed);
        System.out.print("Gender: ");

        /*
        type boolean - true or false
         */
        if(gender) System.out.println("Male");
//        if(gender == true) System.out.println("Male");

        else if(!gender) System.out.println("Female");
//        else if(gender == false) System.out.println("Female");

        // We can also do it all together in the one print statement
//        System.out.println("Name: " + name + "Age: " + age + "Weight: " + weight);

        System.out.print("\n"); // prints a new line

        // Or we can do this as the 'ln' in println prints a new line
//        System.out.println();
    }
}