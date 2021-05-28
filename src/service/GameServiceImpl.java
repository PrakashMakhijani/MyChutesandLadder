package service;

import model.*;

import java.util.Scanner;

public class GameServiceImpl implements GameService {


    GameModel game;
    SpinService spinService;
    EasyBoard easyBoardService;
    PlayerMovmentService playerMovmentService;




    @Override
    public GameModel startGame() {
        game = new GameModel();
        spinService = new SpinService();
        easyBoardService = new EasyBoard();
        playerMovmentService = new PlayerMovmentService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Number of Players to Start the Game (1-4): Enter -1 to exit at any time ");
        int numOfplayer = scanner.nextInt();
        if(!game.validateInput(String.valueOf(numOfplayer))){
            return game;
        }
        game.setNumOfPlayers(numOfplayer);

        for(int i = 1 ; i<= game.getNumOfPlayers(); i++) {
            System.out.println("Enter Player Name:");
            String playerName = scanner.next();
            if(!game.validateInput(String.valueOf(playerName))){
                return game;
            }
            game.getPlayersList().add(new Player(playerName));
        }
        System.out.println("Please Select the Level of Difficulties");
        System.out.println("1.Easy || 2. Hard");
        int levelOfDifficulty = scanner.nextInt();
        if(!game.validateInput(String.valueOf(levelOfDifficulty))){
            return game;
        }
        game.setLevelOfDifficulty(levelOfDifficulty);
        return game;
    }

    @Override
    public void initGameDashBoard() {
        System.out.println("** Welcome to the Chutes and Ladder Game **");
        System.out.println("*********************************************");
    }

    @Override
    public boolean continueGame() {
        return this.game.isContinueGame();
    }

    @Override
    public void playGame() {

            playerMovmentService.setPlayerInitialLocation(game.getPlayersList());
            boolean winningPoint = false;
            int playerTurn = 0;
            int playerNumber = 0;
            String winningPlayer="";
            while(!winningPoint)
            for (Player gamePlayer : game.getPlayersList()){
                int diceSpin = SpinService.spin();
                winningPoint = playerMovmentService.playerMovement(gamePlayer,diceSpin);
                playerTurn++;
                if(winningPoint){
                    System.out.println("Winner is: " + gamePlayer.getName());
                }

                playerNumber++;
                if(playerNumber == game.getNumOfPlayers()) {
                    playerNumber = 0;
                }


            }

    }


}
