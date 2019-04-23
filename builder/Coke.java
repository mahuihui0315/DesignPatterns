package BuilderPattern;

/**
 * 继承了抽象类drink的实体类
 */
public class Coke extends Drink {
    @Override
    public String name() {
        return "coke";
    }

    @Override
    public float price() {
        return 10.0f;
    }
}
