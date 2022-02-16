package com.github.emthornber.epmplugin.services

import com.intellij.openapi.project.Project
import com.github.emthornber.epmplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
