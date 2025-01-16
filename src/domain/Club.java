package domain;

import java.util.ArrayList;
import java.util.List;

public class Club {
    private String name;
    private int yearOfFoundation;
    private String stadium;
    private List<Player> squad;

    public Club(String name, int yearOfFoundation, String stadium) {
        this.name = name;
        this.yearOfFoundation = yearOfFoundation;
        this.stadium = stadium;
        this.squad = new ArrayList<>();
    }
    public void addPlayer(Player player){
        this.squad.add(player);
    }
    public void printSquade(){
        for (Player player: squad){
            System.out.println(player);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public void setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public List<Player> getSquad() {
        return squad;
    }

    public void setSquad(List<Player> squad) {
        this.squad = squad;
    }
}
