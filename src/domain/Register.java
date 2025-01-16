package domain;

public class Register {
    public static void main(String[] args) {
        Club fluminense = new Club("Fluminense Footbal Club", 1902, "Maracanã");

        Player player1 = new Player("Fábio Deivson Lopes Maciel", 44, "1,88", PrimaryPosition.DEFENSE, SpecificPosition.GOALKEEPER, Foot.RIGHT_FOOT, 100000, Status.BELONGING, "31/12/2015", "Brazilian");
        Player[] fluminenseSquad = {player1};
    }}