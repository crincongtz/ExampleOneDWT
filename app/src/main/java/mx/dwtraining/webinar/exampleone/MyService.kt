package mx.dwtraining.webinar.exampleone

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

const val TAG = "MyService"
const val MY_STRING = "MyString"

class MyService : Service() {

    override fun onCreate() {
        Log.v(TAG, "Iniciando servicio")
        super.onCreate()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return super.onStartCommand(intent, flags, startId)
    }

    private fun reverseMyString(myString: String) {
        val splitString = myString.split(" ")

        val reversedStrings = splitString.reversed()

        val joinAllStrings = reversedStrings.joinToString(" ")
    }

    override fun onDestroy() {
        Log.v(TAG, "Destruyendo servicio")
        super.onDestroy()
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }
}
