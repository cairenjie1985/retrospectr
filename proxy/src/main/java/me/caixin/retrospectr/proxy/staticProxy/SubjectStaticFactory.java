package me.caixin.retrospectr.proxy.staticProxy;

public class SubjectStaticFactory {

    public static Subject getInstance() {
        return new ProxySubject(new RealSubject());
    }
}