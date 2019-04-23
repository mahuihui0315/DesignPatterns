package BuilderPattern;

/**
 * 继承了抽象类drink的实体类
 */
public class Pepsi extends Drink {
    @Override
    public String name() {
        return "pepsi";
    }

    @Override
    public float price() {
        return 12.0f;
    }
}
