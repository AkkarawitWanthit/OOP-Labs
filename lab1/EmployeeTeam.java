package lab1;

public class EmployeeTeam {
    private Employee boss;
    private Employee employee;

    public EmployeeTeam(Employee boss, Employee employee) {
        this.boss = boss;
        this.employee = employee;
    }

    public void printEmployeeDetails() {
        System.out.println(employee.getFirstName() + " " + employee.getLastName() + " " + employee.getMonthlySalary());
    }

    public void printAllEmployeesDetails() {
        System.out.println("Boss: " + boss.getFirstName() + " " + boss.getLastName() + " " + boss.getMonthlySalary());
        System.out.println("Employee: " + employee.getFirstName() + " " + employee.getLastName() + " " + employee.getMonthlySalary());
    }

    public void updateSalaryOfEmployee(String firstname, double newSalary) {
        if (newSalary > 0) {
            if (boss.getFirstName().equals(firstname)) {
                boss.setMonthlySalary(newSalary);
            }
            if (employee.getFirstName().equals(firstname)) {
                employee.setMonthlySalary(newSalary);
            }
        }
    }

    public void giveRaiseToAllEmployees() {
        boss.raiseSalary(10);
        employee.raiseSalary(10);
    }
}