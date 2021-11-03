import Robbins.Anthony.servant.Food;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FoodTest {
    private Food testFood;
    private Food testFood2;

    @BeforeEach
    public void setUp(){
        testFood = new Food("chicken", true);
        testFood2 = new Food("paint", false);
    }

    @Test
    @DisplayName("TEST - FOOD SAFETY")
    public void testFoodSafety(){
        Boolean actual = testFood.getSafe();
        Assertions.assertTrue(actual);
    }

    @Test
    @DisplayName("TEST2 - FOOD SAFETY")
    public void testFoodSafetyTwo(){
        Boolean actual = testFood2.getSafe();
        Assertions.assertFalse(actual);
    }

}
