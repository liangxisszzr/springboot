package com.eastnorth.springinaction.bean;

/**
 * @author zuojianhou
 * @Date: 2020/4/26
 * @Description:
 */
public class ChildBean extends ParentBean {
    public String name;
    public int sex;
    public boolean flag;

    public ChildBean() {
        name = "ok";
        sex = 1;
        flag = true;
    }

    @Override
    public String toString() {
        return "ChildBean{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", flag=" + flag +
                '}';
    }
}
