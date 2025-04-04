import com.example.Cat;
import com.example.Feline;
import com.example.Predator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class CatMockTest {
    @Mock
    private Feline mockFeline;

    @Test
    public void checkingFoodCat() throws Exception {
        List<String> expectedFoodCat = List.of("Животные", "Птицы", "Рыба");
        when(mockFeline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        Cat cat = new Cat(mockFeline);
        List<String> actualFoodCat = cat.getFood();
        assertEquals("Рацион кота должен содержать животных, птиц и рыб", expectedFoodCat, actualFoodCat);
    }
}
