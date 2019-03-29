package kr.susemi99.testkotlinpreference.utils

import com.marcinmoskala.kotlinpreferences.PreferenceHolder
import kr.susemi99.testkotlinpreference.models.User


object AppPreference : PreferenceHolder() {
  var users: List<User>? by bindToPreferenceFieldNullable()
  var hashSetIds: HashSet<Int> by bindToPreferenceField(hashSetOf())
//  var hashSetIds: HashSet<Int>? by bindToPreferenceFieldNullable()
  var arrayListIds: ArrayList<Int> by bindToPreferenceField(arrayListOf())
//  var arrayListIds: ArrayList<Int>? by bindToPreferenceFieldNullable()
}