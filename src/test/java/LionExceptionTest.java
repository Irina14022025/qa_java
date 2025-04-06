import com.example.Feline;
import com.example.Lion;
import org.junit.Test;


public class LionExceptionTest {

    @Test(expected = Exception.class)
    public void checkingClassLionNegativeTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Не самка", feline);
    }
}

