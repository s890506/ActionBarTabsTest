package com.example.utils;

import android.provider.BaseColumns;

public class DbSchema {
	// To prevent someone from accidentally instantiating the contract class,
	// give it an empty constructor.
	public DbSchema() {

	}

	public static abstract class HealthMapEntry implements BaseColumns {
		public static final String TABLE_NAME = "HeathMap";
		public static final String _ID = "_ID";
		public static final String COLUMN_OBJECT_ID = "HealthMapObjectId";
		public static final String COLUMN_IMPORTANCE = "HealthMapImportance";
		public static final String COLUMN_COUNTRY = "HealthMapCountry";
		public static final String COLUMN_DISEASE = "HealthMapDisease";
		public static final String COLUMN_DATASOURCE = "HealthMapDataSource";
		public static final String COLUMN_DATE = "HealthMapDate";
		public static final String COLUMN_SUMMARY = "HealthMapSummary";

		public static final String COLUMN_NAME_NULLABLE = null;
	}
	public static abstract class TestTable implements BaseColumns {
		public static final String TABLE_NAME = "TESTTABLE";
		public static final String _ID = "_ID";
		public static final String COLUMN_TEST = "Test";

		public static final String COLUMN_NAME_NULLABLE = null;
	}
}

