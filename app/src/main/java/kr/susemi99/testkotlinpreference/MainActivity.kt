package kr.susemi99.testkotlinpreference

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kr.susemi99.testkotlinpreference.models.User
import kr.susemi99.testkotlinpreference.utils.AppPreference

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    writeButton.setOnClickListener({ write() })
    readButton.setOnClickListener({ read() })
  }

  fun write() {
    val users = List(5) { i -> User("Name$i", i) }
    AppPreference.users = users
    read()
  }

  fun read() {
    Log.i("###", "" + AppPreference.users)
    body.text = AppPreference.users.toString()

//    for (user in AppPreference.users!!) {
//      Log.i("APP# MainActivity | read", user.name + ", " + user.age)
//    }
  }
}
