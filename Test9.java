package com.cm3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test9 {//输入两个日期，计算两个日期之间的间隔时间。
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
        Date firstTime = sdf.parse(sc.nextLine());
        Date lastTime = sdf.parse(sc.nextLine());

        long s = Math.abs((lastTime.getTime() - firstTime.getTime())) / 1000;
        long min = s / 60;
        long hour = min / 60;
        long day = hour / 24;
        if(s < 60){
            System.out.println("刚刚");
        } else if (s / 60 <= 60) {
            System.out.println(min + "分钟前");
        } else if (s / (60 * 60) <= 24) {
            System.out.println(hour + "小时前");
        } else if (s / (60 * 60 * 24) >1) {
            System.out.println(day + "天前");
        }
    }
}

