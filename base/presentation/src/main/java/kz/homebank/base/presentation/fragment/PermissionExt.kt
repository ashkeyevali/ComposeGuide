package kz.homebank.base.presentation.fragment

import android.Manifest
import android.app.Activity
import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat


fun storagePermissionsGranted(context: Context): Boolean {
    for (permission in getStoragePermissions()) {
        if (ContextCompat.checkSelfPermission(
                context,
                permission
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            return false
        }
    }
    return true
}

fun getStoragePermissions(): Array<String> {
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
        emptyArray()
    } else {
        arrayOf(
            Manifest.permission.WRITE_EXTERNAL_STORAGE,
            Manifest.permission.READ_EXTERNAL_STORAGE
        )
    }
}

fun showStorageRequestPopup(activity: Activity, request: Int) {
    ActivityCompat.requestPermissions(
        activity,
        getStoragePermissions(),
        request
    )
}

fun getWriteStoragePermission(): String {
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
        ""
    } else {
        Manifest.permission.WRITE_EXTERNAL_STORAGE
    }
}