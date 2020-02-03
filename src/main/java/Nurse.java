public class Nurse extends HealthProviders {
    private int numOfPatients;

    public Nurse(String employeeName, int employeeNumber, int salary, boolean isPaid, int numOfPatients) {
        super ();
        this.numOfPatients = 4;
    }

    @Override
    public String toString() {
        return " Employee ID: " + employeeNumber + " Salary: " + salary + " Has been paid: " + isPaid + ". # of patients " +numOfPatients;
    }

    public void careForPatient(Patient patientOne) {
        patientOne.increaseHealthLevels(5);
    }
}
