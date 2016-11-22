package DesignPattern.StructuralPattern.Proxy.StaticMethod;


/**
 * User: JamieXu
 * Time: 2016/11/21 下午6:17
 */
public class ProxyByAddChargePoly implements TicketBusiness {
    TicketBusiness ticketBusiness;

    //通过构造函数方式调用被代理对象
    public ProxyByAddChargePoly(TicketBusiness ticketBusiness) {
        this.ticketBusiness = ticketBusiness;
    }

    @Override
    public void saleTicket() {
        //调用被代理对象的方法
        ticketBusiness.saleTicket();
        //增加收手续费的方法
        System.out.println("收取了手续费5元!");
    }
}
