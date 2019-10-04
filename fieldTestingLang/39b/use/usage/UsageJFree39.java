package usage;

import org.apache.commons.lang3.StringUtils;

public class UsageJFree39 {
 
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		try {
			StringUtils.replaceEach("aba", new String[]{"a", "b"}, new String[]{"c", null});	
		}catch(Exception e) {
			
		}
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
		
		
	}
 
}
