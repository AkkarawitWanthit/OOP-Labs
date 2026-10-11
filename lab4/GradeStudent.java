package lab4;

public class GradeStudent extends  PSUStudent{
    private boolean passThesis;

    public  GradeStudent(int age, double gpa){
        super(age, gpa);
        passThesis = false;
    }

    public void setPassThesis(boolean passThesis){
        this.passThesis = passThesis;
    }

    @Override 
    public double revealGrade(){
        if(passThesis){
            return gpa;
        }
        return 0.0;
    }
    
}