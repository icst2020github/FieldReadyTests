package usage;

import org.apache.commons.lang.text.StrBuilder;

public class UsageJFree61 {
 
	public static void main(String[] args) {

		StrBuilder sb = new StrBuilder("\n%BLAH%\nDo more stuff\neven more stuff\n%BLAH%\n");
        sb.deleteAll("\n%BLAH%");
        
	}
 
}
