package com.study.huaweiod.智能成绩表;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/10/1 14:15
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();

        String str = scanner.nextLine();
        String[] kemuArray = str.split(" ");
        List<People> peopleList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            String[] peopleArray = s.split(" ");
            String name = peopleArray[0];
            int[] array = new int[kemuArray.length];
            int sum = 0;
            for (int j = 1; j < peopleArray.length; j++) {
                array[j - 1] = Integer.parseInt(peopleArray[j]);
                sum += array[j - 1];
            }
            People people = new People(name, array, sum);
            peopleList.add(people);
        }
        String kemu = scanner.nextLine();


        scanner.close();
    }

    static class People {
        public String name;
        public int[] array;
        // 总分
        public int sum;

        public People(String name, int[] array, int sum) {
            this.name = name;
            this.array = array;
            this.sum = sum;
        }
    }
}
