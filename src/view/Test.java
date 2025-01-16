package view;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
        }

        scanner.close();




    }
}
