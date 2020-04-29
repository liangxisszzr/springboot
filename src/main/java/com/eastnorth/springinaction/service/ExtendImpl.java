package com.eastnorth.springinaction.service;

import com.eastnorth.springinaction.bean.ParentBean;

import java.util.List;

/**
 * @author zuojianhou
 * @Date: 2020/4/28
 * @Description:
 */
public class ExtendImpl {
    public static void impl(List<ParentBean> list) {
        for (ParentBean parentBean : list) {
            System.out.println(parentBean.toString());
        }
    }
}
