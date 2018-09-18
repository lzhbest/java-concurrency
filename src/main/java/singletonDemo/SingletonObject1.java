package singletonDemo;

/**
 * 饿汉式单例，只要调用类就直接加载了实例
 * 一段时间不用会一直占着内存，不能懒加载
 */
public class SingletonObject1 {

    private static final SingletonObject1 instance = new SingletonObject1();
    private SingletonObject1(){}

    public static SingletonObject1 getInstance(){
        return instance;
    }
}
