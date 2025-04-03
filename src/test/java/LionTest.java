import com.example.Feline;
import com.example.Lion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LionTest {
    private int expectedKittensCount = 1;

    @Test
    public void checkingForKittensLion() throws Exception{
        Feline feline = new Feline();
        Lion lion = new Lion("Самка");
        lion.setFeline(feline);
        int actualKittensCount = lion.getKittens();
        assertEquals ("У этой самки должен быть один котенок", expectedKittensCount, actualKittensCount);
    }
}
