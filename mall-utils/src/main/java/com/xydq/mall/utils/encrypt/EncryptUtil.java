package com.xydq.mall.utils.encrypt;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.Random;

/**
 * @author wanghuaidong
 * @date 2020/2/6
 */
public class EncryptUtil {

    private static final String DEFAULT_STR = "bugAlwaysLives";

    public static Boolean matches(String password, String encryptPassword) {
        String slat = encryptPassword.substring(encryptPassword.lastIndexOf("#") + 1);
        return encryptPassword(password, slat).equals(encryptPassword);
    }

    public static String encryptPassword(String password) {
        String slat = createRandomSalt();
        return DigestUtils.md5Hex(password + slat + DEFAULT_STR) + "#" + slat;
    }

    private static String encryptPassword(String password , String slat) {
        return DigestUtils.md5Hex(password + slat + DEFAULT_STR) + "#" + slat;
    }

    private static String createRandomSalt() {
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        //获取长度为6的字符串
        for(int i = 0; i < 6; i++) {
            //获取范围在3之内的索引值
            int number = random.nextInt(3);
            int result = 0;
            switch (number) {
                case 0:
                    //对应A-Z 参考ASCII编码表
                    result = (int) (Math.random() * 25 + 65);
                    //将整型强转为char类型
                    sb.append((char) result);
                    break;
                case 1:
                    //对应a-z
                    result = (int) (Math.random() * 25 + 97);
                    sb.append((char) result);
                    break;
                case 2:
                    sb.append(new Random().nextInt(10));
                    break;
                default:
                    break;
            }
        }
        return sb.toString();
    }

}
