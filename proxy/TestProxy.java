package com.spring.aop.proxydemo;

import org.junit.Test;

public class TestProxy {
    @Test
    /**
     * jdk动态代理测试
     */
    public void test(){
        User user=new UserImpl();
        user.save();
        user.update();

        User proxyUser=new GetProxy(user).createProxy();
        proxyUser.save();
        proxyUser.update();
    }
}
