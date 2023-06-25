import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    final int EXPECTED_KITTENS = 5;

    @Test
    public void getFamilyTest(){
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void eatMeatTest() throws Exception{
        Feline feline = new Feline();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getKittensPresetTest() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
        assertEquals(EXPECTED_KITTENS, feline.getKittens(5));
    }

}
