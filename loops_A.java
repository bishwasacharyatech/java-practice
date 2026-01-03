//wap using for loops,nested for loops, while & do while loop in java
public class loops_A {
    public static void main(String[] args) {
        // for loop
        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // nested for loop
        System.out.println("\nNested For Loop:");
        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 30; j++) {
                System.out.println("Outer Loop Iteration: " + i + ", Inner Loop Iteration: " + j);
            }
        }

        // while loop
        System.out.println("\nWhile Loop:");
        int count = 1;
        while (count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }

        // do-while loop
        System.out.println("\nDo-While Loop:");
        int num = 1;
        do {
            System.out.println("Number: " + num);
            num++;
        } while (num <= 5);
    }    
}
