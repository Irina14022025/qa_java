import com.example.Cat;
import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CatTest {
    private String expectedVoiceCat = "Мяу";

    @Test
    public void checkingVoiceCatTest(){
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        String actualVoiceCat = cat.getSound();
        assertEquals("Кот должен говорить Мяу", expectedVoiceCat, actualVoiceCat);
    }
}
