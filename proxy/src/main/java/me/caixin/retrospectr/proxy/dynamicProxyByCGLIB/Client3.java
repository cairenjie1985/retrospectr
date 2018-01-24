package me.caixin.retrospectr.proxy.dynamicProxyByCGLIB;

public class Client3 {

    public static void main(String[] args) {
        CglibProxy proxy = new CglibProxy();
        // userService为生成的增强过的目标类
        UserService userService = CglibProxyFactory.getInstance(proxy);
        userService.add();
    }

}
