# Builder Pattern
建造者模式（Builder Pattern）使用多个简单的对象一步一步构建成一个复杂的对象，这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式

一个 Builder 类会一步一步构造最终的对象。该 Builder 类是独立于其他对象的
主要解决在软件系统中，有时候面临着"一个复杂对象"的创建工作，其通常由各个部分的子对象用一定的算法构成；由于需求的变化，这个复杂对象的各个部分经常面临着剧烈的变化，但是将它们组合在一起的算法却相对稳定
## 优缺点

### 优点
1. 建造者独立，易扩展 
2. 便于控制细节风险

### 缺点
1. 产品必须有共同点，范围有限制
2. 如内部变化复杂，会有很多的建造类

## Builder Pattern Demo
以一次点餐的内容为例子的建造者模式演示
+ Item.java：食物种类的接口
+ Packing.java：包装类型的接口
+ Bottle.java：实现了packing接口的实体类
+ Wrapper.java：实现了packing接口的实体类
+ Burger.java：实现了item部分接口的burger类
+ Drink.java：实现了item部分接口接口的drink类
+ VegBurger.java、ChickenBurger.java：继承了burge的实体类
+ Coke.javaPepsi.java：继承了drink的实体类
+ Meal.java：点餐内容的实体类
+ BuliderTest.java：测试用例