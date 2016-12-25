package com.example.user.mobile_groplanner_android.database;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Project    : GroPlanner
 * Created by : Anshul
 * Date       : 25-12-2016.
 *
 * Description==================================
 * This class defines the database manager
 */

public class DBManager {

    private int mCounter;
    private static DBManager instance;
    private static SQLiteOpenHelper mDatabaseHelper;
    private SQLiteDatabase mDatabase;


    public static synchronized void initInstance(SQLiteOpenHelper helper)
    {
        if(instance==null){
            instance=new DBManager();
            mDatabaseHelper=helper;
        }
    }


    /**
     * Method to check is DB initialized or not
     * @return boolean value true for db initialized
     *         false for db not initialized
     */
    public static  synchronized boolean isDBInitialized(){
        return instance==null;
    }

    /**
     * Method to getInstance for DBManager
     *
     */
    public static synchronized DBManager getInstance(){
        if(instance==null)
        {
            throw new IllegalStateException(DBManager.class.getSimpleName() + "is not initialized ");
        }
        return instance;
    }

    /**
     * Method to open database
     * @return SqliteDatabase object
     */
    public synchronized SQLiteDatabase openDatabase(){
        mCounter++;
        if(mCounter==1){
            mDatabase=mDatabaseHelper.getWritableDatabase();
        }
        return mDatabase;
    }



    /**
     * Method to close database
     */
    public synchronized void closeDatabase(){
        mCounter--;
        if(mCounter==0){
            mDatabase.close();
        }
    }
}
