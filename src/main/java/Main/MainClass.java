package Main;

import java.io.IOException;
import Utility.Dictionary;


public class MainClass {
	

	
	public static void main(String[] args) throws IOException {    
		
		
	    String str = "JoyJustine";
	    boolean c;
	    c = Dictionary.isEnglishWord(str);
	    if (c) {
	        System.out
	                .println("Found");
	    } else {
	        System.out.println("Not Possible");
	    }

	}

}
