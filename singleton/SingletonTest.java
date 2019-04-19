package SingletonPattern;

public class SingletonTest {

    public static void main(String[] args){
        //因为private修饰，因此构造函数不可见
        //SingleObject singleObject=new SingleObject();

        //获取唯一实例
        SingleObject singleObject= SingleObject.getSingleObject();
        singleObject.printMessage();
    }
}
