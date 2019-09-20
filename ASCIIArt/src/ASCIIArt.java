/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOU CODE HERE :) 

public class ASCIIArt {
	
	public static void printIntro() {
		System.out.println("THIS IS MY ASCII ART!!!!");
		System.out.println("THIS IS MY ASCII ART!!!!");
		System.out.println("THIS IS MY ASCII ART!!!!");
		System.out.println("THIS IS MY ASCII ART!!!!");
		System.out.println("THIS IS MY ASCII ART!!!!");
		
		System.out.println("\n");
		System.out.println("This is a snare drum!");
		System.out.println("\n\n");
	}
	
	public static void snareHead() {
		System.out.println("      ______________________");		
		System.out.println("     /         REMO         \\");
		System.out.println("    /                        \\");
		System.out.println("   |\\                        /|");
		System.out.println("   ||\\______________________/||");
	}
	
	//Used in snareSides()
	public static void verticalLines() {
		System.out.println("   ||   ||\t||\t||   ||");
	}
	
	public static void snareSides() {
		verticalLines();
		verticalLines();
		verticalLines();
		verticalLines();
		verticalLines();
		verticalLines();
	}
	
	public static void snareBottom() {
		System.out.println("    \\   ||      ||      ||   /");
		System.out.println("     \\__||______||______||__/");
	}
	
	public static void rightDrumstick() {
		System.out.println("       ______________________ ");
		System.out.println("    (><______________________)");
	}
		
	public static void leftDrumstick() {
		System.out.println("     ______________________");
		System.out.println("    (______________________><)");
	}
	
	public static void pairOfSticks() {
		rightDrumstick();
		leftDrumstick();
	}
	
	public static void main (String [] args) {

		printIntro();		
	
		snareHead();
		snareSides();
		snareBottom();
		
		System.out.println();
		
		pairOfSticks();
		
	}
}