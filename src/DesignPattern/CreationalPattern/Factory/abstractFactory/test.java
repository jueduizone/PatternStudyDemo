package DesignPattern.CreationalPattern.Factory.abstractFactory;

/**
 * User: JamieXu
 * Time: 2016/11/16 下午12:25
 */
public class test {
    public static void main(String[] args) {
        PhoneFactory factory = new MZPhoneFactory();
        Phone phone = factory.createPhone();
        Charger charger = factory.createCharger();
        phone.phoneMake();
        phone.test();
        charger.chargerMake();
        charger.test();
    }
}
