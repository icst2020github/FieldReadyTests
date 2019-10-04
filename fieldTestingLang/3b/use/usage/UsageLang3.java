package usage;

import org.apache.commons.lang3.math.NumberUtils;

public class UsageLang3 {
 
	public static void main(String[] args) {
		
		long startTime = System.nanoTime();
		try {
		NumberUtils.createNumber("3.40282354e+38");
		}catch(Exception e) {}
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);

 
	}
 
}
