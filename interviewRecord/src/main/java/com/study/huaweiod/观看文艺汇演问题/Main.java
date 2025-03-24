package com.study.huaweiod.观看文艺汇演问题;

import java.util.*;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/3/24 22:56
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        List<Show> list = new ArrayList();
        for (int i = 0; i < n; i++) {
            String str = scanner.nextLine();
            String[] array = str.split(" ");
            int start = Integer.parseInt(array[0]);
            int time = Integer.parseInt(array[1]);
            list.add(new Show(start, start + time));
        }
        scanner.close();

        // 需要以结束时间排序
        Collections.sort(list, new Comparator<Show>() {
            public int compare(Show o1, Show o2) {
                return o1.end - o2.end;
            }
        });

        int count = 1;
        int firstEnd = list.get(0).end;
        for (int i = 1; i < list.size() -1; i++) {
            Show second = list.get(i);
            if (firstEnd + 15 <= second.start) {
                count++;
                firstEnd = second.end;
            }
        }
        System.out.println(count);
    }

    public static class Show {
        public int start;
        public int end;

        public Show(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}
