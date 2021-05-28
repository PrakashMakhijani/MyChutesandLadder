package service;

import model.GameModel;

public interface GameService {
    public GameModel startGame();
    public void initGameDashBoard();
    public boolean continueGame();
    public void playGame();

}
