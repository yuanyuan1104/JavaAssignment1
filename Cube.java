package q4;
import java.util.Scanner;

/**
 * Class Cube prints the cube's volume and surface area.
 * <p>This class prompts for and reads an integer representing the length of 
 * a cube's side, then prints the cube's volume and surface area.</p> 
 *
 * @author Zhang Yuanyuan
 * @version 2017-09-29
 */
public class Cube {
    /**Declare constant variable PLANE.*/
        static final int PLANE = 6;
    /**Declare constant variable VOLUME_COEFFICIENT.*/
        static final int VOLUME_COEFFICIENT = 3;
    /**Declare constant variable AREA_COEFFICIENT.*/
        static final int AREA_COEFFICIENT = 2;
    /**
     * <p>Drives the program.</p>
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        // length of a cube's side for user input
        int sideLength; 
        // volume to display for the cube
        double volume;
        // area to diaplay for the cube
        double area;
        Scanner scan = new Scanner(System.in);
        System.out.println("please input an integer value for the "
            + "length of a cube's side: ");
        sideLength = scan.nextInt();
        volume = Math.pow(sideLength, VOLUME_COEFFICIENT);
        area = PLANE * Math.pow(sideLength, AREA_COEFFICIENT);
        System.out.println("the cube's volume is: " + volume
            + "\nthe cube's area is: " + area);
        scan.close();
        System.out.println("Question four was called and ran sucessfully.");
    }

};
