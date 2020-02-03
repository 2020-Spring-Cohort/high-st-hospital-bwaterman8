abstract class HealthProviders extends Employee {
    public HealthProviders() {
        super();
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
