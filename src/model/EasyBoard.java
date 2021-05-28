package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EasyBoard implements GAMEBOARD{

    private List<Chutes> chutesonBoard;
    private List<Ladder> ladderOnBoard;
    private Map<Player,Integer> playerPostion;

    public EasyBoard() {
        addChutes();
        addLadders();
        this.playerPostion = new HashMap<>();
    }

    public List<Chutes> getChutesonBoard() {
        return chutesonBoard;
    }

    public List<Ladder> getLadderOnBoard() {
        return ladderOnBoard;
    }

    public Map<Player, Integer> getPlayerPostion() {
        return playerPostion;
    }

    public void setPlayerPostion(Map<Player, Integer> playerPostion) {
        this.playerPostion = playerPostion;
    }

    public void addChutes(){
        this.chutesonBoard = new ArrayList<>();
        this.chutesonBoard.add(new Chutes(16,10));
        this.chutesonBoard.add(new Chutes(47,21));
        this.chutesonBoard.add(new Chutes(49,38));
        this.chutesonBoard.add(new Chutes(56,3));
        this.chutesonBoard.add(new Chutes(62,43));
        this.chutesonBoard.add(new Chutes(64,4));
        this.chutesonBoard.add(new Chutes(87,63));
        this.chutesonBoard.add(new Chutes(95,20));

    }

   public  void addLadders(){
        this.ladderOnBoard = new ArrayList<>();
        this.ladderOnBoard.add(new Ladder(1,52));
        this.ladderOnBoard.add(new Ladder(4,37));
        this.ladderOnBoard.add(new Ladder(48,75));
        this.ladderOnBoard.add(new Ladder(11,28));
        this.ladderOnBoard.add(new Ladder(36,4));
        this.ladderOnBoard.add(new Ladder(15,89));
        this.ladderOnBoard.add(new Ladder(8,16));
        this.ladderOnBoard.add(new Ladder(20,56));
    }



}
