package DecoratorPattern;

import org.junit.Test;

public class DecoratorTest {

    @Test
    public void test(){
        Shape circle=new Circle();
        circle.draw();
        System.out.println("-----------------------");
        Shape redCircle=new RedShapeDecorator(new Circle());
        redCircle.draw();
    }
}
