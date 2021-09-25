package com.tim.dev_quick_settings_tiles

import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_NEW_TASK
import android.provider.Settings
import android.service.quicksettings.TileService

const val DEV_MODE_DISABLE = 0
const val DEV_MODE_ENABLED = 1

class DevQuickSettingsTiles : TileService() {

    private fun getIntent(action: String): Intent {
        return Intent(action).apply {
            flags = FLAG_ACTIVITY_NEW_TASK
        }
    }

    override fun onClick() {
        super.onClick()
        when(Settings.Secure.getInt(contentResolver, Settings.Global.DEVELOPMENT_SETTINGS_ENABLED, 0)) {
            DEV_MODE_DISABLE -> {
                startActivityAndCollapse(getIntent(Settings.ACTION_SETTINGS))
            }
            DEV_MODE_ENABLED -> {
                startActivityAndCollapse(getIntent(Settings.ACTION_APPLICATION_DEVELOPMENT_SETTINGS))
            }

        }
    }

}