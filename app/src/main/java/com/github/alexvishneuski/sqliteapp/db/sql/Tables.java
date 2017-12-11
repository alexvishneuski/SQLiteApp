package com.github.alexvishneuski.sqliteapp.db.sql;

import com.github.alexvishneuski.sqliteapp.db.model.StarsDb;

public class Tables {
    public static final String STARS_TABLE
            = "CREATE TABLE IF NOT EXISTS " +
            StarsDb.COLUMN_NAME_NAME + "(" +
            StarsDb.COLUMN_NAME_ID + " INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," +
            StarsDb.COLUMN_NAME_NAME + " VARCHAR (500)," +
            StarsDb.COLUMN_NAME_REGISTERED + " INTEGER )";

      public static final String INSERT_TEST_STAR =
            "INSERT INTO " +
                    StarsDb.TABLE_NAME + "(" +
                    StarsDb.COLUMN_NAME_NAME + "," +
                    StarsDb.COLUMN_NAME_REGISTERED + ")" +
                    " VALUES (?,?)";
}