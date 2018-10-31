package com.nospring2;

/**
 * Created by RUSLAN77 on  21.05.2018 in Ukraine
 */

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalculateSpringAOP {
    private Operation ops;

    private void showResult(String result) {
        System.out.println(result);
    }

    //    private ResultWriter wtr;
    public void setOps(Operation ops) {
        this.ops = ops;

    //    public void setWriter(ResultWriter writer) {
//        wtr = writer;
    }
    public static void main(String[] args) {
        args = new String[]{"14", "23"};
        ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
        BeanFactory factory = (BeanFactory) context;
        CalculateSpringAOP calc = (CalculateSpringAOP) factory.getBean("opsbean");
        calc.execute(args);
    }


    public void execute(String[] args) {
        long op1 = Long.parseLong(args[0]);
        long op2 = Long.parseLong(args[1]);
        showResult("The result of " + op1 + ops.getOpsName() + op2 + " is " + ops.operate(op1, op2) + "!");
    }
}