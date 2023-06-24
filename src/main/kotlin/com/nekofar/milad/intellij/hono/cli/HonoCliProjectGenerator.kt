package com.nekofar.milad.intellij.hono.cli

import com.intellij.execution.filters.Filter
import com.intellij.lang.javascript.boilerplate.NpmPackageProjectGenerator
import com.intellij.lang.javascript.boilerplate.NpxPackageDescriptor
import com.intellij.openapi.project.Project
import com.intellij.openapi.roots.ContentEntry
import com.intellij.openapi.vfs.VirtualFile
import com.nekofar.milad.intellij.hono.HonoBundle
import com.nekofar.milad.intellij.hono.HonoIcons
import javax.swing.Icon

class HonoCliProjectGenerator : NpmPackageProjectGenerator() {
    private val packageName = "create-hono"
    private val npxCommand = "create-hono"

    override fun getName(): String = HonoBundle.message("hono.project.generator.name")

    override fun getDescription(): String = HonoBundle.message("hono.project.generator.description")

    override fun filters(project: Project, baseDir: VirtualFile): Array<Filter> = emptyArray()

    override fun customizeModule(virtualFile: VirtualFile, contentEntry: ContentEntry?) {}

    override fun packageName(): String = packageName

    override fun presentablePackageName(): String =
        HonoBundle.message("hono.project.generator.presentable.package.name")

    override fun getNpxCommands() = listOf(NpxPackageDescriptor.NpxCommand(packageName, npxCommand))

    override fun generateInTemp(): Boolean = true

    override fun generatorArgs(project: Project?, dir: VirtualFile?, settings: Settings?) =
        project?.let { arrayOf(it.name) }

    override fun getIcon(): Icon = HonoIcons.ProjectGenerator
}
