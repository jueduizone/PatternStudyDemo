package DesignPattern.CreationalPattern.Singleton;

/**
 * 静态内部方式是懒汉模式
 * User: JamieXu
 * Time: 2016/11/9 上午12:32
 */
public class InnerStaticLazySingleton {
    //私有化构造函数
    private InnerStaticLazySingleton() {
    }
    //静态内部类
    private static class InnerClass {
        private static final InnerStaticLazySingleton singleton = new InnerStaticLazySingleton();
    }

    public static InnerStaticLazySingleton getSingleton() {
        return InnerClass.singleton;
    }
}
