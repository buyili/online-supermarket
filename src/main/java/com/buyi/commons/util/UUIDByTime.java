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

    private final static SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmssS");

    private final static NumberFormat numberFormat = new DecimalFormat("0000");

    private final static FieldPosition _FIELD = new FieldPosition(1);

    private static volatile int seq = 1;

    private final static int max = 9999;

    public static String getUUID() {
        StringBuffer buffer = new StringBuffer();
        format.format(new Date(), buffer, _FIELD);
        buffer.append("-");
        synchronized (UUIDByTime.class) {
            numberFormat.format(seq, buffer, _FIELD);
            if (seq == max) {
                seq = 0;
            } else {
                seq++;
            }
        }
        return buffer.toString();
    }


}
