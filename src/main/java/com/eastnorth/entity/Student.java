package com.eastnorth.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Auther: zuojianhou
 * @Date: 2020/1/3
 * @Description:
 */
@Data
@AllArgsConstructor
public class Student {
    private long id;
    private String name;
    private int age;
}
