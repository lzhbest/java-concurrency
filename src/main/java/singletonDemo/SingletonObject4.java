package singletonDemo;

/**
 * 懒加载单例
 * 解决了懒加载严格意义上的单例，也解决了性能问题
 * 缺陷:可能会引起空指针异常
 * 当一个线程进行构造时，在内存中开辟一块堆内存进行存储，之后就进行返回， 下一个线程来时发现实现非空，直接获取实例
 * 但是在构造函数中有些属性还没有加载完（有外部引用），因为Java会在虚拟机进行编译优化，所以当第二个线程直接取实例时就报空指针
 */
public class SingletonObject4 {

    private static SingletonObject4 instance;

    private SingletonObject4() {
    }

    public static SingletonObject4 getInstance() {
        if (null == instance) {
            synchronized (SingletonObject4.class) {
                if (null == instance) {
                    instance = new SingletonObject4();
                }
            }
        }
        return SingletonObject4.instance;

    }
}
