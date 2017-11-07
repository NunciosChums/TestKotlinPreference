package kr.susemi99.testkotlinpreference.application

import android.app.Application
import com.google.gson.Gson
import com.marcinmoskala.kotlinpreferences.PreferenceHolder
import com.marcinmoskala.kotlinpreferences.gson.GsonSerializer


class App : Application() {
  override fun onCreate() {
    super.onCreate()
    PreferenceHolder.setContext(applicationContext)
    PreferenceHolder.serializer = GsonSerializer(Gson())
  }
}