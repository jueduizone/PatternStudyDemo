package DesignPattern.CreationalPattern.Factory.simple;

/**
 * User: JamieXu
 * Time: 2016/11/16 上午12:41
 */
public class MZPhone extends Phone {
    @Override
    public void make() {
        super.setBrand("MZ");
        System.out.println(super.getBrand() + "牌手机生产.");
    }
}
