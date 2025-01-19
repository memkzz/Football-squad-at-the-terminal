package view;

import domain.Club;
import domain.Foot;
import domain.Player;
import domain.Status;
import domain.SpecificPosition;
import domain.PrimaryPosition;

import java.time.LocalDate;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Club fluminense = new Club("Fluminense Footbal Club", 1902, "Maracanã");

        Player fabio = new Player("Fábio Deivson Lopes Maciel", "Fábio", LocalDate.of(2000,12,21), "1,88",
                PrimaryPosition.DEFENSE, SpecificPosition.GOALKEEPER,
                Foot.RIGHT_FOOT, 100000, Status.BELONGING, "31/12/2025",
                "Brazilian", fluminense);
        fluminense.addPlayer(fabio);

        Player cano = new Player("Germán Ezequiel Cano", "Cano", LocalDate.of(2000,12,21), "1,76",
                PrimaryPosition.ATTACK, SpecificPosition.CENTER_WINGER,Foot.RIGHT_FOOT,1000000,Status.BELONGING,"32/12,2015",
                "Brazilian", fluminense);
        fluminense.addPlayer(cano);

        String title = "                FUTEBOL INFO SYSTEM";
        String line = "----------------------------------------------------------" ;
        String text1 = "Choose the club you want to consult: ";

        String menu1 = "Full Cast";
        String menu2 = "Filter by position";
        String menu3 = "Club statistics";
        String menu4 = "Return to main menu";


        String choice1 = "Fluminense Footbal Club";
        String choice2 = "Liverpool";
        String choice3 = "Borussia Dortmund";

        String casflu = "Fluminense Footbal Club Cast";

        System.out.println(line);
        System.out.println(title);
        System.out.println(line);

        System.out.println("1. "+choice1);
        System.out.println("2. "+choice2);
        System.out.println("3. "+choice3);
        System.out.print(text1);
        int interaction1 = scanner.nextInt();
        System.out.println(interaction1);
        switch (interaction1) {
            case 1:
                System.out.println("You choose Fluminense Footbal Club!");
                System.out.println("1. "+menu1);
                System.out.println("2. "+menu2);
                System.out.println("3. "+menu3);
                System.out.println("4. "+menu4);
                System.out.print(text1);

        }
        int interaction2 = scanner.nextInt();

        switch (interaction2){
            case 1:
                System.out.println(casflu);
                fluminense.printSquad();

        }

        scanner.close();




    }
}
