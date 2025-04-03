import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class LionParamTest {
    private String sex;
    private boolean expectedThatHasMane;

    public LionParamTest(String sex, boolean expectedThatHasMane){
        this.sex = sex;
        this.expectedThatHasMane = expectedThatHasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getSexLion() {
        return new Object[][] {
                { "Самец", true},
                // { "Не самка", false}, // Проверка обработки исключения
                { "Самка", false}
        };
    }

    @Test
    public void checkingForMane() throws Exception {
        Lion lion = new Lion(sex);
        boolean actualThatHasMane = lion.doesHaveMane();
        assertEquals("Ожидаемое наличие гривы фактически не подтвердилось", expectedThatHasMane, actualThatHasMane);
    }
}
