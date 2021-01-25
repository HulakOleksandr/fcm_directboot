package com.hulak.twitchdrops.broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class DirectBootBroadcastReceiver : BroadcastReceiver() {
    companion object {
        private val TAG: String by lazy { DirectBootBroadcastReceiver::class.java.simpleName }
    }

    override fun onReceive(context: Context?, intent: Intent?) {
        Log.d(TAG, "onReceive: action=${intent?.action}")
    }
}