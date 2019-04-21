# Composite Pattern
组合模式（Composite Pattern），又叫部分整体模式，是用于把一组相似的对象当作一个单一的对象。组合模式依据树形结构来组合对象，用来表示部分以及整体层次。这种类型的设计模式属于结构型模式，它创建了对象组的树形结构

## 优缺点

### 优点
1. 高层模块调用简单 
2. 节点自由增加

### 缺点
在使用组合模式时，其叶子和树枝的声明都是实现类，而不是接口，违反了依赖倒置原则

**依赖倒置原则：** （Dependence Inversion Principle）程序要依赖于抽象接口，不要依赖于具体实现。简单的说就是要求对抽象进行编程，不要对实现进行编程，这样就降低了客户与实现模块间的耦合

## Composite Pattern Demo
+ Employee.java：使用组合模式的employee类
+ CompositeTest.java：测试用例