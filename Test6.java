package com.cm3;

import java.util.Arrays;
import java.util.Scanner;

public class Test6 {//编写方法String sort(String str)，对指定字符串中除首、尾字符外的其余字符进行降序排列
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(sort(str));

    }
    public static String sort(String str){
        String str1 = str.substring(1,str.length() - 1);
        char[] a = str1.toCharArray();
        Arrays.sort(a);
        String str2 = new String(a);
        StringBuffer sb = new StringBuffer(str2);
        sb.reverse();
        String str3 = sb.toString();
        return str.charAt(0) + str3 + str.charAt(str.length() - 1);
    }
}
