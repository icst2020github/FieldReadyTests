package usage;

import org.apache.commons.lang3.StringUtils;

public class UsageJFree14 {
 
	public static void main(String[] args) {	
		
		long startTime = System.nanoTime();
		StringUtils.equals("foo","foo");		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
 
	}
 
}
