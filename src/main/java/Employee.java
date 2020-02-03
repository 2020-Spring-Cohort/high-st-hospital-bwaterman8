
public class Employee {
    private String employeeName;
    int employeeNumber;
    int salary;
    boolean isPaid;

    public Employee() {
        this.employeeName = "";
        this.employeeNumber = 0;
        this.salary = 0;
        this.isPaid = false;
    }

    public int paySalary() {
        return salary;
    }

    public boolean payChangeIsPaid() {
        return isPaid = true;
    }
}
