package usage;

import org.apache.commons.lang3.text.translate.NumericEntityUnescaper;

public class UsageJFree19 {
 
	public static void main(String[] args) {
		
		long startTime = System.nanoTime();
		try {
			NumericEntityUnescaper neu = new NumericEntityUnescaper();	
			neu.translate("Test &#");
		}catch(Exception e) {}
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
 
	}
 
}
