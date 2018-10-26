package fracCalc;
import java.util.*;
public class FracCalc {

    public static void main(String[] args) 
    {
        // TODO: Read the input from the user and call produceAnswer with an equation
    	Scanner fract = new Scanner(System.in);
    	System.out.println("Enter the operation:");
    	System.out.println(produceAnswer(fract.nextLine()));
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input) { 
        // TODO: Implement this function to produce the solution to the input
        String fract1 = "";
        String fract2 = "";
        String oper = "";
    	for (int i = 0; i < input.indexOf(" "); i++) {
        	fract1 = fract1 + input.charAt(i);
        }

    	oper = oper + (input.charAt(input.indexOf(" ") + 1));
    	for (int i = input.indexOf(" ") + 3; i < input.length(); i++) {
    		fract2 = fract2 + input.charAt(i);
    	}
        return fract2;
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}