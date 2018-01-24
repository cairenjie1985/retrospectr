package me.caixin.retrospectr.proxy.dynamicProxyByJDK;

public class Client2 {

    public static void main(String[] args) {
        //生成的代理类保存到磁盘
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        UserService service = new UserServiceImpl();
        MyInvocationHandler handler = new MyInvocationHandler(service);
        UserService proxy = (UserService) handler.getProxy();
        proxy.add();
    }

}
