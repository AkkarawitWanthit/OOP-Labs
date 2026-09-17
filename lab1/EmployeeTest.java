package lab1;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("Trin", "Jaidee", 25000);
        System.out.println("First name: " + e1.getFirstName());
        
        e1.setMonthlySalary(-10000);
        System.out.println("Salary after invalid change: " + e1.getMonthlySalary());
        
        e1.setMonthlySalary(30000);
        System.out.println("Salary after valid change: " + e1.getMonthlySalary());

        Employee e2 = new Employee("Tin", "Rukdee", 40000);

        System.out.println("E1 Yearly Salary: " + e1.getYearlySalary());
        System.out.println("E2 Yearly Salary: " + e2.getYearlySalary());

        e1.raiseSalary(10);
        e2.raiseSalary(10);

        System.out.println("E1 Yearly Salary after raise: " + e1.getYearlySalary());
        System.out.println("E2 Yearly Salary after raise: " + e2.getYearlySalary());
    }
}