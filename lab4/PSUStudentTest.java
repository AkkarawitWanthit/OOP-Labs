package lab4;
public class PSUStudentTest {
    public static void main(String[] args) {
        UndergradeStudent p1 = new UndergradeStudent (19, 1.32);

        System.out.println(p1.getAge());
        System.out.println(p1.revealGrade());

        p1.setCurrentYear(4);
        System.out.println(p1.revealGrade());

        GradeStudent p2 = new GradeStudent(25 , 2.0);

        System.out.println(p2.getAge());
        System.out.println(p2.revealGrade());

        p2.setPassThesis(true);
        System.out.println(p2.revealGrade());
    }
}