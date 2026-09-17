package lab1;

public class EmployeeTeamTest {
    public static void main(String[] args) {
        Employee boss = new Employee("Trin", "Tded", 50000);
        Employee emp = new Employee("Tin", "Soodlor", 20000);

        EmployeeTeam team = new EmployeeTeam(boss, emp);

        team.printAllEmployeesDetails();
        
        team.updateSalaryOfEmployee("Tin", 25000);
        team.printEmployeeDetails();

        team.giveRaiseToAllEmployees();
        team.printAllEmployeesDetails();
    }
}