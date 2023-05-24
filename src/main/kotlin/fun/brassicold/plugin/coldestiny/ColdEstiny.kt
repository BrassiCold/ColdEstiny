package `fun`.brassicold.plugin.coldestiny

import taboolib.common.platform.Plugin
import taboolib.common.platform.function.info

object ColdEstiny : Plugin() {

    override fun onLoad() {
        info("Loading")
    }

    override fun onEnable() {
        info("Successfully running ExamplePlugin!")
    }

}