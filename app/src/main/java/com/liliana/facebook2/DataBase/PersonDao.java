package com.liliana.facebook2.DataBase;

import android.app.Person;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.liliana.facebook2.Model.PersonObject;

import java.util.List;

@Dao
public interface PersonDao {
    @Insert
    void insertPerson(PersonObject person);
    @Update
    void updatePerson(PersonObject personObject);
    @Query("select * from t_object")
    LiveData<List<PersonObject>> getAllPerson();
}
