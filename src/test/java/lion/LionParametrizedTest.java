package lion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParametrizedTest {
    private final String SEX;
    private final boolean EXPECTED;

    @Mock
    Feline feline;

    public LionParametrizedTest(String sex, boolean expected) {
        this.SEX = sex;
        this.EXPECTED = expected;
    }

    @Parameterized.Parameters(name = "Пол Льва.Тестовые данные:{0},{1}")
    public static Object[][] getLionData() {
        return new Object[][]{{"Самец", true},
                {"Самка", false}};
    }

    @Test
    public void LionTestMane() throws Exception{
        Lion lion = new Lion (SEX, feline);
        assertEquals(EXPECTED, lion.doesHaveMane());
    }

}
