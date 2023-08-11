/**
 * NIM : 10120085
 * NAMA : Dion Cahyan
 * KELAS : IF-2
 */
package com.a10120085.dioncahyan.model;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class User {
    public String username;
    public String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }
}
