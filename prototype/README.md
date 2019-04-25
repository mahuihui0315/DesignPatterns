# Prototype Pattern
原型模式（Prototype Pattern）是用于创建重复的对象，同时又能保证性能。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。

这种模式是实现了一个原型接口，该接口用于创建当前对象的克隆。当直接创建对象的代价比较大时，则采用这种模式。例如，一个对象需要在一个高代价的数据库操作之后被创建。我们可以缓存该对象，在下一个请求时返回它的克隆，在需要的时候更新数据库，以此来减少数据库调用

## 优缺点

### 优点 
1. 性能提高
2. 逃避构造函数的约束

### 缺点
1. 配备克隆方法需要对类的功能进行通盘考虑，这对于全新的类不是很难，但对于已有的类不一定很容易，特别当一个类引用不支持串行化的间接对象，或者引用含有循环结构的时候
2. 必须实现 Cloneable 接口

## Prototype Pattern Demo
+ Shape.java: 实现了Cloneable接口的Shape抽象类
+ Rectangle.java: 继承了Shape类的实体类
+ Square.java: 继承了Shape类的实体类
+ ShapeCache.java: 该类从别处获取shape实体类,并存储到HashTable中,
外部类通过该类的getShape方法获取实体类的克隆
+ PrototypeTest.java: 测试用例