package DesignPattern.StructuralPattern.Adapter;

/**
 * 笔记本的充电接口
 * User: JamieXu
 * Time: 2016/11/23 下午2:25
 */
public class ChargeJack {

    //充电方法 比如只能接受输入20V
    public void charge() {
        System.out.println("正在接受20V电流充电");
    }
}
