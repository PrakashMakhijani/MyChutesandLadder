package service;

import model.EasyBoard;
import model.Chutes;
import model.Ladder;
import model.Player;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlayerMovmentService {

    EasyBoard easyBoardService = new EasyBoard();

    public void setPlayerInitialLocation(List<Player> playerList){
        Map<Player,Integer> playerLocation = new HashMap<>();
        for(Player player:playerList){
            playerLocation.put(player,0);
        }
        easyBoardService.setPlayerPostion(playerLocation);
    }

    public Boolean playerMovement (Player player, Integer playerSteps){

        int playerPosition = easyBoardService.getPlayerPostion().get(player);
        int nextPosition = playerPosition + playerSteps;

        if(nextPosition > 100){
            nextPosition = playerPosition;
        }

        nextPosition = positionafterChutesandLadder(player,nextPosition);
        if (nextPosition == 100){
            return true;
        }
        else{
            easyBoardService.getPlayerPostion().put(player,nextPosition);
            return false;
        }
    }




    public int positionafterChutesandLadder(Player player, int newPosition){

        int currentPosition = newPosition;

        for(Chutes chutes : easyBoardService.getChutesonBoard()){
            if(newPosition == chutes.getCurrentPosition()){
                newPosition = chutes.getNextposition();

            }

        }
        for(Ladder ladder : easyBoardService.getLadderOnBoard()){
            if(newPosition == ladder.getCurrentPossition()){
                newPosition = ladder.getNextpossition();

            }
        }

        return newPosition;

    }



}
