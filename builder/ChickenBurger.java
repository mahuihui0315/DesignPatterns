package BuilderPattern;

/**
 * 继承了抽象类burger的实体类
 */
public class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "ChickenBurger";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
