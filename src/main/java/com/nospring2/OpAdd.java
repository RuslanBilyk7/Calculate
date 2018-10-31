package com.nospring2;

/**
 * Created by RUSLAN77 on  18.05.2018 in Ukraine
 */
public class OpAdd implements Operation {
    public OpAdd() {
    }

    public String getOpsName() {
        return " plus ";
    }

    public long operate(long op1, long op2) {
        return op1 + op2;
    }
}