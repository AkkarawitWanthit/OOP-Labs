package lab0;

public class Employee {
    public String ID;
    public String Name;
    public double salary;
    static int minSalary = 15000;
    public Employee (double salary ,String Name , String Id){
        this.ID = Id;
        this.Name = Name;
        this.salary = salary;
    }
    public void setID (String id){
        this.ID = id;
    }
    public void setName (String name){
        this.Name = name;
    }
    public void setSalary (double salary){
        this.salary = salary;
    }
    public String getID (){
        return  this.ID;
    }
    public String getName (){
        return this.Name;
    }
    public double getSalary (){
        return this.salary;
    }
    public void displayEmployee (){
        System.out.println("ID = "+this.ID);
        System.out.println("Name = "+this.Name);
        System.out.println("Salary = "+this.salary);
    }
}
