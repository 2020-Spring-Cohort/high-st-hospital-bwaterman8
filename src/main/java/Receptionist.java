public class Receptionist extends Employee {
    private boolean isOnPhone;

    public Receptionist(String employeeName, int employeeNumber, int salary, boolean isPaid, boolean isOnPhone) {
        super(employeeName, employeeNumber, salary, isPaid);
        this.isOnPhone = false;
    }

    @Override
    public String toString() {
        return " Employee ID: " + employeeNumber + " Salary: " + salary + " Has been paid: " + isPaid + "Is on the phone at the moment: " + isOnPhone;
    }

    public void isOnThePhone() {
        isOnPhone = true;
    }
}
