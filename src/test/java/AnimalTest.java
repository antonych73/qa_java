import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalTest {

    private final String animalKind;
    private final List<String> list;

    public AnimalTest(String animalKind, List<String> list) {
        this.animalKind = animalKind;
        this.list = list;
    }

    @Parameterized.Parameters
    public static Object[][] getAnimalKindData() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")}
        };
    }

    @Test
    public void getAnimalTest() throws Exception {
        try {
            Animal animal = new Animal();
            assertEquals(list, animal.getFood(animalKind));
            animal.getFood("Млекопитающее");
            assertEquals(
                    "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи",
                    animal.getFamily());
        } catch (Exception e) {
            assertEquals(
                    "Неизвестный вид животного, используйте значение Травоядное или Хищник",
                    e.getMessage());
        }

    }

}
