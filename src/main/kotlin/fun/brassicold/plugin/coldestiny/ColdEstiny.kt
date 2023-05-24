package `fun`.brassicold.plugin.coldestiny

import `fun`.brassicold.plugin.coldestiny.internal.ColdEstinyLoader
import taboolib.common.platform.Plugin
import taboolib.common.platform.function.info
import taboolib.module.configuration.Config
import taboolib.module.configuration.ConfigFile

object ColdEstiny : Plugin() {

    @Config("setting.yml", migrate = true)
    lateinit var setting: ConfigFile

    override fun onLoad() {
        ColdEstinyLoader.load()
    }

    override fun onEnable() {
        ColdEstinyLoader.enable()
    }

    override fun onDisable() {
        ColdEstinyLoader.disable()
    }

    override fun onActive() {
        ColdEstinyLoader.active()
    }
}