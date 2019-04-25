package PrototypePattern;

import java.util.Hashtable;

/**
 * 该类从别处获取shape实体类,并存储到HashTable中,
 * 外部类通过该类的getShape方法获取实体类的克隆
 */
public class ShapeCache {
    private static Hashtable<String,Shape> shapeTable=new Hashtable<>();

    public static Shape getShape(String shapeId){
        Shape cacheShape=shapeTable.get(shapeId);
        return (Shape) cacheShape.clone();
    }

    //假设从别处获取shape实例并存储进shapeTable
    public static void localShape(){
        Shape rectangle=new Rectangle();
        rectangle.setId("1");
        shapeTable.put(rectangle.getId(),rectangle);

        Shape square=new Square();
        square.setId("2");
        shapeTable.put(square.getId(),square);
    }
}
