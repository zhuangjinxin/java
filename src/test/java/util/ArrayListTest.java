package test.java.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayListTest {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("Hello");list.add("World");//增加指定元素到链表尾部
        list.add(2,"zhuangjinxin");//在指定位置添加元素
        list.remove(2);//删除指定位置的元素
        list.remove("World");//删除链表中的指定元素
        list.clear();//删除链表中的所有元素
        list.add("Hello");list.add("World");
        list.set(1,"java");//修改指定位置的元素
        String s0 = list.get(1);//获取链表中指定位置的元素
        boolean hasFlag = list.contains("java");//检查链表是否包含指定元素
        int index = list.indexOf("java");//返回元素在链表中第一次出现的位置
        int lastIndex = list.lastIndexOf("java");//返回元素在链表中最后一次出现的位置
        boolean isEmpty = list.isEmpty();//检查链表是否为空
        int size = list.size();//获取链表大小


        //第一种遍历 使用foreach遍历
        for (String str : list) {
            System.out.println(str);
        }

        //第二种遍历 循环使用元素的索引和链表的大小
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        //第三种遍历 使用迭代器进行遍历
        Iterator<String> ite=list.iterator();
        while(ite.hasNext()){
            System.out.println(ite.next());
        }

        // 源码分析
        /**
         * 实现原理：动态数组
         *
         * 添加元素前扩容，以保证数组不会越界；
         * 扩容大小：max(1.5*oldCapacity,minCapacity)
         * add(E e)、add(int index,E e) : minCapacity=size+1;
         * addAll(Collection c)、addAll(int index,Collection c): minCapacity=size+c.toArray.length;
         *
         */

        //Idea小技巧
        List<String> stringList = new ArrayList<String>();
        for (String s : stringList) {
            
        }

    }
}
