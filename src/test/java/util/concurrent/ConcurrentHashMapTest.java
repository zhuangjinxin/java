package test.java.util.concurrent;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {

    public static void main(String[] args) {
        Map<String,Object> concurrentHashMap = new ConcurrentHashMap<String,Object>(17);
        concurrentHashMap.put("name","zhuangjinxin");
        System.out.println(concurrentHashMap.size());
    }

}
