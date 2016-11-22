package DesignPattern.StructuralPattern.Proxy.DynamicMethod.JDK;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * User: JamieXu
 * Time: 2016/11/22 上午11:03
 */
public class LogProxyHandler implements InvocationHandler {
    private Object target;

    public LogProxyHandler(Object target) {
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
        System.out.println("日志 ==> 开始卖票");
        method.invoke(target);
        System.out.println("日志 ==> 结束卖票");
        return null;
    }
}
