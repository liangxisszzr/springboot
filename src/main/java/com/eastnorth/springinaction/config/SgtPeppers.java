package com.eastnorth.springinaction.config;

import com.eastnorth.springinaction.dao.CompactDisc;
import org.springframework.stereotype.Component;

/**
 * @Auther: zuojianhou
 * @Date: 2020/4/22
 * @Description:
 */
@Component("sszzr")
public class SgtPeppers implements CompactDisc {

    private String title = "ssr";

    private String artist = "zzh";

    @Override
    public void play() {
        System.out.println("playing" + title + "by" + artist);
    }
}
