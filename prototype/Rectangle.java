package PrototypePattern;

/**
 * 继承了Shape类的实体类
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type="Rectangle";
    }
    @Override
    public void draw() {
        System.out.println("draw a rectangle");
    }
}
