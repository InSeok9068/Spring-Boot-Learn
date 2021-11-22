package com.example.demo.common.util;

import java.util.Arrays;
import java.util.List;

public class ReflectionUtil {

    private static final List<String> NOT_USER_METHODS = Arrays.asList("getStackTrace", "getCurrentMethodName", "getStackTraceMethodName");

    private ReflectionUtil() {
    }

    public static String getCurrentMethodName() {
        return getStackTraceMethodName(0);
    }

    public static String getStackTraceMethodName(final int upperDepth) {
        final StackTraceElement[] steList = Thread.currentThread().getStackTrace();
        int startIndex = 0;
        for (StackTraceElement stackTraceElement : steList) {
            String methodName = stackTraceElement.getMethodName();
            if (NOT_USER_METHODS.contains(methodName)) {
                startIndex++;
            } else {
                break;
            }
        }

        return steList[startIndex + upperDepth].getMethodName();
    }
}
