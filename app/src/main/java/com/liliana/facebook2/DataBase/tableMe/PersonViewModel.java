package com.liliana.facebook2.DataBase.tableMe;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.liliana.facebook2.Model.PersonObject;

import java.util.List;

public class PersonViewModel extends AndroidViewModel {
    private Personrepository mperson;
    private LiveData<List<PersonObject>> persons;
    public PersonViewModel(@NonNull Application application) {
        super(application);
        mperson= new Personrepository(application);
        persons=mperson.getallPerson();
    }
    public void insertPerson(PersonObject pr) {mperson.insertDay(pr);}
    public void updatePerson(PersonObject pr) {mperson.insertDay(pr);}
    public LiveData<List<PersonObject>> getallPerson(){return persons;}

}
