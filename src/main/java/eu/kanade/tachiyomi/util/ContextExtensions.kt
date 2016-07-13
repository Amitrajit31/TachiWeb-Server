package eu.kanade.tachiyomi.util

import android.app.AlarmManager
import android.app.NotificationManager
import android.content.Context
import android.widget.Toast

/**
 * Modified to make up for missing classes and functions
 */
//TODO Keep up to date

/**
 * Display a toast in this context.
 * @param resource the text resource.
 * @param duration the duration of the toast. Defaults to short.
 */
fun Context.toast(resource: Int, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, resource, duration).show()
}

/**
 * Display a toast in this context.
 * @param text the text to display.
 * @param duration the duration of the toast. Defaults to short.
 */
fun Context.toast(text: String?, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, text, duration).show()
}

/**
 * Helper method to create a notification.
 * @param func the function that will execute inside the builder.
 * @return a notification to be displayed or updated.
 */
/*
inline fun Context.notification(func: NotificationCompat.Builder.() -> Unit): Notification {
    val builder = NotificationCompat.Builder(this)
    builder.func()
    return builder.build()
}*/

/**
 * Checks if the give permission is granted.
 * @param permission the permission to check.
 * @return true if it has permissions.
 */
fun Context.hasPermission(permission: String) = true

/**
 * Property to get the notification manager from the context.
 */
val Context.notificationManager: NotificationManager
    get() = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

/**
 * Property to get the alarm manager from the context.
 * @return the alarm manager.
 */
val Context.alarmManager: AlarmManager
    get() = getSystemService(Context.ALARM_SERVICE) as AlarmManager