package q1;
import java.util.Scanner;

/**
 * Class Change represents monetary value with bills and coins.
 * <p>The class prompts for and reads a double value representing a monetary 
 * amount, then determine the fewest number of each bill and coin needed to 
 * represent that amount starting with the highest.</p>
 *
 * @author Zhang Yuanyuan
 * @version 2017-09-29
 */
public class Change {
    /**Declare constant variable TEN_DOLLAR.*/
        static final int TEN_DOLLAR = 10;
    /**Declare constant variable FIVE_DOLLAR.*/
        static final int FIVE_DOLLAR = 5;
    /**Declare constant variable TWO_DOLLAR.*/
        static final int TWO_DOLLAR = 2; 
    /**Declare constant variable QUARTER.*/
        static final double QUARTER = 0.25; 
    /**Declare constant variable DIME.*/
        static final double DIME = 0.1; 
    /**Declare constant variable NICKLE.*/
        static final double NICKLE = 0.05; 
    /**Declare constant variable PENNY.*/
        static final double PENNY = 0.01; 
    /**
     * <p>Drives the program.</p>
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        // a monetary value for input
        double inputValue;
        // number of ten dollar bills
        int tenDollar;
        // number of five dollar bills
        int fiveDollar;
        // number of two dollar bills
        int twoDollar;
        // number of quarters
        int quarter;
        // number of dimes
        int dime; 
        // number of nickles
        int nickle;
        // number of pennies
        int penny;  
        Scanner scan = new Scanner(System.in);
        System.out.println("please input a monetary value: ");
        inputValue = scan.nextDouble();
        tenDollar = (int) inputValue / TEN_DOLLAR;
        inputValue %= TEN_DOLLAR; 
        fiveDollar = (int) inputValue / FIVE_DOLLAR;
        inputValue %= FIVE_DOLLAR;
        twoDollar = (int) inputValue / TWO_DOLLAR;
        inputValue %= TWO_DOLLAR;
        quarter = (int) (inputValue / QUARTER);
        inputValue %= QUARTER;
        dime = (int) (inputValue / DIME);
        inputValue %= DIME;
        nickle = (int) (inputValue / NICKLE);
        inputValue %= NICKLE;
        penny = (int) (inputValue / PENNY);
        System.out.println("the equivalent monetary amount is: \n" 
            + tenDollar + " ten dollar bills\n" 
            + fiveDollar + " five dollar bills\n"
            + twoDollar + " two dollar bills\n" + quarter + " quarters\n"
            + dime + " dimes\n" + nickle + " nickles\n" + penny + " pennies");
        scan.close();
        System.out.println("Question one was called and ran sucessfully.");
    }

};
