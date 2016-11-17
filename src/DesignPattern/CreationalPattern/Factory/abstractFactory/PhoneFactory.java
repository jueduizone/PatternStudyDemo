package DesignPattern.CreationalPattern.Factory.abstractFactory;

/**
 * User: JamieXu
 * Time: 2016/11/16 下午12:19
 */
public abstract class PhoneFactory {
    //生产手机
    protected abstract Phone createPhone();

    //生产充电器
    protected abstract Charger createCharger();
}
