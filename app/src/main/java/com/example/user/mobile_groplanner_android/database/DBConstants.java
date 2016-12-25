package com.example.user.mobile_groplanner_android.database;


import static com.example.user.mobile_groplanner_android.database.dbschema.GroceryDBO.AVAILABILITY;
import static com.example.user.mobile_groplanner_android.database.dbschema.GroceryDBO.END_DATE;
import static com.example.user.mobile_groplanner_android.database.dbschema.GroceryDBO.GROCERY_TABLE;
import static com.example.user.mobile_groplanner_android.database.dbschema.GroceryDBO.ITEM_ID;
import static com.example.user.mobile_groplanner_android.database.dbschema.GroceryDBO.ITEM_NAME;
import static com.example.user.mobile_groplanner_android.database.dbschema.GroceryDBO.ITEM_TYPE;
import static com.example.user.mobile_groplanner_android.database.dbschema.GroceryDBO.QUANTITY;
import static com.example.user.mobile_groplanner_android.database.dbschema.GroceryDBO.START_DATE;
import static com.example.user.mobile_groplanner_android.database.dbschema.UserDBO.PASSWORD;
import static com.example.user.mobile_groplanner_android.database.dbschema.UserDBO.USERNAME;
import static com.example.user.mobile_groplanner_android.database.dbschema.UserDBO.USER_TABLE;

/**
 * Project    : GroPlanner
 * Created by : Anshul
 * Date       : 25-12-2016.
 *
 * Description==================================
 * This class defines the database constants */

class DBConstants {

    static final int DB_VERSION=1;
    static final String DB_NAME="GroPlannerDB";
    static final String CREATE_USER_TABLE="CREATE TABLE" + USER_TABLE + "(" + USERNAME +
            " TEXT PRIMARY KEY, " + PASSWORD + " TEXT )";
    static final String CREATE_GROCERY_TABLE="CREATE TABLE" + GROCERY_TABLE + "(" + ITEM_ID +
            " INTEGER PRIMARY KEY, " + ITEM_NAME + " TEXT , " + ITEM_TYPE + " TEXT, " +AVAILABILITY
            + " INTEGER " + QUANTITY+ " REAL " + START_DATE + " INTEGER " + END_DATE + " INTEGER " +USERNAME+ " TEXT )";



}
