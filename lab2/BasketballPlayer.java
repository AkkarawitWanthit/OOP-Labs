package lab2;

public class BasketballPlayer extends Player {
    public BasketballPlayer(String name, int jerseyNumber) {
        super(name, jerseyNumber);
    }

    public void playGame() {
        super.playGame(48);
    }

    public void changeJerseyNumber(int newNumber) {
        jerseyNumber = newNumber;
        System.out.println(name + " changes number to " + jerseyNumber);
    }
}