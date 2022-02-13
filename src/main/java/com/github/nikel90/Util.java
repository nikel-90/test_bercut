package com.github.nikel90;

public class Util {
    private Util() {
    }

    public static int countError(int count, int distance) {
        if (distance != 1) {
            count += distance;
        }
        return count;
    }
}
