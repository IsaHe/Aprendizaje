package JavaLearning;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a hole number to divide");
            int x = scanner.nextInt();
    
            System.out.println("Enter a hole number to divide by");
            int y = scanner.nextInt();
    
            int z = x/y;
            System.out.println("resoult: "+z);
            
        } catch (ArithmeticException e) {
            System.out.println("You can not divide by 0");
        }
        catch(InputMismatchException e) {
            System.out.println("Please enter a number");
        }
        finally {   //To close scanners or files open usualy
            System.out.println("This will always execute");
            scanner.close();
        }        
    }
}
