package com.study.huaweiod.不等式是否满足约束并输出最大差;


/**
 * @author peterche
 * @description:
 * @date 2025-02-17
 */
public class Test {
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

    }
}
