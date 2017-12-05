package com.singletondev.room_persistance

import android.content.Context
import android.os.AsyncTask
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    lateinit var context : Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        context = baseContext
        databaseCrud().execute(context)

    }

    public class databaseCrud : AsyncTask<Context, Void, List<Repo>>() {
        override fun doInBackground(vararg p0: Context): List<Repo> {
            RepoDatabase.getIntances(p0[0]).getRepoDao().insertRepo(Repo("coba coba"))
            return RepoDatabase.getIntances(p0[0]).getRepoDao().getAllRepo()
        }

        override fun onPostExecute(result: List<Repo>) {
            super.onPostExecute(result)
            result.forEach { Log.e("nama",it.name) }

        }


    }
}
