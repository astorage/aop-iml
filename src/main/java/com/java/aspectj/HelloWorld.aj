package com.java.aspectj;

public aspect HelloWorld {

    /**
     * 第一个*号是指返回值不限，第二个*号是指方法名不限
     * 括号只是任意个数类型不限的形参
     */
    before() : call(* com.java.aspectj.*.*(..)) {
        System.out.println("hello前的检查,哈哈");
    }
    after() : call(* com.java.aspectj.*.*(..)) {
        System.out.println("hello后的检查，哈哈");
    }
}
