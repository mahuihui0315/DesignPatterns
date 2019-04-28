# Adapter Pattern
适配器模式（Adapter Pattern）是作为两个不兼容的接口之间的桥梁。这种类型的设计模式属于结构型模式，它结合了两个独立接口的功能

这种模式涉及到一个单一的类，该类负责加入独立的或不兼容的接口功能。举个真实的例子，读卡器是作为内存卡和笔记本之间的适配器。您将内存卡插入读卡器，再将读卡器插入笔记本，这样就可以通过笔记本来读取内存卡

## 优缺点

### 优点
1. 可以让任何两个没有关联的类一起运行
2. 提高了类的复用
3. 灵活性好

### 缺点
1. 过多地使用适配器，会让系统非常零乱，不易整体进行把握。
比如，明明看到调用的是 A 接口，其实内部被适配成了 B 接口的实现
2. 由于 JAVA 至多继承一个类，所以至多只能适配一个适配者类

## Adapter Pattern Demo
+ MediaPlayer.java: 媒体播放器接口
+ AdvancedMediaPlayer.java: 高级媒体播放器接口
+ Mp4Player.java: 实现了AdvancedMedaiPlayer接口的Mp4播放器实例
+ VlcPlayer.java: 实现了AdvancedMedaiPlayer接口的Vlc播放器实例
+ MediaAdapter.java: 媒体播放器适配器
+ AudioPlayer.java: 实现了MediaPlayer接口的mp3播放器实例
+ AdapterTest.java: 测试用例