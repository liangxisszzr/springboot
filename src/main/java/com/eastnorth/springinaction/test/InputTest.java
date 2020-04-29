package com.eastnorth.springinaction.test;

import com.eastnorth.springinaction.bean.ParentBean;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author zuojianhou
 * @Date: 2020/4/27
 * @Description:
 */
public class InputTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("test.ser");
        ObjectInputStream os = new ObjectInputStream(fileInputStream);

        ParentBean bean1 = new ParentBean();
        ParentBean bean2 = new ParentBean();

        try {
            Object one = os.readObject();
            Object two = os.readObject();
            bean1 = (ParentBean) one;
            bean2 = (ParentBean) two;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(bean1.toString());
        System.out.println(bean2.toString());
    }
}
