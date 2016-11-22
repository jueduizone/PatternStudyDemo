package DesignPattern.StructuralPattern.Proxy.DynamicMethod.JDK;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;


/**
 * User: JamieXu
 * Time: 2016/11/22 上午10:43
 */
public class Test {
    public static void main(String[] args) {
        RailwayStation rs = new RailwayStation();
        Class<?> c = rs.getClass();
        //收费代理类
        InvocationHandler handler = new ChargeProxyHandler(rs);
        /**
         * 通过Proxy的newProxyInstance方法动态创建代理类
         *    newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h)
         * loader: 类加载器
         * interfaces: 实现接口
         * InvocationHandler 代理类(事务处理类)
         */
        TicketBusiness t = (TicketBusiness) Proxy.newProxyInstance(c.getClassLoader(), c.getInterfaces(), handler);
        //日志代理类,注意这里传入的是上面动态生成的代理类
        InvocationHandler logHandler = new LogProxyHandler(t);
        TicketBusiness t2 = (TicketBusiness) Proxy.newProxyInstance(c.getClassLoader(), c.getInterfaces(), logHandler);

        t2.saleTicket();
    }
}
