package lab4;
public class UndergradeStudent extends PSUStudent{
    private int currentYear;

    public  UndergradeStudent (int age , double gpa){
        super(age, gpa);
        this.currentYear = 1;
    }

    public void setCurrentYear (int currentYear){
        this.currentYear = currentYear;
    }

    @Override 
    public double revealGrade(){
        if(currentYear >= 4){
            return  gpa;
        }
        return 0.0;
    }
    
}
