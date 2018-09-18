package singletonDemo;

/**
 * 懒加载单例
 * 缺陷：有可能存在生成多个实例
 */
public class SingletonObject2 {

    private static SingletonObject2 instance;

    private SingletonObject2() {
    }

    public static SingletonObject2 getInstance() {
        if (null == instance) {
            instance = new SingletonObject2();
        }
        return SingletonObject2.instance;

    }
}
