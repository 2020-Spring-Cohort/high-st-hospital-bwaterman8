import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReceptionistTest {
    @Test
    public void shouldBeOnThePhone () {
        Receptionist underTest = new Receptionist("",2,2, false, false);
        underTest.isOnThePhone ();
        Assertions.assertTrue(true);
    }
}
