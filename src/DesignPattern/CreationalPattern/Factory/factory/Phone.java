package DesignPattern.CreationalPattern.Factory.factory;

/**
 * User: JamieXu
 * Time: 2016/11/16 上午12:32
 */
public abstract class Phone {
    //配置
    private String brand;
    public abstract void make();
    public void test() {
        System.out.println(brand + "牌手机测试.");
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
}
