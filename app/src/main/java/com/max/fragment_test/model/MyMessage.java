package com.max.fragment_test.model;

public class MyMessage {
    private static String message;

    public MyMessage() {

    }

    public static String getMessage() {
        return message;
    }

    public static void setMessage(String message) {
        MyMessage.message = message;
    }
}
