import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParamsTest {
    @Parameterized.Parameter()
    public String sex;
    @Parameterized.Parameter(1)
    public boolean expected;
    Feline feline = new Feline();
    @Before
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Parameterized.Parameters(name = "sex: {0}, expected: {1}")
    public static Object [][] getTestData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }
    @Test
    public void lionConstructorTest() throws Exception {
        Lion lion = new Lion(sex, feline);
        assertEquals(expected, lion.doesHaveMane());
    }

}