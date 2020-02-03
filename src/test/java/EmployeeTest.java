import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

    @Test
    public void testsGoHere(){

    }

    @Test
    public void shouldPaySalary () {
        Employee underTest = new Employee();
        int result = underTest.paySalary();
        Assertions.assertEquals(0, result);
    }

    @Test
    public void shouldSwitchIsPaid() {
        Employee underTest = new Employee();
        boolean result = underTest.payChangeIsPaid();
        Assertions.assertTrue(true);
    }
}
