package com.spring.aop.proxydemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class GetProxy implements InvocationHandler {
    private User user;
    public GetProxy(User user){
        this.user=user;
    }
    public User createProxy(){
        User userProxy= (User) Proxy.newProxyInstance(user.getClass().getClassLoader(),user.getClass().getInterfaces(),this);
        return userProxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("save")){
            System.out.println("检查用户信息");
            return method.invoke(user,args);
        }
        return method.invoke(user,args);
    }
}
