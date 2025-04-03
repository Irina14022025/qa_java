import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class LionMockTest {
    @Mock
    private Feline mockFeline;

    @Test
    public void checkingFoodLion() throws Exception {
        List<String> expectedFoodLion = List.of("Животные", "Птицы", "Рыба");
        when(mockFeline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        Lion lion = new Lion("Самка");
        lion.setFeline(mockFeline);
        List<String> actualFoodLion = lion.getFood();
        assertEquals("Рацион льва должен содержать животных, птиц и рыб", expectedFoodLion, actualFoodLion);
        verify(mockFeline, times(1)).getFood("Хищник");
    }
}
