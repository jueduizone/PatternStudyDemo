package DesignPattern.CreationalPattern.Singleton;

/**
 * 双重校验锁 懒汉式
 * User: JamieXu
 * Time: 2016/11/9 上午12:37
 */
public class DoubleCheckLazySingleton {

    public volatile static DoubleCheckLazySingleton doubleCheckLazySingleton;

    private DoubleCheckLazySingleton() {
    }

    public static DoubleCheckLazySingleton getSingleton() {
        if (doubleCheckLazySingleton == null) {
            synchronized (DoubleCheckLazySingleton.class) {
                if (doubleCheckLazySingleton == null) {
                    doubleCheckLazySingleton = new DoubleCheckLazySingleton();
                }
            }
        }
        return doubleCheckLazySingleton;
    }
}
