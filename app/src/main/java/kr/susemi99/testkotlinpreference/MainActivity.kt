package kr.susemi99.testkotlinpreference

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kr.susemi99.testkotlinpreference.models.User
import kr.susemi99.testkotlinpreference.utils.AppPreference

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    writeButton.setOnClickListener { write() }
    readButton.setOnClickListener { read() }

    write2Button.setOnClickListener { write2() }
    read2Button.setOnClickListener { read2() }
  }

  private fun write() {
    val users = List(5) { i -> User("Name$i", i) }
    AppPreference.users = users
    read()
  }

  private fun read() {
    Log.i("APP#", "MainActivity.read(): ${AppPreference.users}")
    body.text = AppPreference.users.toString()
  }

  private fun write2() {
    Log.i("APP#", "111111 MainActivity.write2(): ${AppPreference.hashSetIds}")

    AppPreference.hashSetIds.add((1..100).random())
    AppPreference.hashSetIds.add((1..100).random())
    AppPreference.hashSetIds.add((1..100).random())
    AppPreference.hashSetIds.add((1..100).random())
    AppPreference.hashSetIds.add((1..100).random())

    read2()
  }

  private fun read2() {
    Log.i("APP#", "MainActivity.read2(): ${AppPreference.hashSetIds}")
    body2.text = AppPreference.hashSetIds.toString()
  }
}
