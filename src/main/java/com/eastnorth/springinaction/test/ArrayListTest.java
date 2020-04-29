package com.eastnorth.springinaction.test;

import java.util.*;

/**
 * @author zuojianhou
 * @Date: 2020/4/28
 * @Description:
 */
public class ArrayListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("xja");
        list.add("hdd");
        list.add("shd");
        list.add("bsn");
        Collections.sort(list);
        System.out.println(list);
    }
}
