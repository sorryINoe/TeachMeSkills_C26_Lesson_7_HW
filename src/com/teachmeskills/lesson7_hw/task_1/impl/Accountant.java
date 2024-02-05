package com.teachmeskills.lesson7_hw.task_1.impl;
/**
 * This class implements IJob interface
  **/
public class Accountant implements IJob {
    public int jobCode = 3;

    @Override
    public void printJobCode() {
        System.out.println("Accountant");
    }
}
