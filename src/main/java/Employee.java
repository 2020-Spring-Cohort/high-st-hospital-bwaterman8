
public class Employee {
    private String employeeName;
    int employeeNumber;
    int salary;
    boolean isPaid;

    public Employee(String employeeName, int employeeNumber, int salary, boolean isPaid) {
        this.employeeName = employeeName;
        this.employeeNumber = employeeNumber;
        this.salary = salary;
        this.isPaid = isPaid;
    }

    public int paySalary() {
        return salary;
    }

    public boolean payChangeIsPaid() {
        return isPaid = true;
    }
}
