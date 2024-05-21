import java.util.Scanner;
public class ScannerDemo1{
    // Java program to understand the use of Scanner in Java
    public static void main(String args[]){

        // Using Scanner for Getting Input from User
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String string = sc.nextLine();
        System.out.println("You entered string: " +string);

        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println("You entered integer: " +num);

        System.out.println("Enter a float number");
        float fnum = sc.nextFloat();
        System.out.println("You entered float: " +fnum);
    }
}