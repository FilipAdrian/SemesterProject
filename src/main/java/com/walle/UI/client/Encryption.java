package com.walle.UI.client;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encryption {
    public static String stringToHash(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance ("MD5");
            byte[] messageDigest = md.digest (input.getBytes ( ));
            BigInteger no = new BigInteger (1, messageDigest);
            String hashtext = no.toString (16);
            while (hashtext.length ( ) < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException (e);
        }
    }
}
