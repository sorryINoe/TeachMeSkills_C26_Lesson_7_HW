package com.teachmeskills.lesson7_hw.task_1.run;

import com.teachmeskills.lesson7_hw.task_1.impl.Accountant;
import com.teachmeskills.lesson7_hw.task_1.impl.Manager;
import com.teachmeskills.lesson7_hw.task_1.impl.Worker;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Worker worker = new Worker();
        Accountant accountant = new Accountant();

        System.out.println("Enter job code: 1-Manager , 2-Worker , 3-Accountant");
        Scanner scan = new Scanner(System.in);
        int code = 0;

        while (true) {
            code = scan.nextInt();
            if (code == 1 || code == 2 || code == 3) {
                break;
            } else {
                System.out.println("Invalid job code, please try again.");
            }
        }



        if (code == manager.jobCode){
            manager.printJobCode();
        }
        else if (code == worker.jobCode) {
            worker.printJobCode();
        }
        else if (code == accountant.jobCode) {
            accountant.printJobCode();
        }
        else {
            System.out.println("mimimamamuv");
        }

    }
}
