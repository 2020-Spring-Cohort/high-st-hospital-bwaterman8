import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DoctorTest {

    @Test
    public void shouldDrawBlood() {
        Doctor underTest = new Doctor("",212, 97000, false, "");
        Patient patientOne = new Patient("Bobby", 20, 10);
        underTest.drawBlood(patientOne);
        Assertions.assertEquals(15, patientOne.bloodLevels());
    }
 @Test
    public void shouldCareForPatient () {
     Doctor underTest = new Doctor("",212, 97000, false, "");
     Patient patientOne = new Patient("Bobby", 20, 10);
     underTest.careForPatient (patientOne);
     Assertions.assertEquals(12, patientOne.healthLevels());


 }
}
