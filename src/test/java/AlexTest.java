import com.example.Alex;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class AlexTest {

    @Mock
    Feline feline;

    @Test
    public void getAlexTest() throws Exception{
        Alex alex = new Alex(feline);
        assertEquals(List.of("Балу", "Умка", "Кинг"), alex.getFriends());
        assertEquals("Московский зоопарк", alex.getPlaceOfLiving());
        assertEquals(0, alex.getKittens());
    }

}