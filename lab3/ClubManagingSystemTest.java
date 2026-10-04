public class ClubManagingSystemTest {
    public static void main(String[] args) {
        Club student = new Club("Student", 10);
        student.addMember(190);

        SportsClub football = new SportsClub("Football", 22);
        football.addMember(18);

        ESportsClub rov = new ESportsClub("RoV", 5);

        MarketingClub advertising = new MarketingClub("Advertising", 2, 100);
        advertising.addMember(8);

        Club[] clubs = {student, football, rov, advertising};
        ClubManagingSystem system = new ClubManagingSystem(clubs);

        System.out.println("Highest member club: " + system.getHighestMemberClub().getName());
        System.out.println("All budget: " + system.determineAllBudget());
        System.out.println("All members: " + system.getAllMembers());
    }
}
