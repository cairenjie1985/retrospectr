package me.caixin.retrospectr.proxy.staticProxy;

public class ProxySubject implements Subject {

    private Subject delegate;

    ProxySubject(Subject delegate) {
        this.delegate = delegate;
    }

    public void dealTask(String taskName) {
        long stime = System.currentTimeMillis();
        //将请求分派给委托类处理
        delegate.dealTask(taskName);
        long ftime = System.currentTimeMillis();
        System.out.println("执行任务耗时"+(ftime - stime)+"毫秒");
    }
}
