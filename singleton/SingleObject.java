package SingletonPattern;

public class SingleObject {
    //创建SingletonObject的唯一实例
    private static SingleObject singleObject=new SingleObject();
    //私有化构造函数，防止被继承
    private SingleObject(){
    }
    //public方法用于外界类获取Singleton实例
    public static SingleObject getSingleObject(){
        return singleObject;
    }

    public void printMessage(){
        System.out.println("Singleton Pattern");
    }
}
