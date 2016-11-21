package DesignPattern.StructuralPattern.Proxy.StaticMethod;


import java.util.Random;

/**
 * User: JamieXu
 * Time: 2016/11/21 下午5:46
 */
public class RailwayStation implements TicketBusiness {
    //实现买票方法
    @Override
    public void saleTicket() {
        //随机生成一个价格
        int price = new Random().nextInt(100);
        System.out.println("一本正经的卖票,价格:" + price + "元");
    }
}
