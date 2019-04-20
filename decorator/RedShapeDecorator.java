package DecoratorPattern;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
        decoratorShape.draw();
        setRedBorder();
    }

    private void setRedBorder(){
        System.out.println("The color of this circle is red");
    }
}
