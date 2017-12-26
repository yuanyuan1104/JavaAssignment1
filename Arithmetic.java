package q3;
import java.util.Scanner;

/**
 * Class Arithmetic prints arithmetic results.
 * <p>This class reads two floating point numbers and prints their sum, 
 * difference, quotient, and product.</p>
 *
 * @author Zhang Yuanyuan
 * @version 2017-09-29
 */
public class Arithmetic {
    /**
     * <p>Drives the program.</p>
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        // the first value for user input
        double num1; 
        // the second value for user input
        double num2; 
        // sum to display for the two values
        double sum; 
        // difference to display for the two values
        double difference;
        // quotient to display for the two values
        double quotient;
        // product to display for the two values
        double product;  
        Scanner scan = new Scanner(System.in);
        System.out.println("please input the first floating point number: ");
        num1 = scan.nextDouble();
        System.out.println("please input the second floating point number: ");
        num2 = scan.nextDouble();
        sum = num1 + num2;
        difference = num1 - num2;
        quotient = num1 / num2;
        product = num1 * num2;
        System.out.println("the sum of the two numbers is: " + sum
            + "\nthe difference of the two numbers is: " + difference
            + "\nthe quotient of the two numbers is: " + quotient
            + "\nthe product of the two numbers is: " + product);
        scan.close();
        System.out.println("Question three was called and ran sucessfully.");
    }

};
