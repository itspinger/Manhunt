package net.pinger.manhunt.game;

public class Game {

    // This is the current GameState of the game
    private GameState gameState = GameState.WAITING;

    /**
     *
     */

    public void start() {
        

    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }
}
