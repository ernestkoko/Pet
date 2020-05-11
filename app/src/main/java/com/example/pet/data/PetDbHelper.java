package com.example.pet.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.pet.data.PetContract.PetEntry;


public class PetDbHelper extends SQLiteOpenHelper {
    public static final String db_name = "shelt.db";
    public static final int db_version = 1;





    public PetDbHelper(Context context) {
        super(context, db_name, null,db_version);

    }



    @Override
    public void onCreate(SQLiteDatabase db) {
         String CREATE_PETS_TABLE = "CREATE TABLE "
                + PetEntry.TABLE_NAME
                + " ( "
                + PetEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + PetEntry.COLUMN_PET_NAME + " TEXT NOT NULL, "
                + PetEntry.COLUMN_PET_BREED + " TEXT, "
                + PetEntry.COLUMN_PET_GENDER + " INTEGER NOT NULL, "
                + PetEntry.COLUMN_PET_WEIGHT + " INTEGER NOT NULL DEFAULT 0);";
        db.execSQL(CREATE_PETS_TABLE);



    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
