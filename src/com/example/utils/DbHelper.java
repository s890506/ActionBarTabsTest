package com.example.utils;

import com.example.utils.DbSchema.HealthMapEntry;
import com.example.utils.DbSchema.TestTable;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper {

	// If you change the database schema, you must increment the database
	// version.
	public static final int DATABASE_VERSION = 1;
	public static final String DATABASE_NAME = "TravelHealth.db";

	private static final String TEXT_TYPE = " TEXT";
	private static final String COMMA_SEP = ",";

	private static final String SQL_CREATE_ENTRIES_HEALTHMAP = "CREATE TABLE "
			+ HealthMapEntry.TABLE_NAME + " (" + HealthMapEntry._ID
			+ " INTEGER PRIMARY KEY," + HealthMapEntry.COLUMN_OBJECT_ID
			+ TEXT_TYPE + COMMA_SEP + HealthMapEntry.COLUMN_IMPORTANCE
			+ TEXT_TYPE + COMMA_SEP + HealthMapEntry.COLUMN_COUNTRY + TEXT_TYPE
			+ COMMA_SEP + HealthMapEntry.COLUMN_DISEASE + TEXT_TYPE + COMMA_SEP
			+ HealthMapEntry.COLUMN_DATASOURCE + TEXT_TYPE + COMMA_SEP
			+ HealthMapEntry.COLUMN_DATE + TEXT_TYPE + COMMA_SEP
			+ HealthMapEntry.COLUMN_SUMMARY + TEXT_TYPE +
			// Any other options for the CREATE command
			" )";

	private static final String SQL_CREATE_ENTRIES_TESTTABLE = "CREATE TABLE "
			+ TestTable.TABLE_NAME + " (" + TestTable._ID
			+ " INTEGER PRIMARY KEY," + TestTable.COLUMN_TEST + TEXT_TYPE +
			// Any other options for the CREATE command
			" )";

	private static final String SQL_DELETE_ENTRIES_HEALTHMAP = "DROP TABLE IF EXISTS "
			+ HealthMapEntry.TABLE_NAME;

	private static final String SQL_DELETE_ENTRIES_TESTTABLE = "DROP TABLE IF EXISTS "
			+ TestTable.TABLE_NAME;
	
	public DbHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(SQL_CREATE_ENTRIES_HEALTHMAP);
		db.execSQL(SQL_CREATE_ENTRIES_TESTTABLE);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL(SQL_DELETE_ENTRIES_HEALTHMAP);
		db.execSQL(SQL_DELETE_ENTRIES_TESTTABLE);
	}

}

