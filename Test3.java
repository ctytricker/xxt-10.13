package com.cm3;

import java.util.Scanner;

public class Test3 {//接收给定的一个字符串，对该字符串做如下处理：
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        getstr(s);

    }

    public static void getstr(String str){
        String str1 = str.trim();
        String str2[] = str1.split(" ");
        int count = 0;
        for(int i = 0; i < str2.length; i++){
            if(str2[i].startsWith("a") && str2[i].endsWith("z") && str2[i].contains("li")){
                count ++;
                String s2 =str2[i].toUpperCase();
                String s1 = str2[i].toLowerCase();

                System.out.println(s2 + "\n" + s1);
            }
        }
        System.out.print(count);
    }
}
