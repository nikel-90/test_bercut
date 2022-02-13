package com.github.nikel90.db;

public class Result {
    private final Boolean isValid;
    private final int errCnt;

    public Result(Boolean isValid, int errCnt) {
        this.isValid = isValid;
        this.errCnt = errCnt;
    }

    @Override
    public String toString() {
        return "Result{" +
                "isValid=" + isValid +
                ", errCnt=" + errCnt +
                '}';
    }
}
