package DesignPattern.CreationalPattern.Factory.abstractFactory;

/**
 * 充电器抽象类
 * User: JamieXu
 * Time: 2016/11/16 下午2:47
 */
public abstract class Charger {
    //品牌
    private String brand;
    public abstract void chargerMake();
    public void test() {
        System.out.println(brand + "牌充电器测试.");
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
}
