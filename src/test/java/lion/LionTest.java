package lion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;


    @Test
    public void LionTestKittens() throws Exception{
        Lion lion = new Lion ("Самка", feline);
        lion.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens();
    }

    @Test
    public void LionTestGetFood() throws Exception{
        Lion lion = new Lion ("Самка", feline);
        lion.getFood();
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
    }

    @Test
    public void testException(){
        String exceptionMessage = "Используйте допустимые значения пола животного - самец или самка";
        Exception exception = assertThrows(Exception.class, () -> new Lion("неизвестен", feline));
        assertEquals(exceptionMessage, exception.getMessage());
    }


}
