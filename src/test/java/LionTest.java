import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    static List<String> LIST = List.of("Трава", "Различные растения");

    @Mock
    Feline feline;

    @Test
    public void getKittensLionTest() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());

        lion = new Lion(feline, "Самка");
        Mockito.when(feline.getFood(Mockito.anyString())).thenReturn(LIST);
        assertEquals(LIST, lion.getFood());
    }

}
