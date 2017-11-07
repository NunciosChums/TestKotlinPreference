package kr.susemi99.testkotlinpreference.utils

import com.marcinmoskala.kotlinpreferences.PreferenceHolder
import kr.susemi99.testkotlinpreference.models.User


object AppPreference : PreferenceHolder() {
  var users: List<User>? by bindToPreferenceFieldNullable()
}