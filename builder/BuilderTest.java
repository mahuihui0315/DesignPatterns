package BuilderPattern;

import org.junit.Test;

public class BuilderTest {
    @Test
    public void builderTest(){
        Meal meal=new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new ChickenBurger());
        meal.addItem(new Coke());
        meal.getItems();
    }
}
