package com.coolcode.project.studyapp.note.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.coolcode.project.studyapp.note.dao.TodoDao;
import com.coolcode.project.studyapp.note.entities.Todo;


@Database(entities = Todo.class, version = 1, exportSchema = false)
public abstract class DatabaseHelper extends RoomDatabase {

    private static DatabaseHelper myDB;

    public static synchronized DatabaseHelper getDB(Context context){
        if (myDB == null){
            myDB = Room.databaseBuilder(context, DatabaseHelper.class, "todo_db").build();
        }
        return myDB;
    }

    public abstract TodoDao todoDao();
}