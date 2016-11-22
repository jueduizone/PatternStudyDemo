package DesignPattern.StructuralPattern.Proxy.StaticMethod;


/**
 * User: JamieXu
 * Time: 2016/11/21 下午6:15
 */
public class Test {
    public static void main(String[] args) {
        RailwayStation ticketBusiness = new RailwayStation();
        ProxyByAddChargePoly proxyByPoly = new ProxyByAddChargePoly(ticketBusiness);
        ProxyAddLogByPoly proxyAddLogByPoly = new ProxyAddLogByPoly(proxyByPoly);
        proxyAddLogByPoly.saleTicket();
    }
}
