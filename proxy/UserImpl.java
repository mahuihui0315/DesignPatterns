package com.spring.aop.proxydemo;

public class UserImpl implements User {
    @Override
    public void save() {
        System.out.println("存储用户");
    }

    @Override
    public void update() {
        System.out.println("更新用户");
    }
}
