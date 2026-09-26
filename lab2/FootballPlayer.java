package lab2;

public class FootballPlayer extends Player {
    public FootballPlayer(String name, int jerseyNumber) {
        super(name, jerseyNumber);
    }

    public void playGame() {
        super.playGame(90);
    }
}