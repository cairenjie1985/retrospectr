package me.caixin.retrospectr.proxy.staticProxy;

public class Client1 {

    /**
     * 为某个对象提供一个代理，以控制对这个对象的访问。
     * 代理类和委托类有共同的父类或父接口，这样在任何使用委托类对象的地方都可以用代理对象替代。
     * 代理类负责请求的预处理、过滤、将请求分派给委托类处理、以及委托类执行完请求后的后续处理。
     * @param args
     */
    public static void main(String[] args) {
        Subject proxy = SubjectStaticFactory.getInstance();
        proxy.dealTask("DBQueryTask");
    }

}
