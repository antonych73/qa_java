import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    static List<String> LIST_ONE = List.of("Животные", "Птицы", "Рыба");
    static List<String> LIST_TWO = List.of("Трава", "Различные растения");

    @Mock
    Feline feline;

    @Test
    public void getCatTest() throws Exception{
        Cat cat = new Cat(feline);
        assertEquals("Мяу", cat.getSound());

        Mockito.when(feline.eatMeat()).thenReturn(LIST_ONE);
        assertEquals(LIST_ONE, cat.getFood());

        Mockito.when(feline.eatMeat()).thenReturn(LIST_TWO);
        assertEquals(LIST_TWO, cat.getFood());
    }

}