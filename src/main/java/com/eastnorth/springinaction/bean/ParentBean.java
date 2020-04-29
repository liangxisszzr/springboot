package com.eastnorth.springinaction.bean;

import java.io.Serializable;

/**
 * @author zuojianhou
 * @Date: 2020/4/26
 * @Description:
 */
public class ParentBean implements Serializable {

    private static final long serialVersionUID = 6529685098267757690L;
    private String name;
    private String sex;

    public ParentBean() {
        name = "test";
        sex = "test";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "ParentBean{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
