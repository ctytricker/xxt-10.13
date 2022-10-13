package com.cm3;

import java.util.Scanner;

public class Test5 {//接收两个字符串，统计第二个字符串在第一个字符串里出现的次数。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int index = 0;
        int sum = 0;
        while(s1.indexOf(s2,index) != -1){
            index = s1.indexOf(s2,index) + 1;
            sum++;
        }
        System.out.println(sum);
    }
}
