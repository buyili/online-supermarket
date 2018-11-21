package com.buyi.commons.util;

import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 1132989278@qq.com on 2018/11/16 10:02
 */
public class UUIDByTime {

    private final static SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");

    private final static FieldPosition _FIELD = new FieldPosition(1);

    public static String getUUID() {
        StringBuffer buffer = new StringBuffer();
        format.format(new Date(), buffer, _FIELD);
        buffer.append(System.nanoTime());
        return buffer.toString();
    }


}
