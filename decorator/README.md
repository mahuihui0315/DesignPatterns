# Decorator Pattern
装饰器模式（Decorator Pattern）允许向一个现有的对象添加新的功能，同时又不改变其结构。这种类型的设计模式属于结构型模式，它是作为现有的类的一个包装。

## 优缺点

### 优点
装饰类和被装饰类可以独立发展，不会相互耦合，装饰模式是继承的一个替代模式，装饰模式可以动态扩展一个实现类的功能。

### 缺点
多层装饰比较复杂。

## Decorator Pattern Demo
+ Shape.java：shape的接口
+ Rectangle.java：实现shape接口的rectangle类
+ Circle.java：实现shape接口的circle类
+ ShapeDecorator.java：实现了shape接口的抽象装饰类
+ RedShapeDecorator.java：扩展了shapedecorator类的实体装饰类
+ DecoratorTest.java：测试用例