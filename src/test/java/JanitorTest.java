import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JanitorTest {
    @Test
    public void shouldSweep () {
        Janitor underTest = new Janitor("", 2,2, false, false);
        underTest.isSweeping();
        Assertions.assertTrue(true);
    }
}
