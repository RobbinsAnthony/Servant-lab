import Robbins.Anthony.servant.Butler;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.lang.model.element.Name;

public class ButlerTest {

    private Butler testName;
    private Butler testAge;

    @BeforeEach
    public void setUp() {
        testName = new Butler("Chauncey", 45);
    }

    @Test
    @DisplayName("Butler - Name Test")
    public void testButlerName() {
        String expected = "Chauncey";
        String actual = testName.getName();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Butler - Age Test")
    public void testButlerAge() {
        Integer expected = 45;
        Integer actual = testName.getAge();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Butler - Constructor Test")
    public void testConstructor(){
    String name = "Chauncey";
    Integer age = 45;
    String expected = "Butler{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
        String actual = testName.toString();
        Assertions.assertEquals(expected, actual);

    }
}
