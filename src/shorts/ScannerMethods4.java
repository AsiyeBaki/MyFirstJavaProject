package shorts;
import java.util.Scanner;
public class ScannerMethods4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //Enter

        System.out.println("Enter your age: ");
        int age = input.nextInt(); // 28 + Enter

        input.nextLine();

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Age is : " + age);
        System.out.println("Full name is : " + fullName);





    }
}
