package com.example.user.mobile_groplanner_android.database.dbschema;

/**
 * Project    : GroPlanner
 * Created by : Anshul
 * Date       : 25-12-2016.
 *
 * Description==================================
 * This class defines the DBO for Grocery*/

public class GroceryDBO {

    //Grocery table constants=======================================

    public static final String GROCERY_TABLE="Grocery";
    public static final String ITEM_ID="item_id";
    public static final String ITEM_NAME="item_name";
    public static final String ITEM_TYPE="item_type";
    public static final String AVAILABILITY="availability";
    public static final String QUANTITY="quantity";
    public static final String START_DATE="start_date";
    public static final String END_DATE="end_date";

    public static String getItemId() {
        return ITEM_ID;
    }

    public static String getItemName() {
        return ITEM_NAME;
    }

    public static String getItemType() {
        return ITEM_TYPE;
    }

    public static String getAVAILABILITY() {
        return AVAILABILITY;
    }

    public static String getQUANTITY() {
        return QUANTITY;
    }

    public static String getStartDate() {
        return START_DATE;
    }

    public static String getEndDate() {
        return END_DATE;
    }

    public static String getGroceryTable() {

        return GROCERY_TABLE;
    }
}
