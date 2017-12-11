package com.github.alexvishneuski.sqliteapp.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.github.alexvishneuski.sqliteapp.db.sql.Tables;

public class SqlConnector extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "application.db";

    private static final int DATABASE_VERSION = 1;

    public SqlConnector(Context context) {
        //TODO read about SQLiteDatabase.CursorFactory
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Tables.STARS_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.d("SqlConnector", "onUpgrade from " + oldVersion + " to " + newVersion);
    }

}
