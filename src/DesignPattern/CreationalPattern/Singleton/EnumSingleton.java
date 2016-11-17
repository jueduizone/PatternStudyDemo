package DesignPattern.CreationalPattern.Singleton;

/**
 * User: JamieXu
 * Time: 2016/11/15 上午11:44
 */
public enum EnumSingleton {
    SINGLETON;

    //实现具体业务逻辑的方法 EnumSingleton.SINGLETON.methond() 调用
    public Object methond() {
        return null;
    }

    //实现具体业务逻辑的方法 可直接 EnumSingleton.methond2() 调用
    public static Object methond2() {
        return null;
    }


}
