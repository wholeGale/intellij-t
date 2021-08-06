package com.github.wholegale.intellijt.services

import com.github.wholegale.intellijt.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
