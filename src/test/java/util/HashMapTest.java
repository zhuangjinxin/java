package test.java.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) {

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "zhuangjinxin");
        map.put("age", "18");
        map.put("gender", "male");
        int size = map.size();// 获取map的大小


        //第一种：通过Map.keySet遍历key和value（二次取值）
        for (String key : map.keySet()) {
            System.out.println("key= "+ key + " and value= " + map.get(key));
        }

        //第二种 通过Map.entrySet使用iterator遍历key和value(常用！！！！)
        Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Object> entry = it.next();
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }

        //第三种：通过Map.entrySet遍历key和value 推荐，尤其是容量大时(重要！！！)
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }

        //第四种 通过Map.values()遍历所有的value，但不能遍历key
        for (Object o : map.values()) {
            System.out.println("value= " + o);
        }
    }

    // 源码分析
    /**
     * 实现原理：数组+链表(红黑树)
     *
     * 扩容机制：达到Capacity*加载因子(0.75)，扩大一倍
     */
}
