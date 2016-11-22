package DesignPattern.StructuralPattern.Proxy.DynamicMethod.JDK;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * User: JamieXu
 * Time: 2016/11/22 上午10:34
 */
public class ChargeProxyHandler implements InvocationHandler {

    private Object target;

    public ChargeProxyHandler(Object target) {
        this.target = target;
    }

    /**
     * @param proxy  被代理对象
     * @param method 被代理对象的方法
     * @param args   方法的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method.invoke(target);
        //增加收手续费的方法
        System.out.println("收取了手续费5元!");
        return null;
    }
}
