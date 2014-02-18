package com.TW.proxysample;

import java.lang.reflect.Method;

/**
 * Created by twer on 18/02/2014.
 */
public class DoraProxy {

    private Dora dora;

    public DoraProxy() {
        this.dora = new Dora();
    }

    public void say() {
        doBefore();
        dora.say();
        doAfter();
    }

    private void doBefore() {
        System.out.println("before method invoke");
    }

    private void doAfter() {
        System.out.println("after method invoke");
    }

}
