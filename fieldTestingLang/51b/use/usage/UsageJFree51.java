package usage;

import org.apache.commons.lang.BooleanUtils;

public class UsageJFree51 {
 
	public static void main(String[] args) {

		long startTime = System.nanoTime();
		try {
			BooleanUtils.toBoolean("tru");
		}catch(Exception e) {}
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
		
		
	}
 
}
