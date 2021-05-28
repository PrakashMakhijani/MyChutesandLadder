import model.GameModel;
import service.GameService;
import service.GameServiceImpl;

public class Game {
    public static void main(String[] args) {
        GameModel game;
        GameService gameService = new GameServiceImpl();
        gameService.initGameDashBoard();
        while(true) {
            game = gameService.startGame();
            gameService.playGame();
            if(!game.isContinueGame()){
                break;
            }


        }
    }
}
