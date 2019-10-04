package usage;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class UsageLang12 {
 
	public static void main(String[] args) {
		
        long seed = System.currentTimeMillis();
        long startTime = System.nanoTime();
        try {
        	RandomStringUtils.random(3,0,0,false,false,new char[]{'a'},new Random(seed));
        }catch(Exception e) {}
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
		long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("Used memory is bytes: " + memory);

 
	}
 
}
