package PrototypePattern;

/**
 * 继承了Shape类的实体类
 */
public class Square extends Shape {

    public  Square(){
        type="Square";
    }

    @Override
    void draw() {
        System.out.println("draw a square");
    }
}
