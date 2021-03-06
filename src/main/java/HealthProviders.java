abstract class HealthProviders extends Employee {
    public HealthProviders(String employeeName, int employeeNumber, int salary, boolean isPaid) {
        super(employeeName, employeeNumber, salary, isPaid);
    }
    public void drawBlood(Patient patientOne) {
        patientOne.decreaseBloodLevels(2);
        System.out.println("Blood has been drawn");
    }

    public void careForPatient(Patient patientOne) {
        patientOne.increaseHealthLevels(2);
        System.out.println("Patient has been cared for.");
    }
}
