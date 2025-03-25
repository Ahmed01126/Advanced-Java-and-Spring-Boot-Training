package com.example.errorhandling.util;

import java.sql.Timestamp;

public class TimingUtilities {

    private TimingUtilities() {
    }

    public static Timestamp currentTimestamp() {
        return new Timestamp(System.currentTimeMillis());
    }
}
