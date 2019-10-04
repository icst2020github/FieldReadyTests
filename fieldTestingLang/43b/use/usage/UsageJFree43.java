package usage;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.apache.commons.lang.text.ExtendedMessageFormat;
import org.apache.commons.lang.text.FormatFactory;

public class UsageJFree43 {
 
	public static void main(String[] args) {
		
		long startTime = System.nanoTime();
		try {
		    Map registry = new HashMap();
		    registry.put("lower", new LowerCaseFormatFactory());
	        registry.put("upper", new UpperCaseFormatFactory());
	        String pattern = "it''s a {0,lower} 'test'!";
	        ExtendedMessageFormat emf = new ExtendedMessageFormat(pattern, registry);
		}catch(Exception e) {
			
		}
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
			

 
	}
	
    private static class LowerCaseFormat extends Format {
        public StringBuffer format(Object obj, StringBuffer toAppendTo, FieldPosition pos) {
            return toAppendTo.append(((String)obj).toLowerCase());
        }
        public Object parseObject(String source, ParsePosition pos) {throw new UnsupportedOperationException();}
    }

    /**
     * {@link Format} implementation which converts to upper case.
     */
    private static class UpperCaseFormat extends Format {
        public StringBuffer format(Object obj, StringBuffer toAppendTo, FieldPosition pos) {
            return toAppendTo.append(((String)obj).toUpperCase());
        }
        public Object parseObject(String source, ParsePosition pos) {throw new UnsupportedOperationException();}
    }


    // ------------------------ Test Format Factories ---------------
    /**
     * {@link FormatFactory} implementation for lower case format.
     */
    public static class LowerCaseFormatFactory implements FormatFactory {
        private static final Format LOWER_INSTANCE = new LowerCaseFormat();
        public Format getFormat(String name, String arguments, Locale locale) {
            return LOWER_INSTANCE;
        }
    }
    /**
     * {@link FormatFactory} implementation for upper case format.
     */
    public static class UpperCaseFormatFactory implements FormatFactory {
        private static final Format UPPER_INSTANCE = new UpperCaseFormat();
        public Format getFormat(String name, String arguments, Locale locale) {
            return UPPER_INSTANCE;
        }
    }
	
	
 
}
