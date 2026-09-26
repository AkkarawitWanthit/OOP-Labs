package lab2;

public class SportsClub extends Club {
    public SportsClub(String c, int m) {
        super(c, m);
    }

    @Override
    public void changeName(String newName) {
    }

    @Override
    public int determineBudget() {
        return (numMember * 1000) + (numMember - minNumMember) * 100;
    }
}