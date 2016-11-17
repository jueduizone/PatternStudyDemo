package DesignPattern.CreationalPattern.Factory.abstractFactory;

/**
 * User: JamieXu
 * Time: 2016/11/16 下午2:56
 */
public class MiCharger extends Charger {
    @Override
    public void chargerMake() {
        super.setBrand("Mi");
        System.out.println(super.getBrand() + "牌充电器生产.");
    }
}
