package com.study.huaweiod.最少交付时间;

import java.util.Scanner;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/24 15:22
 */
public class Main {
    /**
     * 项目组共有N个开发人员，项目经理接到了M个独立的需求，每个需求的工作量不同，且每个需求只能由一个开发人员独立完成，不能多人合作。
     *
     * 假定各个需求直接无任何先后依赖关系，请设计算法帮助项目经理进行工作安排，使整个项目能用最少的时间交付。
     *
     * 输入描述
     * 第一行输入为M个需求的工作量，单位为天，用逗号隔开。 例如：X1 X2 X3 … Xm 表示共有M个需求，每个需求的工作量分别为X1天，X2天…Xm天。其中0<M<30；0<Xm<200 第二行输入为项目组人员数量N 例如： 5 表示共有5名员工，其中0<N<10.
     *
     * 输出描述
     * 最快完成所有工作的天数 例如： 25 表示最短需要25天能完成所有工作。
     *
     * 用例1
     * 输入
     * 8,8,8,8,8,1
     * 3
     * 输出
     * 16
     * 用例2
     * 输入
     * 10,10,10,10
     * 2
     * 输出
     * 20
     * 说明
     * 两名员工各分配两项任务，最大负载为20天。
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        int n = scanner.nextInt();
        scanner.close();

        int[] peopleArray = new int[n];

        String[] array = str.split(",");
        int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = Integer.parseInt(array[i]);
        }
        bullerSort(arr);

        for (int i = 0; i < arr.length; i++) {
            int minIndex = getMinIndex(peopleArray);
            peopleArray[minIndex] = peopleArray[minIndex] + arr[i];
        }
        int max = peopleArray[0];
        if (n == 1) {
            System.out.println(max);
            return;
        }
        for (int i = 1; i < peopleArray.length; i++) {
            max = Math.max(max, peopleArray[i]);
        }
        System.out.println(max);
    }

    public static void bullerSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private static int getMinIndex(int[] peopleArray) {
        if (peopleArray.length == 1) {
            return 0;
        }
        int index = 0;
        int min = peopleArray[0];
        for (int i = 1; i < peopleArray.length; i++) {
            if (peopleArray[i] < min) {
                index = i;
                min = peopleArray[i];
            }
        }
        return index;
    }
}
