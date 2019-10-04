package usage;

import org.apache.commons.lang.text.StrBuilder;

public class UsageJFree47 {
 
	public static void main(String[] args) {

		long startTime = System.nanoTime();
		try {
			StrBuilder sb = new StrBuilder();
			sb.appendFixedWidthPadRight(null, 10, '*');
		}catch(Exception e) {}
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
		

        
	}
 
}
