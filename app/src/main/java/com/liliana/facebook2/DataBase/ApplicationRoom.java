package com.liliana.facebook2.DataBase;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.liliana.facebook2.Model.PersonObject;

@Database(entities = {PersonObject.class},version = 1)
public abstract class ApplicationRoom extends RoomDatabase {
        private static volatile ApplicationRoom instance;
        public abstract PersonDao  getAplicationDao();
        public static synchronized ApplicationRoom getInstance(Context context){
            if(instance==null){
                instance= Room.databaseBuilder(context.getApplicationContext(),ApplicationRoom.class,"db")
                        .fallbackToDestructiveMigration()
                        .build();
            }return instance;
        }
}
