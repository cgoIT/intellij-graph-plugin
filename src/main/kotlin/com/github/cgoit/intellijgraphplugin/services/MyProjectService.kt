package com.github.cgoit.intellijgraphplugin.services

import com.intellij.openapi.project.Project
import com.github.cgoit.intellijgraphplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
