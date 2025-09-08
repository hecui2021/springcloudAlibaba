package com.study.spring;

import java.util.ArrayList;
import java.util.List;

/**
 * @author peterche
 * @description: 模版设计模式
 * @date 2025-06-20
 */
public class TestMethodTemplate {

    public static void main(String[] args) {
        MyBeanFactory myBeanFactory = new MyBeanFactory();
        myBeanFactory.add(bean -> System.out.println("依赖注入解析参数"));
        myBeanFactory.getBean();
    }


    static class MyBeanFactory {
        public Object getBean() {
            System.out.println("getBean before");

            for (MyBeanPostProcessor postProcessor : myBeanPostProcessors) {
                postProcessor.sert("ceec");
            }

            System.out.println("getBean after");
            return null;
        }

        public List<MyBeanPostProcessor> myBeanPostProcessors = new ArrayList<>();

        public void add(MyBeanPostProcessor myBeanPostProcessor) {
            myBeanPostProcessors.add(myBeanPostProcessor);
        }

    }

    static interface MyBeanPostProcessor {
        void sert(Object obj);
    }
}
