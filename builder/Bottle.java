package BuilderPattern;

/**
 * bottle类型的包装
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
