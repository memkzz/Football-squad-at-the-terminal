package domain;

import java.util.ArrayList;
import java.util.List;

public class Club {
    private String name;
    private int yearOfFoundation;
    private String stadium;
    private Player[] squad;

    public Club(String name, int yearOfFoundation, String stadium, Player[] squad) {
        this.name = name;
        this.yearOfFoundation = yearOfFoundation;
        this.stadium = stadium;
        this.squad = squad;
    }

    public Club(String name, int yearOfFoundation, String stadium) {
        this.name = name;
        this.yearOfFoundation = yearOfFoundation;
        this.stadium = stadium;

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

    public Player[] getSquad() {
        return squad;
    }

    public void setSquad(Player[] squad) {
        this.squad = squad;
    }
}
