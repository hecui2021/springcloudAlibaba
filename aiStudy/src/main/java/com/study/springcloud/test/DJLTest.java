package com.study.springcloud.test;

import ai.djl.ndarray.NDArray;
import ai.djl.ndarray.NDManager;
import ai.djl.ndarray.types.Shape;
import org.junit.jupiter.api.Test;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2024/12/10 23:17
 */
public class DJLTest {

    /**
     * n维向量
     */
    @Test
    void test01() {
        try(NDManager manager = NDManager.newBaseManager()) {
            NDArray ones = manager.ones(new Shape(2, 3));
            System.out.println("ones:" + ones);
        }
    }


}
