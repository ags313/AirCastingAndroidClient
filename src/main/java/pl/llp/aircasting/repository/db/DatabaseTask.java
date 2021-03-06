package pl.llp.aircasting.repository.db;

import android.database.sqlite.SQLiteDatabase;

interface DatabaseTask<T>
{
  T execute(SQLiteDatabase writableDatabase);
}
