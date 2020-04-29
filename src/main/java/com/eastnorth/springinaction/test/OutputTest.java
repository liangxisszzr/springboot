package com.eastnorth.springinaction.test;

import com.eastnorth.springinaction.bean.ParentBean;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author zuojianhou
 * @Date: 2020/4/27
 * @Description:
 */
public class OutputTest {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("test.ser");
        ObjectOutputStream os = new ObjectOutputStream(fileOutputStream);
        ParentBean parentBean1 = new ParentBean();
        parentBean1.setName("1");
        parentBean1.setSex("m");
        ParentBean parentBean2 = new ParentBean();
        parentBean2.setName("2");
        parentBean2.setSex("n");
        os.writeObject(parentBean1);
        os.writeObject(parentBean2);
        os.close();
    }
}