package animal;

import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalParametrizedTest {
    private final String ANIMAL_KIND;
    private final List<String> EXPECTED;

    public AnimalParametrizedTest(String animalKind, List<String> expected) {
        this.ANIMAL_KIND = animalKind;
        this.EXPECTED = expected;
    }

    @Parameterized.Parameters(name ="Список еды.тестовые данные:{0},{1}")
    public static Object[][] getFoodData() {
        return new Object[][]{{"Травоядное", List.of("Трава", "Различные растения")}, {"Хищник", List.of("Животные", "Птицы", "Рыба")}
        };
    }
    @Test
    public void getFoodTest() throws Exception {
        Animal animal = new Animal();
        List<String> stringList = animal.getFood(ANIMAL_KIND);
        assertEquals(EXPECTED, stringList);
    }
}