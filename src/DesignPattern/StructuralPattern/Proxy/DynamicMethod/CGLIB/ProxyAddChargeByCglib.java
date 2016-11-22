package DesignPattern.StructuralPattern.Proxy.DynamicMethod.CGLIB;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * User: JamieXu
 * Time: 2016/11/22 下午2:27
 */
public class ProxyAddChargeByCglib implements MethodInterceptor {
    //为被代理对象创建代理类
    private Enhancer enhancer = new Enhancer();

    public Object getProxy(Class clazz) {
        //创建被代理类的子类
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    /**
     * 拦截所有被代理类的方法的调用
     *
     * @param o           被代理类的实例
     * @param method      被代理类方法的反射对象
     * @param objects     方法的参数
     * @param methodProxy 代理类的实例
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //代理类调用父类的方法
        methodProxy.invokeSuper(o, objects);
        System.out.println("收取了手续费5元!");
        return null;
    }
}
