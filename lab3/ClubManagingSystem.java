public class ClubManagingSystem {
    private Club[] clubList;

    public ClubManagingSystem(Club[] clubList) {
        this.clubList = clubList;
    }

    public int determineAllBudget() {
        int sum = 0;
        for (Club c : clubList) {
            sum += c.determineBudget();
        }
        return sum;
    }

    public int getAllMembers() {
        int total = 0;
        for (Club c : clubList) {
            total += c.getNumMember();
        }
        return total;
    }

    public Club getHighestMemberClub() {
        Club highest = clubList[0];
        for (Club c : clubList) {
            if (c.getNumMember() > highest.getNumMember()) {
                highest = c;
            }
        }
        return highest;
    }
}
