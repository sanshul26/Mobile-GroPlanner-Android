package com.example.user.mobile_groplanner_android.logger;

import android.util.Log;

/**
 * Project    : GroPlanner
 * Created by : Anshul
 * Date       : 25-12-2016.
 *
 * Description==================================
 * This class defines the logger file to print logs for debugging
 */

public class GroPlannerLog {


    private static String TAG = "GRO_PLANNER_LOG";


    /**
     * Method to print log in verbose mode
     *
     * @param message string
     */
    public static void v(String message) {

        Log.v(TAG, message);
    }

    /**
     * Method to print log in info mode
     *
     *@param message string
     */
    public static void i(String message){

        Log.v(TAG,message);
    }

    /**
     * Method to print log in debug mode
     *
     *@param message string
     */
    public static void d(String message){

        Log.d(TAG,message);
    }

}
