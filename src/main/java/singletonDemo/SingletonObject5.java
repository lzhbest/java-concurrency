package singletonDemo;

/**
 * 懒加载单例
 * 解决了Double Check空指针问题
 *
 */
public class SingletonObject5 {

    private static volatile SingletonObject5 instance;    //保证内存可见性，多个线程看到的是同一份，同时也不让JVM进行编译优化

    private SingletonObject5() {
    }

    public static SingletonObject5 getInstance() {
        if (null == instance) {
            synchronized (SingletonObject5.class) {
                if (null == instance) {
                    instance = new SingletonObject5();
                }
            }
        }
        return SingletonObject5.instance;

    }
}
