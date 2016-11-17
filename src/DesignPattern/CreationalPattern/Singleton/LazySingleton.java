package DesignPattern.CreationalPattern.Singleton;

/**
 * 单例模式 懒汉模式
 * User: JamieXu
 * Time: 2016/11/8 下午11:39
 */
public class LazySingleton {
    //私有化构造函数
    private LazySingleton() {
    }

    //创建私有静态对象
    private static LazySingleton lazySingleton = null;

    //对外提供对象的获取方法,实现单例
    public static LazySingleton getLazySingleton() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
