public class ESportsClubTest {
    public static void main(String[] args) {
        ESportsClub e = new ESportsClub("Esport", 100);
        System.out.println("ESportsClub e");
        System.out.println("clubName = " + e.getName());
        System.out.println("minNumMember = " + e.minNumMember);
        System.out.println("numMember = " + e.getNumMember());
        e.advertise();
        System.out.println("determineBudget = " + e.determineBudget());
        System.out.println("getName = " + e.getName());

        System.out.println();

        Club c = new ESportsClub("Esport", 100);
        System.out.println("Club c = new ESportsClub(...)");
        System.out.println("clubName = " + c.getName());
        System.out.println("numMember = " + c.getNumMember());
        c.advertise();
        System.out.println("determineBudget = " + c.determineBudget());
        System.out.println("getName = " + c.getName());
    }
}
