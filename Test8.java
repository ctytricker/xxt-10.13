package com.cm3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
class Test8{//ArrayList操作练习。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] str = line.split(" ");


        List<String> list = new ArrayList<>();

        for (String s : str) {
            list.add(s);
        }

        for (int j = list.size() - 1; j >= 0; j--) {
            String strings = list.get(j);
            char[] a = strings.toCharArray();
            if (a[0] == '王') {
                System.out.println(strings + "被移除了...");
                list.remove(strings);
            }
        }

            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }
}


