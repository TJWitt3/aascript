package animeadventures.aascript;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;

import java.awt.Rectangle;

//import javax.swing.plaf.synth.Region;

import org.apache.tools.ant.types.resources.comparators.Exists;


import com.kenai.constantine.platform.WaitFlags;

public class AnimeAdventuresAuto {
	public static void main(String[] args) { 
		 AnimeAdventuresAuto object = new AnimeAdventuresAuto();
		  object.Play();
	}
	
	private synchronized void Play(){
	
		Rectangle rect = new Rectangle(0, 0, 1024, 768);
		
		Region region = new Region(rect);
		Screen screen = new Screen();
		
		screen.grow(50);
		 String imagePath = System.getProperty("user.dir") + "/";
		
		//Buttons in order
		  Pattern yes = new Pattern(imagePath + "images/yes.png");
		  Pattern Wave2Shi = new Pattern(imagePath + "images/Wave2Shi.png");
		  Pattern ulq = new Pattern(imagePath + "images/ulq.png");
		  Pattern placeulq = new Pattern(imagePath + "images/placeulq.png");
		  Pattern Wave3Shi = new Pattern(imagePath + "images/Wave3Shi.png");
		  Pattern Firstupgrade = new Pattern(imagePath + "images/Firstupgrade.png");
		  Pattern Wave4Shi = new Pattern(imagePath + "images/Wave4Shi.png");
		  Pattern Secondupgrade = new Pattern(imagePath + "images/Secondupgrade.png");
		  Pattern Wave6Shi = new Pattern(imagePath + "images/Wave6Shi.png");
		  Pattern Thirdupgrade = new Pattern(imagePath + "images/Thirdupgrade.png");
		  Pattern Wave7Shi = new Pattern(imagePath + "images/Wave7Shi.png");
		  Pattern Fourthupgrade = new Pattern(imagePath + "/images/Fourthupgrade.png");
		  Pattern Wave9Shi = new Pattern(imagePath + "images/Wave9Shi.png");
		  Pattern Fifthupgrade = new Pattern(imagePath + "images/Fourthupgrade.png");
		  Pattern Wave11Shi = new Pattern(imagePath + "images/Wave11Shi.png");
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
		
		  
		  Pattern[] patterns = {yes, Wave2Shi, ulq, placeulq, Wave3Shi, Firstupgrade, 
				  Wave4Shi, Secondupgrade, Wave6Shi, Thirdupgrade, Wave7Shi, Fourthupgrade, 
				  Wave9Shi, Fifthupgrade, Wave11Shi, Sixthupgrade, Wave13Shi, Seventhupgrade, 
				  Wave15Shi, Eigthupgrade, Wave17Shi, Ninthupgrade, Wave34Shi, Max, Wave44Shi, X};

//		  for(int i = 0; i<patterns.length;i++) {
//			  patterns[i].resize(.8f);
//		  }
		  screen.grow(50);
		  
		 
		  while(true) {
			
		
			try {
			  screen.wait(ulq).click(ulq);

			  } catch (FindFailed e1) {
			     e1.printStackTrace();
			  }
			synchronized(screen) {
				try {
					 screen.wait(10);
			         screen.wait(yes).click(yes);
			        } catch (Exception e) {
			         e.printStackTrace();
			    }
			}
			
	        try {
	        	 region.wait(Wave2Shi);
	        	
	        	
	        
	        	
	         region.wait(Wave2Shi,.5);
	         region.wait(ulq,.5).click(ulq);
	        } catch (Exception e) {
	         e.printStackTrace();
	        }
	        try {
	         screen.click(placeulq);
	        } catch (Exception e1) {
	         e1.printStackTrace();
	        }
	        try {
	         screen.wait(Wave3Shi,.5);
	         screen.wait(Firstupgrade).click(Firstupgrade);
	        } catch (Exception e) {
	         e.printStackTrace();
	        }
	       
	        try {
	         screen.wait(Wave4Shi,.5);
	         screen.wait(Secondupgrade,.5).click(Secondupgrade);
	        } catch (FindFailed e) {
	         e.printStackTrace();
	        }
	        try {
		    screen.wait(Wave6Shi,.5);
		    screen.wait(Thirdupgrade,.5).click(Thirdupgrade);
		   }  catch (FindFailed e) {
		     e.printStackTrace();
		        }
	        try {
		         screen.wait(Wave7Shi,.5);
		         screen.wait(Fourthupgrade,.5).click(Fourthupgrade);
		        } catch (FindFailed e) {
		         e.printStackTrace();
		        }
		       
		    try {
		         screen.wait(Wave9Shi,.5);
		         screen.wait(Fifthupgrade,.5).click(Fifthupgrade);
		        } catch (FindFailed e) {
		         e.printStackTrace();
		        }
		    try {
			    screen.wait(Wave11Shi,.5);
			    screen.wait(Sixthupgrade,.5).click(Sixthupgrade);
			   }  catch (FindFailed e) {
			     e.printStackTrace();
			        }
	        try {
		         screen.wait(Wave13Shi,.5);
		         screen.wait(Seventhupgrade,.5).click(Seventhupgrade);
		        } catch (FindFailed e) {
		         e.printStackTrace();
		        }
		       
		        try {
		         screen.wait(Wave15Shi,.5);
		         screen.wait(Eigthupgrade,.5).click(Eigthupgrade);
		        } catch (FindFailed e) {
		         e.printStackTrace();
		        }
		        try {
			    screen.wait(Wave17Shi,.5);
			    screen.wait(Ninthupgrade,.5).click(Ninthupgrade);
			   }  catch (FindFailed e) {
			     e.printStackTrace();
			        }
		        try {
				    screen.wait(Wave34Shi,.5);
				    screen.wait(Max,.5).click(Max);
				   }  catch (FindFailed e) {
				     e.printStackTrace();
				        }
		        try {
				    screen.wait(Wave44Shi,.5);
				    screen.wait(X,.5).click(X);
				   }  catch (FindFailed e) {
				     e.printStackTrace();
				        }
		       
	    
		  }
		 }
	}

	