package com.example.user.mobile_groplanner_android.model;


/**
 * Project    : GroPlanner
 * Created by : Anshul
 * Date       : 25-12-2016.
 *
 * Description==================================
 * This class defines Application
 */

public class Grocery implements GroPlannerModelInterface {

    private int id;
    private String itemType;
    private String itemName;
    private boolean availability;
    private float quantity;
    private long startDate;
    private long endDate;


}
