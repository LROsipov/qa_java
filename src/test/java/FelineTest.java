import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class FelineTest {
    private final Feline feline = new Feline();
    @Test
    public void eatMeatReturnTest() throws Exception {
        List<String> felineFood = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(felineFood, feline.eatMeat());
    }
    @Test
    public void getFamilyReturnTest() {
        String typeOfAnimal = "Кошачьи";
        Assert.assertEquals(typeOfAnimal, feline.getFamily());
    }

    @Test
    public void getKittensTest() {
        int kittensCount = 1;
        Assert.assertEquals(kittensCount, feline.getKittens());
    }
    @Test
    public void getKittensWithParamsTest() {
        int kittensCount = 3;
        Assert.assertEquals(kittensCount, feline.getKittens(kittensCount));
    }
}
