package com.bentozord.matcher;


public class DateUtils {

    public static String parseToProperDateFormat(String param) {
        if (param.isBlank()) {
            throw new IllegalArgumentException("Date cannot be null in case of date matcher");
        }
        return param.substring(0, 4) +
                "-" +
                param.substring(4, 6) +
                "-" +
                param.substring(6, 8);
    }
}
