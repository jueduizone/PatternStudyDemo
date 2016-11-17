package DesignPattern.CreationalPattern.Singleton;

/**
 * 单例模式 饿汉模式
 * User: JamieXu
 * Time: 2016/11/9 上午12:15
 */
public class HungrySingleton {
    //私有化构造函数
    private HungrySingleton() {
    }

    //类加载初始化时就创建对象,进行实例化
    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    //对外提供对象的获取方法,实现单例
    public static HungrySingleton getSingleton() {
        return hungrySingleton;
    }
}
