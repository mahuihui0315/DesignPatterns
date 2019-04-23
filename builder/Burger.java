package BuilderPattern;

/**
 * 实现了item接口的抽象burger类，提供了默认的功能
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    public abstract float price();
}
