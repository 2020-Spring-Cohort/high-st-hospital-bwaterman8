public class Doctor extends HealthProviders {
    private String specialty;

public Doctor(String employeeName, int employeeNumber, int salary, boolean isPaid, String specialty) {
    super(employeeName, employeeNumber, salary, isPaid);
    this.specialty = specialty;
    }

    @Override
    public String toString() {
        return " Employee ID: " + employeeNumber + " Salary: " + salary + " Has been paid: " + isPaid + ". Doctor's specialty: ";
    }
}
