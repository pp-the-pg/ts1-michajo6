import cz.cvut.fel.ts1.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JosefTest {

    @Test
    public void factorialTest() {
        Assertions.assertEquals(120, Main.factorial(5));
    }
}
