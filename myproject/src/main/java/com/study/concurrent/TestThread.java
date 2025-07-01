package com.study.concurrent;

import com.alibaba.druid.sql.visitor.functions.Char;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/**
 * @author peterche
 * @description:
 * @date 2025-06-27
 */
@Slf4j
public class TestThread {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // 创建任务对象
        FutureTask<Integer> task = new FutureTask<>(() -> {
            log.debug("hello");
           return 1;
        });

        // 创建线程并启动
        new Thread(task).start();

        // 主线程阻塞，同步等待task执行完毕的结果
        Integer i = task.get();

        log.info("i = {}", i);
        TimeUnit.SECONDS.sleep(3);

    }
}


