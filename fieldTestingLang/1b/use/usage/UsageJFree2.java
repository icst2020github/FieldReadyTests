package usage;

import org.apache.commons.lang3.math.NumberUtils;

public class UsageJFree2 {
 
	public static void main(String[] args) {
		
		long startTime = System.nanoTime();
		try {
			NumberUtils.createNumber("0x80000000");
		} catch(Exception e) {}
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
		long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("Used memory is bytes: " + memory);
		
 
	}
 
}
