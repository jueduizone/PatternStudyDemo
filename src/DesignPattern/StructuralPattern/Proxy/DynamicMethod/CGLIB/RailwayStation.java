package DesignPattern.StructuralPattern.Proxy.DynamicMethod.CGLIB;

import java.util.Random;

/**
 * User: JamieXu
 * Time: 2016/11/22 下午2:26
 */
public class RailwayStation {
    //买票方法
    public void saleTicket() {
        //随机生成一个价格
        int price = new Random().nextInt(100);
        System.out.println("一本正经的卖票,价格:" + price + "元");
    }
}
