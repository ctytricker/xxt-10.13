package com.cm3;

import java.util.Scanner;

public class Test4 {//接收给定的字符串，判断字符串中的数字是否为手机号码
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] array = str.split("@");
        int length = array[0].length();//位数
        boolean b1 = array[0].matches("^1[3|8][0-9]+$");
        boolean b2 = array[0].matches("^14[5|7|9][0-9]+$");
        boolean b3 = array[0].matches("^15[0-3|5-9][0-9]+$");
        boolean b4 = array[0].matches("^166[0-9]+$");
        boolean b5 = array[0].matches("^17[3|5-8][0-9]+$");
        if (length == 11 & (b1 == true | b2 == true | b3 == true | b4 == true | b5 == true)) {
            System.out.println(array[0] + "是手机号码");
        } else {
            System.out.println(array[0] + "不是手机号码");
        }
    }
}
