package com.nekofar.milad.intellij.hono.cli

import com.intellij.ide.util.projectWizard.WebTemplateNewProjectWizard
import com.intellij.ide.wizard.GeneratorNewProjectWizardBuilderAdapter

class HonoCliProjectModuleBuilder : GeneratorNewProjectWizardBuilderAdapter(WebTemplateNewProjectWizard(
    HonoCliProjectGenerator()
))
