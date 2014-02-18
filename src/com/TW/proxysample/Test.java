package com.TW.proxysample;

/**
 * Created by twer on 17/02/2014.
 */
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        Robot dora = new Dora();
        Handler handler = new Handler(dora);

        //创建动态代理对象
        Robot proxy=(Robot)Proxy.newProxyInstance(
                dora.getClass().getClassLoader(),
                dora.getClass().getInterfaces(),
                handler);
        proxy.say();
    }
}
