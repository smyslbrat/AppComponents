package com.example.appcomponents

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.util.Log
import android.widget.Toast

class MusicServ : Service() {
    lateinit var player: MediaPlayer

    override fun onBind(intent: Intent): IBinder? {
        return null
    }

    override fun onCreate() {
        super.onCreate()
        Toast.makeText(this, "Сервис создан", Toast.LENGTH_SHORT).show()
        Log.d("123", "Сервис создан")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Toast.makeText(this, "Сервис запущен", Toast.LENGTH_SHORT).show()
        Log.d("123", "Сервис запущен")
        player = MediaPlayer.create(this, R.raw.mocart)
        player.start()
        return START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "Сервис остановлен", Toast.LENGTH_SHORT).show()
        Log.d("123", "Сервис остановлен")
        player.stop()
    }
}