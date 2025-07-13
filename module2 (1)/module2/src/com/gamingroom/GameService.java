package com.gamingroom;

import java.util.ArrayList;
import java.util.List;

/**
 * A singleton service for the game engine
 * 
 */
public class GameService {

    /**
     * A list of the active games
     */
    private static List<Game> games = new ArrayList<Game>();

    /*
     * Holds the next game identifier
     */
    private static long nextGameId = 1;

    // Singleton instance of GameService
    private static GameService instance = null;

    // Private constructor to prevent instantiation from outside the class
    private GameService() {}

    // Public method to return the single instance
    public static GameService getInstance() {
        if (instance == null) {
            instance = new GameService();
        }
        return instance;
    }

    /**
     * Adds a new game if one with the same name doesn't already exist
     */
    public Game addGame(String name) {

        Game game = getGame(name); // use helper to find existing

        if (game == null) {
            game = new Game(nextGameId++, name);
            games.add(game);
        }

        return game;
    }

    /**
     * Returns the game instance at the specified index
     */
    Game getGame(int index) {
        return games.get(index);
    }

    /**
     * Returns the game instance with the specified id
     */
    public Game getGame(long id) {
        for (Game g : games) {
            if (g.getId() == id) {
                return g;
            }
        }
        return null;
    }

    /**
     * Returns the game instance with the specified name
     */
    public Game getGame(String name) {
        for (Game g : games) {
            if (g.getName().equalsIgnoreCase(name)) {
                return g;
            }
        }
        return null;
    }

    /**
     * Returns the number of active games
     */
    public int getGameCount() {
        return games.size();
    }
}

