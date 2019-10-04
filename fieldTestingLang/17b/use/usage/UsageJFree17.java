package usage;

import org.apache.commons.lang3.StringEscapeUtils;

public class UsageJFree17 {
 
	public static void main(String[] args) {
		
		long startTime = System.nanoTime();
		try {
			String input = new StringBuilder("\ud842\udfb7").append("A").toString();
			StringEscapeUtils.escapeXml(input);
		}catch(Exception e) {}
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);

		
 
	}
 
}
