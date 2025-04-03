import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {
    private List<String> expectedFoodFeline = List.of("Животные", "Птицы", "Рыба");
    private String expectedFamily = "Кошачьи";
    private int expectedKittensCount = 1;

    @Test
    public void checkingFoodFeline() throws Exception{
        Feline feline = new Feline();
        List<String> actualFoodFeline = feline.eatMeat();
        assertEquals("Рацион кошачьих должен содержать животных, птиц и рыб", expectedFoodFeline, actualFoodFeline);
    }

    @Test
    public void checkingFamily(){
        Feline feline = new Feline();
        String actualFamily = feline.getFamily();
        assertEquals("Должно быть семейство кошачьих", expectedFamily, actualFamily);
    }

    @Test
    public void checkingForKittensFeline(){
        Feline feline = new Feline();
        int actualKittensCount = feline.getKittens();
        assertEquals("Котенок должен быть один", expectedKittensCount, actualKittensCount);
    }
}
