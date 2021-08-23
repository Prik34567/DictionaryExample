package Utility;

import java.util.LinkedHashSet;


public class Dictionary {
	
	private static LinkedHashSet<String> set;
	private static int start = 0;
	private static boolean flag;

	public static  boolean isEnglishWord(String str) {
		set = new LinkedHashSet<String>();
	    set.add("Jose");
	    set.add("Nithin");
	    set.add("Joy");
	    set.add("Justine");
	    set.add("Jomin");
	    set.add("Thomas");
		int length = str.length();
	    if (start >= length) {
	        return flag;
	    } else {
	        flag = false;
	        for (String word : set) {

	            int wordLen = word.length();

	            if (start + wordLen <= length) {

	                if (word.equals(str.substring(start, wordLen + start))) {
	                    start = wordLen + start;
	                    flag = true;
	                    isEnglishWord(str);

	                }
	            }
	        }

	    }

	    return flag;
	}

}
