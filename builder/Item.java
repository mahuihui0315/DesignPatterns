package BuilderPattern;

/**
 * 食物条目接口
 */
public interface Item {
    String name();
    Packing packing();
    float price();
}
