import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionDoesHaveManeTest {

    private final String animalSex;
    private final boolean expected;

    public LionDoesHaveManeTest(String animalSex, boolean expected) {
        this.animalSex = animalSex;
        this.expected = expected;
    }

    @Mock
    Feline feline;


    @Parameterized.Parameters
    public static Object[][] getSexData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
                {"Trans", true}
        };
    }


    @Test
    public void doesHaveManeLionTest() throws Exception {
        try {
            Lion lion = new Lion(feline, animalSex);
            assertEquals(expected, lion.doesHaveMane());
        } catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", e.getMessage());
        }
    }
}
