package com.example.user.mobile_groplanner_android.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.user.mobile_groplanner_android.database.dbschema.GroceryDBO;
import com.example.user.mobile_groplanner_android.database.dbschema.UserDBO;

/**
 * Project    : GroPlanner
 * Created by : Anshul
 * Date       : 25-12-2016.
 *
 * Description==================================
 * This class defines the database helper
 */

public class DBHelper extends SQLiteOpenHelper {


    public DBHelper(Context context) {
        super(context, DBConstants.DB_NAME, null, DBConstants.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(DBConstants.CREATE_USER_TABLE);
        db.execSQL(DBConstants.CREATE_GROCERY_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        //drop table if exists
        db.execSQL("DROP TABLE IF EXISTS" + UserDBO.USER_TABLE);
        db.execSQL("DROP TABLE IF EXISTS" + GroceryDBO.GROCERY_TABLE);

        //create tables again
        onCreate(db);
    }
}
