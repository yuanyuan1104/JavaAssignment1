package q5;

/**
 * Class Pack presents the process of encoding and decoding. 
 * <p>The class defines 5 final char variables which contain characters, with 
 * values chosen from the range A to I, and encodes them all as one int value. 
 * The program then decodes the value back into the 5 characters.</p>
 *
 * @author Zhang Yuanyuan
 * @version 2017-09-29
 */
public class Pack {
    /** Declare constant variable C1. */
        static final char C1 = 'I';
    /** Declare constant variable C2. */
        static final char C2 = 'F';
    /** Declare constant variable C3. */
        static final char C3 = 'E';
    /** Declare constant variable C4. */
        static final char C4 = 'B';
    /** Declare constant variable C5. */
        static final char C5 = 'A';
    /** Declare constant variable BASE. */
        static final int BASE = 56;
    /** Declare constant variable VALUE1_EXPO. */
        static final int VALUE1_EXPO = 4;
    /** Declare constant variable VALUE1_EXPO. */
        static final int VALUE2_EXPO = 3;
    /** Declare constant variable VALUE1_EXPO. */
        static final int VALUE3_EXPO = 2;
    /** Declare constant variable VALUE1_EXPO. */
        static final int VALUE4_EXPO = 1;
    /** Declare constant variable VALUE1_EXPO. */
        static final int VALUE5_EXPO = 0;

    /**
     * <p>Drives the program.</p>
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        // numeric value of the first char
        int value1;
        // numeric value of the second char
        int value2;
        // numeric value of the third char
        int value3;
        // numeric value of the fourth char
        int value4;
        // numeric value of the fifth char
        int value5;
        // encoded value of the 5 values used as “digits” in a base 56 number
        int encodedValue;
        // varible used to get the encoded value before decoding
        int encoded;
        // the first decoded value
        int decoded1;
        // the second decoded value
        int decoded2;
        // the third decoded value
        int decoded3;
        // the fourth decoded value
        int decoded4;
        // the fifth decoded vlaue
        int decoded5;
        // the first character converted from the first decoded value
        char c1;
        // the second character converted from the second decoded value
        char c2;
        // the third character converted from the third decoded value
        char c3;
        // the fourth character converted from the fourth decoded value
        char c4;
        // the fifth character converted from the fifth decoded value
        char c5;

        value1 = C1 - 'A' + 1;
        value2 = C2 - 'A' + 1;
        value3 = C3 - 'A' + 1;
        value4 = C4 - 'A' + 1;
        value5 = C5 - 'A' + 1;

        encodedValue = (int) (value1 * Math.pow(BASE, VALUE1_EXPO)) 
            + (int) (value2 * Math.pow(BASE, VALUE2_EXPO))
            + (int) (value3 * Math.pow(BASE, VALUE3_EXPO)) 
            + (int) (value4 * Math.pow(BASE, VALUE4_EXPO))
            + (int) (value5 * Math.pow(BASE, VALUE5_EXPO));
        
        encoded = encodedValue;

        decoded1 = encoded % BASE;
        encoded = encoded / BASE;
        decoded2 = encoded % BASE;
        encoded = encoded / BASE;
        decoded3 = encoded % BASE;
        encoded = encoded / BASE;
        decoded4 = encoded % BASE;
        encoded = encoded / BASE;
        decoded5 = encoded % BASE;

        c1 = (char) (decoded5 - 1 + 'A');
        c2 = (char) (decoded4 - 1 + 'A');
        c3 = (char) (decoded3 - 1 + 'A');
        c4 = (char) (decoded2 - 1 + 'A');
        c5 = (char) (decoded1 - 1 + 'A');
        
        System.out.println("Original: " + C1 + C2 + C3 + C4 + C5  
            + "\nEncoded: " + encodedValue
            + "\nDecoded: " + c1 + c2 + c3 + c4 + c5);
        System.out.println("Question five was called and ran sucessfully.");
    }

};
