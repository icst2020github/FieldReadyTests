package usage;

import org.apache.commons.lang3.StringUtils;

public class UsageJFree20 {
	
	private static final Object[] NULL_TO_STRING_LIST = {
			new Object(){
				@Override
	    		public String toString() {
	    			return null;
	    		}
	    	}
	    };
 
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		try {
			StringUtils.join(NULL_TO_STRING_LIST,'/', 0, 1);
		}catch(Exception e) {
			
		}
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
		
	}
 
}
