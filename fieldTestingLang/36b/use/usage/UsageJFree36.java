package usage;

import org.apache.commons.lang3.math.NumberUtils;

public class UsageJFree36 {
 
	public static void main(String[] args) {
		
		long startTime = System.nanoTime();
		try {
			NumberUtils.isNumber("2.");		
		}catch(Exception e) {
			
		}
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);

		
 
	}
 
}
