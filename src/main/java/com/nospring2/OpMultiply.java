package com.nospring2;

/**
 * Created by RUSLAN77 on  18.05.2018 in Ukraine
 */
public class OpMultiply implements Operation {
    public OpMultiply() {
    }

    public String getOpsName() {
        return " times ";
    }

    public long operate(long op1, long op2) {
        return op1 * op2;
    }
}