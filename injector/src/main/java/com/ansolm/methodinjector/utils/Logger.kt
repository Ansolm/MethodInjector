package com.ansolm.methodinjector.utils


/**
 * @author  : ansolm
 * @mail    : ansolm@outlook.com
 * @project : https://github.com/ansolm/MethodInjector
 */
object Logger {
    var debug: Boolean = false
    var projectName: String = "";
    fun log(content: String) {
        if (debug) println("> Task :$projectName:transformClassWithMethodInjector:$content")
    }
    fun error(content: String) {
        if (debug) System.err.println("> Task :$projectName:transformClassWithMethodInjector:$content")
    }
}