package com.example.user.mobile_groplanner_android.database;


import android.content.ContentValues;


/**
 * Project    : GroPlanner
 * Created by : Anshul
 * Date       : 25-12-2016.
 *
 * Description==================================
 * This class defines the database factory for all DBO
 */
public abstract class DBFactory {

    /**
     * abstract method to convert object to content values
     */
    public abstract ContentValues toContentValues();

    /**
     * abstract method to convert content values to model
     */
    public abstract void cursonToModel();


}
