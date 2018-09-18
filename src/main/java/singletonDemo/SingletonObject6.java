package singletonDemo;

import java.util.stream.IntStream;

/**
 * 懒加载单例
 * 性能最优
 *
 */
public class SingletonObject6 {

    private SingletonObject6() {
    }

    private static class InstanceHolder{
        private final static SingletonObject6 instance = new SingletonObject6();  //static在Java中的jvm只会创建一份
    }

    public static SingletonObject6 getInstance(){
        return InstanceHolder.instance;
    }


    public static void main(String[] args) {

        IntStream.rangeClosed(1,100).forEach(i -> new Thread(String.valueOf(i)){
            @Override
            public void run(){
                System.out.println(SingletonObject6.getInstance());
            }

        }.start());
    }
}
