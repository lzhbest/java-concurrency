package singletonDemo;

/**
 * 懒加载单例
 * 缺陷：每次调用都进行synchronized，第二次以上的线程都是读操作了，所以影响性能
 */
public class SingletonObject3 {

    private static SingletonObject3 instance;

    private SingletonObject3() {
    }

    public synchronized static SingletonObject3 getInstance() {
        if (null == instance) {
            instance = new SingletonObject3();
        }
        return SingletonObject3.instance;

    }
}
