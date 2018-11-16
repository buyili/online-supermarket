package com.buyi;

import com.buyi.commons.util.UUIDByTime;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.FieldPosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;

/**
 * Created by 1132989278@qq.com on 2018/11/13 15:46
 */
@SpringBootApplication
@MapperScan("com.buyi.dao")
public class SpringBootApplicationTestDao {
    private static int sum = 20;
    public static void main(String[] args) {
        args = new String[]{"--debug"};
        SpringApplication.run(SpringBootApplicationTestDao.class, args);
    }

    public static void findSame(){
        String text = "20181116114829125-0001\n" +
                "20181116114829125-0005\n" +
                "20181116114829125-0006\n" +
                "20181116114829125-0007\n" +
                "20181116114829125-0010\n" +
                "20181116114829125-0004\n" +
                "20181116114829125-0013\n" +
                "20181116114829125-0014\n" +
                "20181116114829125-0015\n" +
                "20181116114829125-0017\n" +
                "20181116114829125-0018\n" +
                "20181116114829125-0019\n" +
                "20181116114829125-0003\n" +
                "20181116114829125-0002\n" +
                "20181116114829125-0020\n" +
                "20181116114829125-0016\n" +
                "20181116114829125-0012\n" +
                "20181116114829125-0011\n" +
                "20181116114829125-0008\n" +
                "20181116114829125-0009";
        String trim = text.trim();
        String[] split = text.split("\n");
        if(split.length != sum){
            System.out.println("split error!");
        }
        for(int j = 0; j < sum; j++){
            String str = split[j];
            for(int i = j+1; i < sum; i++){
                if(str.equals(split[i])){
                    System.out.println(str + " is repetition!");
                    return;
                }
            }
        }
        System.out.println("not repetition!");
    }

    public void test()  {
        CountDownLatch startLatch = new CountDownLatch(1);

        for (int i = 0; i < sum; i++) {
            new Thread(new work(startLatch)).start();
        }
        try {
            Thread.sleep(1000);
            System.out.println("start..........");
            startLatch.countDown();

            Thread.sleep(10000);
            System.out.println("end.........");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    class work implements Runnable {
        private CountDownLatch startLatch;

        public work(CountDownLatch startLatch) {
            this.startLatch = startLatch;
        }

        @Override
        public void run() {
            try {
                startLatch.await();
                String uuid = UUIDByTime.getUUID();
                System.out.println(uuid);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
