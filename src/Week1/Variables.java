package Week1;

//Puppy age example for variables, data types
public class Variables {
    public void pupAge() {
        int age = 0;
        age = age + 7;
        System.out.println("Puppy age is : " + age);
    }

    public static void main(String args[]) {
        Variables test = new Variables();
        test.pupAge();
    }
}