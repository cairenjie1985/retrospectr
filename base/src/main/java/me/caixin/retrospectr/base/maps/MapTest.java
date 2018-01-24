package me.caixin.retrospectr.base.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class MapTest {

    /**
     * WeakHashMap 不是不做操作就会自动释放内部不用的对象的，而是在你访问它的内容的时候释放内部不用的对象。
     * WeakHashMap 是基于java弱引用实现的HashMap而且在结构上基本和HashMap一致
     */
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        Map weakHashMap = new WeakHashMap();
        Map map = new HashMap();
        map.put(a, "aaa");
        map.put(b, "bbb");


        weakHashMap.put(a, "aaa");
        weakHashMap.put(b, "bbb");

        map.remove(a);

        a=null;
        b=null;
        weakHashMap.put(b,null);
        // WeakHashMap是主要通过expungeStaleEntries这个函数的来实现移除其内部不用的条目从而达到的自动释放内存的目的的.
        // 基本上只要对WeakHashMap的内容进行访问就会调用这个函数，从而达到清除其内部不在为外部引用的条目。
        System.gc();
        Iterator i = map.entrySet().iterator();
        while (i.hasNext()) {
            Map.Entry en = (Map.Entry)i.next();
            System.out.println("map:"+en.getKey()+":"+en.getValue());
        }

        Iterator j = weakHashMap.entrySet().iterator();
        while (j.hasNext()) {
            Map.Entry en = (Map.Entry)j.next();
            System.out.println("weakHashMap:"+en.getKey()+":"+en.getValue());

        }
    }
}
