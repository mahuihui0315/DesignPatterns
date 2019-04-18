package FactoryMethod;


import org.junit.Test;

public class FactoryTest {

    @Test
    public void rectangleTest(){
        ShapeFactory factory=new ShapeFactory();
        Shape shape=factory.getShape("rectangle");
        shape.drow();
    }

    @Test
    public void squareTest(){
        ShapeFactory factory=new ShapeFactory();
        Shape shape=factory.getShape("square");
        shape.drow();
    }
}
