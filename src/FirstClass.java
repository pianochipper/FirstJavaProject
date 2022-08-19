import java.sql.SQLOutput;

public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("I'm learning!\nKeep it up!");

        int numDwarves; // instantiation - "make me a variable"
        numDwarves = 7; // initialization - "give me a value"

        int numStooges = 3; // instantiation and initialization both

        System.out.println("There are "+numDwarves+" dwarves in my cottage.");

        System.out.println("At first, there were "+numStooges+ " stooges.");

        numStooges = numStooges + 1;
        numStooges++;

        System.out.println("Now, with Shem, there are "+numStooges+" stooges.");


    }

}
