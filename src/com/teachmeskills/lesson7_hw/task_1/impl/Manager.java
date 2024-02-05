package com.teachmeskills.lesson7_hw.task_1.impl;
/**
 * This class implements IJob interface
 **/
public class Manager implements IJob {
    public int jobCode = 1;

    @Override
    public void printJobCode() {
        System.out.println("Manager");
    }
}
