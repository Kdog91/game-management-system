package com.gamingroom;

/**
 * A class to test a singleton's behavior
 * 
 * Demonstrates that only one instance of GameService is ever created,
 * no matter how many times getInstance() is called.
 * 
 * @author coce
 */
public class SingletonTester {

    public void testSingleton() {
        
        System.out.println("\nAbout to test the singleton...");
        
        // ✅ Obtain local reference to the singleton instance
        GameService service = GameService.getInstance();
        
        // ✅ Add test games
        service.addGame("Soccer");
        service.addGame("Basketball");
        service.addGame("Soccer"); // This should NOT create a duplicate
        
        // ✅ Print the games to confirm no duplicates
        for (int i = 0; i < service.getGameCount(); i++) {
            System.out.println(service.getGame(i));
        }
    }
}

