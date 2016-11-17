package DesignPattern.CreationalPattern.Factory.factory;

/**
 * User: JamieXu
 * Time: 2016/11/16 下午12:22
 */
public class MiPhoneFactory extends PhoneFactory {
    @Override
    protected Phone createPhone() {
        Phone phone = new MiPhone();
        return phone;
    }
}
