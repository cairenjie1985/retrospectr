package me.caixin.retrospectr.proxy.dynamicProxyByCGLIB;

import org.springframework.cglib.proxy.Enhancer;

public class CglibProxyFactory {

    public static UserService getInstance(CglibProxy proxy) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserService.class);
        //回调方法的参数为代理类对象CglibProxy，最后增强目标类调用的是代理类对象CglibProxy中的intercept方法
        enhancer.setCallback(proxy);
        // 此刻，base不是单纯的目标类，而是增强过的目标类
        return (UserService) enhancer.create();
    }

}
