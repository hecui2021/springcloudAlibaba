package com.study.concurrent;

import java.util.Set;

/**
 * @author peterche
 * @description:
 * @date 2025-07-11
 */
public class GuardedObjectV2Test {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            new People().start();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Set<Integer> ids = Mailboxes.getIds();
        for (Integer id : ids) {
            new Postman(id, "内容" + id).start();
        }


    }
}
