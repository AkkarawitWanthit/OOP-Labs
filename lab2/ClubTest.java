package lab2;

public class ClubTest {
    public static void main(String[] args) {
        SportsClub s = new SportsClub("Tigers", 10);
        s.addMember(5);
        s.changeName("Lions");
        System.out.println(s.getName());
        System.out.println(s.determineBudget());
        s.advertise();

        MarketingClub m = new MarketingClub("Eagles", 10, 1500);
        System.out.println(m.determineBudget());
        System.out.println(m.useBudget(600));
        System.out.println(m.useBudget(1000));
        System.out.println(m.determineBudget());
        m.advertise();
    }
}