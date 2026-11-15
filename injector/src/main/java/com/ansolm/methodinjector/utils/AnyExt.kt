package com.ansolm.methodinjector.utils

import com.google.gson.GsonBuilder

/**
 * @author  : ansolm
 * @mail    : ansolm@outlook.com
 * @project : https://github.com/ansolm/MethodInjector
 */

val Any.jsonPretty get() = GsonBuilder().setPrettyPrinting().create().toJson(this).toString()
val Any.json get() = GsonBuilder().create().toJson(this).toString()


