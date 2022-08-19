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



//        int a = 0;
//        while (a < 100)
//        {
//            System.out.print(a + "--> ");
//            a = a + 2;
//            if (a == 32)
//            {
//                System.out.println("It's 32.");
//                // break;
//                continue;
//            }
//            System.out.println(a);

        for (int x = 1; x < 30; x = x + 2)
        {
            System.out.println(x+\t);
            for (int i=0; i<6; i++) {
                System.out.print(("*"));
            }
            System.out.println("");
        }
        System.out.println("/nDone.");
    }

}
