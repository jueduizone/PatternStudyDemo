package DesignPattern.CreationalPattern.Factory.abstractFactory;

/**
 * User: JamieXu
 * Time: 2016/11/16 下午12:24
 */
public class MZPhoneFactory extends PhoneFactory {
    @Override
    protected Phone createPhone() {
        Phone phone = new MZPhone();
        return phone;
    }

    @Override
    protected Charger createCharger() {
        Charger charger = new MZCharger();
        return charger;
    }
}
