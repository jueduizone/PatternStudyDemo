package DesignPattern.CreationalPattern.Factory.simple;

/**
 * User: JamieXu
 * Time: 2016/11/16 上午12:43
 */
public class MiPhone extends Phone {
    @Override
    public void make() {
        super.setBrand("Mi");
        System.out.println(super.getBrand() + "牌手机生产.");
    }
}
