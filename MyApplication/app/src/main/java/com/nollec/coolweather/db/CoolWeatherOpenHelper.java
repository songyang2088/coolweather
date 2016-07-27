package com.nollec.coolweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by nollec on 16-7-27.
 */
public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
    /*
    Province表建表语句
    * */
    public static final String CREATE_PRIVINCE="creat table province("
            +"id integer primary key autoincrement,"
            +"province_name text,"
            +"province_code text)";
    /*
    * City建表语句
    * */
    public static final String CREATE_CITY="creat table city ("
            +"id integer primary key autoincrement,"
            +"city_name text,"
            +"city_code text,"
            + "province_id integer)";//是city表关联province的外键
    /*
    * County*/
    public static final String CREAT_COUNTY="creat table county("
            +"id integer primary key autoincrement,"
            +"county_name text,"
            +"county_code text,"
            +"city_id integer";
    public CoolWeatherOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_PRIVINCE);
        db.execSQL(CREATE_CITY);
        db.execSQL(CREAT_COUNTY);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }
}
