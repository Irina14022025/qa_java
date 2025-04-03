import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FelineMockTest {

    @Mock
    private Feline mockFeline;

    @Test
    public void checkingWhichParameter(){
        mockFeline.getKittens(1);
        Mockito.verify(mockFeline).getKittens(1);
    }
}
