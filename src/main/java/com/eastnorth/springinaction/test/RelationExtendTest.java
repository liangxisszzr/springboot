package com.eastnorth.springinaction.test;

import com.eastnorth.springinaction.bean.ChildBean;
import com.eastnorth.springinaction.bean.ParentBean;
import com.eastnorth.springinaction.service.ExtendImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zuojianhou
 * @Date: 2020/4/28
 * @Description:
 */
public class RelationExtendTest {
    public static void main(String[] args) {
        List<ParentBean> list = new ArrayList<>();
        list.add(new ChildBean());
        list.add(new ChildBean());
        ExtendImpl.impl(list);
    }
}
