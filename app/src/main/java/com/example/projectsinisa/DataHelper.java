package com.example.projectsinisa;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "sinisa.db";
    private static final int DATABASE_VERSION = 1;
    public DataHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        //TODO Auto-generated constructor stub
    }

public void onCreate(SQLiteDatabase db) {
        //TODO Auto-generated method stub
    String sql = "create table user(nik text primary key, nama text null, alamat text null, username text null, password text null);";
    Log.d("Data", "onCreate: " + sql);
    db.execSQL(sql);
    sql = "INSERT INTO user (nik, nama, alamat, username, password) VALUES ('00012345678912', 'Darsiwan', 'Jember', 'darsiwan', 'darsiwan123');";
    db.execSQL(sql);
}

public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
        //TODO Auto-generated method sstub
}
}
