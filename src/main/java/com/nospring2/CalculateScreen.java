package com.nospring2;

/**
 * Created by RUSLAN77 on  18.05.2018 in Ukraine
 */
public class CalculateScreen {
    private Operation opsAdd = new OpAdd();
    private Operation opMultiply = new OpMultiply();

//    private ResultWriter wtr = new ScreenWriter();

    private void showResult(String result) {
        System.out.println(result);
    }

    public static void main(String[] args) {
        args = new String[]{"2", "33"};
        CalculateScreen calc = new CalculateScreen();

        calc.execute(args);
//        calc.execute2(args);
    }

    public void execute(String[] args) {
        long op1 = Long.parseLong(args[0]);
        long op2 = Long.parseLong(args[1]);
        showResult("The result of " + op1 + opsAdd.getOpsName() + op2 + " is " + opsAdd.operate(op1, op2) + "!");
        showResult("The result of " + op1 + opMultiply.getOpsName() + op2 + " is " + opMultiply.operate(op1, op2) + "!");

//    }
//
//    public void execute2(String[] args) {
//        long op1 = Long.parseLong(args[0]);
//        long op2 = Long.parseLong(args[1]);
//        showResult("The result of " + op1 + opMultiply.getOpsName() + op2 + " is " + opMultiply.operate(op1, op2) + "!");
    }


}