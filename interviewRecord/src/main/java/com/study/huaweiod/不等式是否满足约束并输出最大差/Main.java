package com.study.huaweiod.不等式是否满足约束并输出最大差;


import java.util.Scanner;

/**
 * @author peterche
 * @description:
 * @date 2025-02-17
 */
public class Main {
    /**
     * 给定一组不等式，判断是否成立并输出不等式的最大差(输出浮点数的整数部分)
     *
     * 要求:
     *
     * 不等式系数为 double类型，是一个二维数组
     * 不等式的变量为 int类型，是一维数组;
     * 不等式的目标值为 double类型，是一维数组
     * 不等式约束为字符串数组，只能是:“>”,“>=”,“<”,“<=”,“=”，
     * 例如，不等式组:
     *
     *  a11x1 + a12x2 + a13x3 + a14x4 + a15x5 <= b1;
     *  a21x1 + a22x2 + a23x3 + a24x4 + a25x5 <= b2;
     *  a31x1 + a32x2 + a33x3 + a34x4 + a35x5 <= b3;
     * 最大差 = max{(a11x1+a12x2+a13x3+a14x4+a15x5-b1),(a21x1+a22x2+a23x3+a24x4+ a25x5-b2),(a31x1+a32x2+a33x3+a34x4+a35x5-b3)},
     *
     * 类型为整数(输出浮点数的整数部分)
     *
     * 输入描述
     * a11,a12,a13,a14,a15,a21,a22,a23,a24,a25, a31,a32,a33,a34,a35,x1,x2,x3,x4,x5,b1,b2,b3,<=,<=,<=
     *
     * 不等式组系数(double类型):
     *
     * a11,a12,a13,a14,a15
     *
     * a21,a22,a23,a24,a25
     *
     * a31,a32,a33,a34,a35
     *
     * 不等式变量(int类型):x1,x2,x3,x4,x5
     *
     * 不等式目标值(double类型):b1,b2,b3
     *
     * 不等式约束(字符串类型):<=,<=,<=
     *
     * 输出描述
     * true或者 false，最大差
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] array = str.split(";");
        String[] doubleArray1 = array[0].split(",");
        String[] doubleArray2 = array[1].split(",");
        String[] doubleArray3 = array[2].split(",");
        String[] intArray = array[3].split(",");
        String[] bArray = array[4].split(",");
        String[] strArray = array[5].split(",");

        Double a11 = Double.parseDouble(doubleArray1[0]);
        Double a12 = Double.parseDouble(doubleArray1[1]);
        Double a13 = Double.parseDouble(doubleArray1[2]);
        Double a14 = Double.parseDouble(doubleArray1[3]);
        Double a15 = Double.parseDouble(doubleArray1[4]);

        Double a21 = Double.parseDouble(doubleArray2[0]);
        Double a22 = Double.parseDouble(doubleArray2[1]);
        Double a23 = Double.parseDouble(doubleArray2[2]);
        Double a24 = Double.parseDouble(doubleArray2[3]);
        Double a25 = Double.parseDouble(doubleArray2[4]);

        Double a31 = Double.parseDouble(doubleArray3[0]);
        Double a32 = Double.parseDouble(doubleArray3[1]);
        Double a33 = Double.parseDouble(doubleArray3[2]);
        Double a34 = Double.parseDouble(doubleArray3[3]);
        Double a35 = Double.parseDouble(doubleArray3[4]);

        int x1 = Integer.parseInt(intArray[0]);
        int x2 = Integer.parseInt(intArray[1]);
        int x3 = Integer.parseInt(intArray[2]);
        int x4 = Integer.parseInt(intArray[3]);
        int x5 = Integer.parseInt(intArray[4]);

        Double b1 = Double.parseDouble(bArray[0]);
        Double b2 = Double.parseDouble(bArray[1]);
        Double b3 = Double.parseDouble(bArray[2]);

        String str1 = strArray[0];
        String str2 = strArray[1];
        String str3 = strArray[2];

        double sum1 = a11 * x1+a12 * x2+a13 * x3+a14 * x4+a15 * x5-b1;
        double sum2 = a21 * x1+a22 * x2+a23 * x3+a24 * x4+ a25 * x5-b2;
        double sum3 = a31 * x1+a32 * x2+a33 * x3+a34 * x4+a35 * x5-b3;

        boolean flag = isTrue(sum1, str1) && isTrue(sum2, str2) && isTrue(sum3, str3);

        String result = flag + " ";

        Double max = Math.max(sum1, Math.max(sum2, sum3));
        result += max.intValue();

        System.out.println(result);

        scanner.close();
    }

    public static boolean isTrue(double sum, String str) {
        if (">".equals(str)) {
            return sum > 0;
        } else if (">=".equals(str)) {
            return sum >= 0;
        } else if ("<".equals(str)) {
            return sum < 0;
        } else if ("<=".equals(str)) {
            return sum <= 0;
        } else if ("=".equals(str)) {
            return sum == 0;
        }
        return false;
    }
}
