package com.xydq.mall.utils;

import java.util.Random;

public class CharUtil {
    private static final String BASE_STRING = "abcdefghijklmnopqrstuvwxyz0123456789";
    private static final String BASE_NUMBER = "0123456789";

    public static String getRandomString(Integer num) {
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < num; i++) {
            int number = random.nextInt(BASE_STRING.length());
            sb.append(BASE_STRING.charAt(number));
        }
        return sb.toString();
    }

    public static String getRandomNum(Integer num) {
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < num; i++) {
            int number = random.nextInt(BASE_NUMBER.length());
            sb.append(BASE_NUMBER.charAt(number));
        }
        return sb.toString();
    }

}
