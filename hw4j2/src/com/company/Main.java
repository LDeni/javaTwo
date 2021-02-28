package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Integer[] array = {1, 2, 100, 0, 3, 8, 4, 5, 6, 7};
        MyInterface a = (number, list1) -> {
            for (int i = 0; i < list1.length; i++) {
                if (list1[i] == number) {
                    System.out.println(i);
                    return i;
                }
            }
            return -1;
        };

        a.search(5, array);


        Interface1 words = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--)
                result += str.charAt(i);
            return result;
        };
        System.out.println(words.reverse("!snoisserpxe adbmal etah I"));

        

        Interface2 a1 = (c) -> {
            int max = c[0];
            for (int i = 1; i < c.length ; i++) {
                if ( c[i] > max) {
                    max = c[i];
                }
            }
            return max;
        };
        System.out.println(a1.maximum(array));


        List <Integer> intList = new ArrayList<>();
        intList.add(5);
        intList.add(2);

        Interface3 a3 = (d) -> {
            double sum = 0;
            for (int i = 0; i < intList.size() ; i++) {
               sum +=  intList.get(i);
            }
                return sum/intList.size();
            };
        System.out.println(a3.average(intList));


        List <String> str = new ArrayList<>();
        str.add("hello");
        str.add("arl");
        str.add("ukl");
        str.add("aws");
        str.add("ankmk");
        str.add("bye");
        Interface4 k = (str1) -> {
            for (int i = str1.size() - 1; i >= 0 ; i--) {

                    if (str1.get(i).length() != 3) {
                        str1.remove(i);
                }

            }
            for (int j = 0; j <str1.size() ; j++) {
                if (str1.get(j).charAt(0) != 'a') {
                    str1.remove(j);
                       }
            }
            return str1;
        };
        System.out.println(k.search(str));
        }

    }

