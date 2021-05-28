package model;

import java.util.ArrayList;
import java.util.List;

public class GameModel {
    private List<Player> playerList;
    private int numOfPlayers;
    private int levelOfDifficulty ;
    private boolean continueGame;

    public GameModel(){
        this.playerList = new ArrayList<>();
    }

    public boolean validateInput(String input){
        //TODO Need to validate input
        if(input.equals("-1")){
            continueGame = false;
        } else {
            continueGame = true;
        }
        return continueGame;
    }
    public List<Player> getPlayersList() {
        return playerList;
    }

    public void setPlayersList(List<Player> playerList) {
        this.playerList = playerList;
    }

    public int getNumOfPlayers() {
        return numOfPlayers;
    }

    public void setNumOfPlayers(int numOfPlayers) {
        this.numOfPlayers = numOfPlayers;
    }

    public int getLevelOfDifficulty() {
        return levelOfDifficulty;
    }

    public void setLevelOfDifficulty(int levelOfDifficulty) {
        this.levelOfDifficulty = levelOfDifficulty;
    }

    public boolean isContinueGame() {
        return continueGame;
    }

    public void setContinueGame(boolean continueGame) {
        this.continueGame = continueGame;
    }

}
