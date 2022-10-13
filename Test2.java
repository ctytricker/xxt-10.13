package com.cm3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Test2 {//给定购物小票字符串，计算该小票的商品总金额。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();
        String str4 = sc.next();
        String str = str1 + "," + str2 + "," + str3 + "," + str4;
        int sum = 0;
        String price = null;
        StringTokenizer strToken = new StringTokenizer(str, ",");
        while (strToken.hasMoreTokens()) {
            StringTokenizer st = new StringTokenizer(strToken.nextToken(), "：");
            while (st.hasMoreTokens()) {
                st.nextToken();
                price = st.nextToken();
            }
            sum += Integer.parseInt(price);
        }
        System.out.println(sum);
    }
}


