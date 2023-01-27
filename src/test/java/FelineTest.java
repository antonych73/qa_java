import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {


    @Test
    public void eatMeatFelineTest() throws Exception {
        Feline feline = new Feline();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
        assertEquals("Кошачьи", feline.getFamily());
        assertEquals(1, feline.getKittens());
        assertEquals(1, feline.getKittens(1));
    }

}
