import Robbins.Anthony.servant.Robot;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RobotTest {

    private Robot testName;
    private Robot testModelNumber;

    @BeforeEach
    public void setUp() {
        testName = new Robot("Lincoln", "y123z");
    }

    @Test
    @DisplayName("Robot - Name Test")
    public void testRobotName() {
        String expected = "Lincoln";
        String actual = testName.getName();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Robot - Model Number Test")
    public void testRobotModelNumber() {
        String expected = "y123z";
        String actual = testName.getModelNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Robot - Constructor Test")
    public void testConstructor(){
        String name = "Lincoln";
        String modelNumber = "y123z";
        String expected = "Robot{" +
                "name='" + name + '\'' +
                ", modelNumber='" + modelNumber + '\'' +
                '}';
        String actual = testName.toString();
        Assertions.assertEquals(expected, actual);

    }
}
