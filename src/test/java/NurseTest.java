import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NurseTest {
    @Test
    public void shouldDrawBlood() {
        Nurse underTest = new Nurse("", 212, 97000, false, 2);
        Patient patientOne = new Patient("Bobby",20, 10);
        underTest.drawBlood(patientOne);
        Assertions.assertEquals(18, patientOne.bloodLevels());
    }

    @Test
    public void shouldCareForPatient() {
        Nurse underTest = new Nurse("", 212, 97000, false, 2);
        Patient patientOne = new Patient("Bobby",20, 10);
        underTest.careForPatient(patientOne);
        Assertions.assertEquals(15, patientOne.healthLevels());
    }
}
