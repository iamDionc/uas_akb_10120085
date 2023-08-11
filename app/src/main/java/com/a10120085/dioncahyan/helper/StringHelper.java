/**
 * NIM : 10120085
 * NAMA : Dion Cahyan
 * KELAS : IF-2
 */
package com.a10120085.dioncahyan.helper;

public class StringHelper {
    // Generate Username From Email
    public static String usernameFromEmail(java.lang.String email) {
        if (!email.contains("@")) return email;

        return email.split("@")[0];
    }
}
