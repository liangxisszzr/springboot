package com.eastnorth.springinaction.service;

/**
 * @author zuojianhou
 * @Date: 2020/4/27
 * @Description:
 */
public class StaticTest {

    private static int i;

    private int j;

    private static void say() {
        System.out.println("static method");
        i++;
    }

    public void talk() {
        i++;
        System.out.println("no static method");
        System.out.println(i);
        say();
        System.out.println(i);
        j++;
        System.out.println(j);
    }
}
