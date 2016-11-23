package DesignPattern.StructuralPattern.Adapter;

/**
 * 适配器类,进行电源转换
 * User: JamieXu
 * Time: 2016/11/23 下午2:31
 */
public class Adapter implements Socket {

    private ChargeJack chargeJack;

    public Adapter(ChargeJack chargeJack) {
        this.chargeJack = chargeJack;
    }

    @Override
    public void output() {
        System.out.println("通过电源适配器");
        chargeJack.charge();
    }
}
