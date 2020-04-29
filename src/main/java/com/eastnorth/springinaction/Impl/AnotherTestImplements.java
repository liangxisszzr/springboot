package com.eastnorth.springinaction.Impl;

import com.eastnorth.springinaction.service.TestForImplements;
import org.springframework.stereotype.Service;

/**
 * @Auther: zuojianhou
 * @Date: 2020/4/26
 * @Description:
 */
@Service
public class AnotherTestImplements implements TestForImplements {
    @Override
    public void test() {
        System.out.println("test2");
    }
}
