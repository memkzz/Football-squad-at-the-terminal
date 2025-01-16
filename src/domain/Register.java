package domain;

public class Register {
    public static void main(String[] args) {
        Club fluminense = new Club("Fluminense Footbal Club", 1902, "Maracanã");

        Player fabio = new Player("Fábio Deivson Lopes Maciel","Fábio", 44, "1,88", PrimaryPosition.DEFENSE, SpecificPosition.GOALKEEPER, Foot.RIGHT_FOOT, 100000, Status.BELONGING, "31/12/2025", "Brazilian", fluminense);
        Player cano = new Player("Germán Ezequiel Cano Recalde","Cano", 37, "1,77", PrimaryPosition.ATTACK, SpecificPosition.CENTER_WINGER, Foot.RIGHT_FOOT, 1000000, Status.BELONGING, "31/12/2025", "Argentine", fluminense);
        fluminense.addPlayer(fabio);
        fluminense.addPlayer(cano);
        fluminense.printSquad();
    }}