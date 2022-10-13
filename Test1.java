package com.cm3;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test1 {//集合的并、交、差集运算。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<String> a = new TreeSet<>();
        TreeSet<String> b = new TreeSet<>();

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String[] strings1 = str1.split(" ");
        String[] strings2 = str2.split(" ");

        for(int i = 0;i < strings1.length;i++){
            a.add(strings1[i]);
        }
        for(int i = 0;i < strings2.length;i++){
            b.add(strings2[i]);
        }


        TreeSet<String> c = (TreeSet<String>) a.clone();
        TreeSet<String> d = (TreeSet<String>) a.clone();



        //交集
        a.retainAll(b);
        Iterator<String> iterator1 = a.iterator();
        while(iterator1.hasNext()){
            System.out.print(iterator1.next() + " ");
        }
        System.out.println();

        //并集
        c.addAll(b);
        Iterator<String> iterator2 = c.iterator();
        while(iterator2.hasNext()){
            System.out.print(iterator2.next() + " ");
        }
        System.out.println();


        //差集
        d.removeAll(b);
        Iterator<String> iterator3 = d.iterator();
        while(iterator3.hasNext()){
            System.out.print(iterator3.next() + " ");
        }

    }
}
