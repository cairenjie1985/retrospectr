package me.caixin.retrospectr.proxy.staticProxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RealSubject implements ProxySubject {

    private static final Logger logger = LoggerFactory.getLogger(RealSubject.class);

    public void dealTask(String taskName) {
        logger.info("正在执行任务："+taskName);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
