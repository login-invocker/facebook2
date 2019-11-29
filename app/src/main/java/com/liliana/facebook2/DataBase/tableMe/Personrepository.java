package com.liliana.facebook2.DataBase.tableMe;

import android.app.Application;
import android.app.Person;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.liliana.facebook2.DataBase.ApplicationRoom;
import com.liliana.facebook2.DataBase.PersonDao;
import com.liliana.facebook2.Model.PersonObject;

import java.util.List;

public class Personrepository {
    private PersonDao personDao;
    private LiveData<List<PersonObject>> allPerson;

    public Personrepository(Application application){
        ApplicationRoom database= ApplicationRoom.getInstance(application);
        personDao=database.getAplicationDao();
        allPerson=personDao.getAllPerson();
    }
    public LiveData<List<PersonObject>> getallPerson(){return allPerson;}
    public void insertDay(PersonObject pr) {
        new InsertTask(personDao).execute(pr);
    }
    private static class InsertTask extends AsyncTask<PersonObject, Void, Void> {
        private PersonDao applicationDao;

        private InsertTask(PersonDao applicationDao) {
            this.applicationDao = applicationDao;
        }

        @Override
        protected Void doInBackground(PersonObject... persons) {
            applicationDao.insertPerson(persons[0]);
            return null;
        }
    }

    public void updateDay(PersonObject pr) {
        new UpdateTask(personDao).execute(pr);
    }

    private static class UpdateTask extends AsyncTask<PersonObject, Void, Void> {
        private PersonDao applicationDao;

        private UpdateTask(PersonDao applicationDao) {
            this.applicationDao = applicationDao;
        }

        @Override
        protected Void doInBackground(PersonObject... persons) {
            applicationDao.updatePerson(persons[0]);
            return null;
        }
    }
}
