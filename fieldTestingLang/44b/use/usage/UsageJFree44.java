package usage;

import org.apache.commons.lang.NumberUtils;

public class UsageJFree44 {
 
	public static void main(String[] args) {
		
		String[] badInputs = new String[] { "l", "L", "f", "F", "junk", "bobL"};
        for(int i=0; i<badInputs.length; i++) {
            try {
                NumberUtils.createNumber(badInputs[i]);
            } catch (NumberFormatException e) {
                return; // expected
            }
        }	
 
	}
 
}
