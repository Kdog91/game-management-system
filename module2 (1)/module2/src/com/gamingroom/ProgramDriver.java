package com.gamingroom;

/**
 * Application start-up program
 * 
 * @author coce@snhu.edu
 */
public class ProgramDriver {
	
	/**
	 * The one-and-only main() method
	 * 
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		
		// FIXME: obtain reference to the singleton instance
	    // replace null with ???
		GameService service = GameService.getInstance();
		
		System.out.println("\nAbout to test initializing game data...");
		// Initialize with some game data
				service.addGame("Soccer");
				service.addGame("Basketball");
				service.addGame("Soccer");  // Should not add duplicate
		
		// use another class to prove there is only one instance
		SingletonTester tester = new SingletonTester();
		tester.testSingleton();
	}
}
