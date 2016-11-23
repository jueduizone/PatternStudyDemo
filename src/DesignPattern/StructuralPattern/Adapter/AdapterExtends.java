package DesignPattern.StructuralPattern.Adapter;

/**
 * User: JamieXu
 * Time: 2016/11/23 下午2:51
 */
public class AdapterExtends extends ChargeJack implements Socket  {
    @Override
    public void output() {
        System.out.print("通过电源适配器");
        this.charge();
    }
}
