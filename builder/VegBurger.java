package BuilderPattern;

/**
 * 继承了抽象类burger的实体类
 */
public class VegBurger extends Burger {

    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public float price() {
        return 20.0f;
    }
}
