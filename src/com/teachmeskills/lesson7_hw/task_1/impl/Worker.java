package com.teachmeskills.lesson7_hw.task_1.impl;
/**
 * This class implements IJob interface
 **/
public class Worker implements IJob {
    public int jobCode = 2;

    @Override
    public void printJobCode() {
        System.out.println("Worker");
    }
}
