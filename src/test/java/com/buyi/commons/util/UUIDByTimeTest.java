package com.buyi.commons.util;

import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.*;

/**
 * Created by 1132989278@qq.com on 2018/11/21 10:53
 */
public class UUIDByTimeTest {

    @Test
    public void getUUID() {
        String uuid = UUIDByTime.getUUID();
        String s = UUID.randomUUID().toString();
        System.out.println(uuid);
        System.out.println(s);
        System.out.println(s.hashCode());
    }
}