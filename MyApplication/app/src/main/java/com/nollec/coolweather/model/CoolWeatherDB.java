package com.nollec.coolweather.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.nollec.coolweather.db.CoolWeatherOpenHelper;

/**
 * Created by nollec on 16-7-27.
 */
public class CoolWeatherDB {
    /*
    * 数据库名字*/
    public static final String DB_NAME="cool_weather";
    /*
    * 数据库版本*/
    public static final int VERSION=1;
    private static CoolWeatherDB coolWeatherDB;
    private SQLiteDatabase db;

    /*
    * 构造方法私有化*/

    private  CoolWeatherDB(Context context) {
        CoolWeatherOpenHelper coolWeatherOpenHelper=new CoolWeatherOpenHelper(context,DB_NAME,null,VERSION);
        
    }
}
