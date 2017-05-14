package com.example.user.mobile_groplanner_android;

import android.app.Application;

import com.example.user.mobile_groplanner_android.database.DBHelper;
import com.example.user.mobile_groplanner_android.database.DBManager;

/**
 * Project    : GroPlanner
 * Created by : Anshul
 * Date       : 25-12-2016.
 *
 * Description==================================
 * This class defines Application
 */

public class GroPlannerApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        //initializing database manager
        DBManager.initInstance(new DBHelper(getApplicationContext()));
    }
}
