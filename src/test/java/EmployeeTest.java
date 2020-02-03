import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

    @Test
    public void testsGoHere(){

    }

    @Test
    public void shouldPaySalary(String employeeName, int employeeNumber, int salary, boolean isPaid) {
        Employee underTest = new Employee(employeeName, employeeNumber, salary, isPaid);
        int result = underTest.paySalary();
        Assertions.assertEquals(0, result);
    }

    @Test
    public void shouldSwitchIsPaid(String employeeName, int employeeNumber, int salary, boolean isPaid) {
        Employee underTest = new Employee(employeeName, employeeNumber, salary, isPaid);
        boolean result = underTest.payChangeIsPaid();
        Assertions.assertTrue(true);
    }
}
