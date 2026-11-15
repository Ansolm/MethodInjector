package com.ansolm.methodinjector.entity


/**
 * @author  : ansolm
 * @mail    : ansolm@outlook.com
 * @project : https://github.com/ansolm/MethodInjector
 */
data class Method(val name: String?, var lineNumber: Int, val descriptor: String?, var argc: Int= 0,val args: MutableList<String> = mutableListOf())