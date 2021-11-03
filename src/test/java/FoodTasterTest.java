import Robbins.Anthony.servant.Butler;
import Robbins.Anthony.servant.Dog;
import Robbins.Anthony.servant.FoodTaster;
import Robbins.Anthony.servant.Robot;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FoodTasterTest {

    private Dog dog;
    private Butler butler;
    private Robot robot;

    public void setUp(){
        dog = new Dog();
        butler = new Butler("Frankie", 60);
        robot = new Robot("Robert", "12345");

    }


    @Test
    @DisplayName(" ")
    public void test1(){
        FoodTaster taster = new FoodTaster(butler);
    }
}
