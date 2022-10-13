package com.cm3;

import java.util.LinkedList;
import java.util.Scanner;

public class Test7 {//使用LinkedList模拟栈，实现中括号匹配问题。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] c = s.toCharArray();
        LinkedList<Character> stack = new LinkedList<>();
        int count = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '[') {
                stack.push(c[i]);
            }
            if (c[i] == ']') {
                if (!stack.isEmpty()) {
                    stack.pop();
                    count++;
                }else{
                    System.out.println("期望[");
                    return;
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.println("匹配");
            System.out.println(count);
        }else {
            System.out.println("期望]");
        }

    }
}
