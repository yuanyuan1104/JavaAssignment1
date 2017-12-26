package q2;
import java.util.Scanner;

/**
 * Class SecondConvert converts seconds to hh:mm:ss format.
 * <p>The class reads an integer number in from the user via the prompt.That 
 * integer value is a value in seconds. Convert the seconds into hours, 
 * minutes and seconds in the format hh:mm:ss.</p>
 *
 * @author Zhang Yuanyuan
 * @version 2017-09-29
 */
public class SecondsConvert {
    /**Declare constant variable HOUR_SECONDS.*/
        static final int HOUR_SECONDS = 3600;
    /**Declare constant variable MINUTE_SECONDS.*/
        static final int MINUTE_SECONDS = 60;
    /**
     * <p>Drives the program.</p>
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        // value for seconds input
        int inputSeconds; 
        // hours to disply after conversion
        int hours;
        // minutes to display after conversion
        int minutes; 
        // seconds to display after conversion
        int seconds; 
        Scanner scan = new Scanner(System.in);
        System.out.println("please input the an integer value for seconds: ");
        inputSeconds = scan.nextInt();
        hours = inputSeconds / HOUR_SECONDS;
        inputSeconds %= HOUR_SECONDS;
        minutes = inputSeconds / MINUTE_SECONDS;
        inputSeconds %= MINUTE_SECONDS;
        seconds = inputSeconds;
        System.out.println("the hh:mm:ss format of the seconds is: "
            + hours + ":" + minutes + ":" + seconds);
        scan.close();
        System.out.println("Question two was called and ran sucessfully.");
    }

};
