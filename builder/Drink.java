package BuilderPattern;

/**
 * 实现了item接口的抽象drink类，提供了默认的功能
 */
public abstract class Drink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();
}
