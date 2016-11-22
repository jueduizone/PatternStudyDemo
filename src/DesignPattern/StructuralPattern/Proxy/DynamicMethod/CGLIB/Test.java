package DesignPattern.StructuralPattern.Proxy.DynamicMethod.CGLIB;

/**
 * User: JamieXu
 * Time: 2016/11/22 下午2:36
 */
public class Test {
    public static void main(String[] args) {
        ProxyAddChargeByCglib proxy = new ProxyAddChargeByCglib();
        //获取动态代理
        RailwayStation r = (RailwayStation) proxy.getProxy(RailwayStation.class);
        r.saleTicket();
    }
}
