package PrototypePattern;

import org.junit.Before;
import org.junit.Test;


public class PrototypeTest {

    @Before
    public void init(){
        ShapeCache.localShape();
    }

    @Test
    public void shapeTest(){
        Shape clonedRectangle=ShapeCache.getShape("1");
        clonedRectangle.draw();

        Shape clonedSquare=ShapeCache.getShape("2");
        clonedSquare.draw();
    }
}
