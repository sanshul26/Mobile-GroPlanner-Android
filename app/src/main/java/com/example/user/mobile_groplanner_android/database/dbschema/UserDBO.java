package com.example.user.mobile_groplanner_android.database.dbschema;

/**
 * Project    : GroPlanner
 * Created by : Anshul
 * Date       : 25-12-2016.
 *
 * Description==================================
 * This class defines DBO for user */

public class UserDBO {

    //User table constants==========================================

    public static final String USER_TABLE="user";
    public static final String USERNAME="username";
    public static final String PASSWORD="password";

    public static String getUserTable() {
        return USER_TABLE;
    }

    public static String getUSERNAME() {
        return USERNAME;
    }

    public static String getPASSWORD() {
        return PASSWORD;
    }
}
