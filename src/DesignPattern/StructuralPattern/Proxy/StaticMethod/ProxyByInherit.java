package DesignPattern.StructuralPattern.Proxy.StaticMethod;

/**
 * 继承的方式实现静态代理,增加收手续费的方法
 * User: JamieXu
 * Time: 2016/11/21 下午6:10
 */
public class ProxyByInherit extends RailwayStation {
    //重写父类方法,进行需要增加的操作
    @Override
    public void saleTicket() {
        super.saleTicket();
        //增加收手续费的方法
        System.out.println("收取了手续费5元!");
    }
}
