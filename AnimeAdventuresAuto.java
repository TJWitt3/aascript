package animeadventures.aascript;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.apache.tools.ant.types.resources.comparators.Exists;
import com.kenai.constantine.platform.WaitFlags;

public class AnimeAdventuresAuto {
	public static void main(String[] args) { 
		 AnimeAdventuresAuto object = new AnimeAdventuresAuto();
		  object.Play();
	}
	
	private synchronized void Play() {
	
		Screen screen = new Screen();
		 String imagePath = System.getProperty("user.dir") + "/";
		
		//Buttons in order
		  Pattern yes = new Pattern(imagePath + "images/yes");
		  Pattern Wave2Shi = new Pattern(imagePath + "images/Wave2Shi");
		  Pattern ulq = new Pattern(imagePath + "images/ulq");
		  Pattern placeulq = new Pattern(imagePath + "images/placeulq");
		  Pattern Wave3Shi = new Pattern(imagePath + "images/Wave3Shi");
		  Pattern Firstupgrade = new Pattern(imagePath + "images/Firstupgrade");
		  Pattern Wave4Shi = new Pattern(imagePath + "images/Wave4Shi");
		  Pattern Secondupgrade = new Pattern(imagePath + "images/Secondupgrade");
		  Pattern Wave6Shi = new Pattern(imagePath + "images/Wave6Shi");
		  Pattern Thirdupgrade = new Pattern(imagePath + "images/Thirdupgrade");
		  Pattern Wave7Shi = new Pattern(imagePath + "images/Wave7Shi");
		  Pattern Fourthupgrade = new Pattern(imagePath + "/images/Fourthupgrade");
		  Pattern Wave9Shi = new Pattern(imagePath + "images/Wave9Shi");
		  Pattern Fifthupgrade = new Pattern(imagePath + "images/Fourthupgrade");
		  Pattern Wave11Shi = new Pattern(imagePath + "images/Wave11Shi");
		  Pattern Sixthupgrade = new Pattern(imagePath + "/images/Sixthupgrade");
		  Pattern Wave13Shi = new Pattern(imagePath + "/images/Wave13Shi");
		  Pattern Seventhupgrade = new Pattern(imagePath + "/images/Seventhupgrade");
		  Pattern Wave15Shi = new Pattern(imagePath + "/images/Wave15Shi");
		  Pattern Eigthupgrade = new Pattern(imagePath + "/images/Eigthupgrade");
		  Pattern Wave17Shi = new Pattern(imagePath + "/images/Wave17Shi");
		  Pattern Ninthupgrade = new Pattern(imagePath + "/images/Ninthupgrade");
		  Pattern Wave34Shi = new Pattern(imagePath + "/images/Wave34Shi");
		  Pattern Max = new Pattern(imagePath + "/images/Max");
		  Pattern Wave44Shi = new Pattern(imagePath + "/images/Wave44Shi");
		  Pattern X = new Pattern(imagePath + "/images/X");
		
		  while(true) {
			
		
			try {
			         screen.click(ulq);
			        } catch (FindFailed e1) {
			         e1.printStackTrace();
			        }
			try {
	         screen.wait(yes).click(yes);
	        } catch (FindFailed e) {
	         e.printStackTrace();
	        }
	        try {
	         screen.wait(Wave2Shi).click(ulq);
	        } catch (FindFailed e) {
	         e.printStackTrace();
	        }
	        try {
	         screen.click(placeulq);
	        } catch (FindFailed e1) {
	         e1.printStackTrace();
	        }
	        try {
	         screen.wait(Wave3Shi).click(Firstupgrade);
	        } catch (FindFailed e) {
	         e.printStackTrace();
	        }
	       
	        try {
	         screen.wait(Wave4Shi).click(Secondupgrade);
	        } catch (FindFailed e) {
	         e.printStackTrace();
	        }
	        try {
		    screen.wait(Wave6Shi).click(Thirdupgrade);
		   }  catch (FindFailed e) {
		     e.printStackTrace();
		        }
	        try {
		         screen.wait(Wave7Shi).click(Fourthupgrade);
		        } catch (FindFailed e) {
		         e.printStackTrace();
		        }
		       
		    try {
		         screen.wait(Wave9Shi).click(Fifthupgrade);
		        } catch (FindFailed e) {
		         e.printStackTrace();
		        }
		    try {
			    screen.wait(Wave11Shi).click(Sixthupgrade);
			   }  catch (FindFailed e) {
			     e.printStackTrace();
			        }
	        try {
		         screen.wait(Wave13Shi).click(Seventhupgrade);
		        } catch (FindFailed e) {
		         e.printStackTrace();
		        }
		       
		        try {
		         screen.wait(Wave15Shi).click(Eigthupgrade);
		        } catch (FindFailed e) {
		         e.printStackTrace();
		        }
		        try {
			    screen.wait(Wave17Shi).click(Ninthupgrade);
			   }  catch (FindFailed e) {
			     e.printStackTrace();
			        }
		        try {
				    screen.wait(Wave34Shi).click(Max);
				   }  catch (FindFailed e) {
				     e.printStackTrace();
				        }
		        try {
				    screen.wait(Wave44Shi).click(X);
				   }  catch (FindFailed e) {
				     e.printStackTrace();
				        }
		       
	    
		  }
		 }
	}

	