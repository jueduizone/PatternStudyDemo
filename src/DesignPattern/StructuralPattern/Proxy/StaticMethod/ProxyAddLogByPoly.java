package DesignPattern.StructuralPattern.Proxy.StaticMethod;

/**
 * 通过代理实现日志记录功能
 * User: JamieXu
 * Time: 2016/11/21 下午6:28
 */
public class ProxyAddLogByPoly implements TicketBusiness {
    TicketBusiness ticketBusiness;

    public ProxyAddLogByPoly(TicketBusiness ticketBusiness) {
        this.ticketBusiness = ticketBusiness;
    }

    @Override
    public void saleTicket() {
        System.out.println("日志 ==> 开始卖票");
        ticketBusiness.saleTicket();
        System.out.println("日志 ==> 结束卖票");
    }
}
