package com.study.huaweiod.攀登者2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/29 15:41
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        String[] strArray = str.split(",");
        int[] array = new int[strArray.length];

        int start = 0;
        int end = 0;
        List<Shan> shanList = new ArrayList<>();
        for (int i = 0; i < strArray.length; i++) {
            array[i] = Integer.parseInt(strArray[i]);
            if (array[start] == 0 && array[i] != 0) {
                start = i;
            }

            if (array[i] != 0) {
                end = i;
                continue;
            }
            shanList.add(new Shan(start, end));
            start = i + 1;
            end = start;
        }
        shanList.add(new Shan(start, end));







        scanner.close();
    }

    static class Shan {
        public int start;
        public int end;
        public List<Integer> list;


        public Shan(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}
