package DesignPattern.CreationalPattern.Factory.abstractFactory;

/**
 * User: JamieXu
 * Time: 2016/11/16 下午2:57
 */
public class MZCharger extends Charger {
    @Override
    public void chargerMake() {
        super.setBrand("MZ");
        System.out.println(super.getBrand() + "牌充电器生产.");
    }
}
