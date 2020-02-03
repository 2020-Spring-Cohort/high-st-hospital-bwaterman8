import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PatientTest {
    @Test
    public void shouldHaveDefaultBloodLevel() {
    Patient underTest = new Patient("",2,2);
    int result = underTest.bloodLevels();
        Assertions.assertEquals(20, result);
    }

    @Test
    public void drawBloodShouldDecreaseBloodLevelsByTwo() {
        Patient underTest = new Patient("",2,2);
        underTest.decreaseBloodLevels(2);
        int result = underTest.bloodLevels();
        Assertions.assertEquals(18, result);
    }

    @Test
    public void shouldHaveDefaultHealthLevel () {
        Patient underTest = new Patient("",2,2);
        int result = underTest.healthLevels();
        Assertions.assertEquals(10, result);
    }

    @Test
    public void careForPatientShouldIncreaseHealthLevel() {
        Patient underTest = new Patient("",2,2);
        underTest.increaseHealthLevels(5);
        int result = underTest.healthLevels();
        Assertions.assertEquals(15, result);
    }

}
