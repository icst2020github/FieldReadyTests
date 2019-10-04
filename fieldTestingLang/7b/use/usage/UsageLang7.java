package usage;

import org.apache.commons.lang3.math.NumberUtils;

public class UsageLang7 {
 
	public static void main(String[] args) {		
		
		long startTime = System.nanoTime();
		NumberUtils.createNumber("--1.1E-700F");
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
 
	}
 
}
