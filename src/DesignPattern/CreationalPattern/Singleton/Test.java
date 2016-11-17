package DesignPattern.CreationalPattern.Singleton;

import DesignPattern.CreationalPattern.Singleton.EnumSingleton;

/**
 * User: JamieXu
 * Time: 2016/11/15 下午1:47
 */
public class Test {
    public static void main(String[] args) {
        EnumSingleton e1 = EnumSingleton.SINGLETON;
        EnumSingleton e2 = EnumSingleton.SINGLETON;
        Object o1 = EnumSingleton.methond2();
        Object o2 = EnumSingleton.methond2();

        System.out.println(o1 == o2);
        System.out.println(e1 == e2);

        System.out.println(e1.getClass());
        System.out.println(e2.getClass());

        EnumSingleton.SINGLETON.methond();
    }
}
