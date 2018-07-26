package io.github.plenglin.goggle.app

import io.github.plenglin.goggle.util.activity.Activity

interface GoggleApp {

    val appName: String
    val appLabel: String

    fun createInitialActivity(): Activity

}