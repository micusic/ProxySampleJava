package com.TW.proxysample;

/**
 * Created by twer on 17/02/2014.
 */
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        DoraProxy doraProxy = new DoraProxy();
        doraProxy.say();
    }
}
