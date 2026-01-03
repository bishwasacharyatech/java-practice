//wap to demonstrate switch , break & jump statment in java
 import java.util.Scanner;  
public class switchCaseA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a number (1-5): ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;  
            case 5:
                System.out.println("thursday");
                break;
            default:
                System.out.println("Invalid selection! Please select a number between 1 and 5.");
                break;
        }

        System.out.println("day name printed successfully.");
        scanner.close();
    }    
}
