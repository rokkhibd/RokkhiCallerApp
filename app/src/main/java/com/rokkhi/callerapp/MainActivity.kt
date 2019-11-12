package com.rokkhi.callerapp

import android.Manifest
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telecom.TelecomManager
import android.view.View
import androidx.core.app.ActivityCompat
import androidx.core.content.PermissionChecker
import androidx.core.net.toUri
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//
//        phoneNumberInput.setText(intent?.data?.schemeSpecificPart)
//        makeCall()
    }
/*
    override fun onStart() {
        super.onStart()
        offerReplacingDefaultDialer()

        phoneNumberInput.setOnEditorActionListener { _, _, _ ->
            makeCall()
            true
        }
    }

    private fun makeCall() {
        if (PermissionChecker.checkSelfPermission(
                this,
                Manifest.permission.CALL_PHONE
            ) == PermissionChecker.PERMISSION_GRANTED
        ) {
            val uri = "tel:${phoneNumberInput.text}".toUri()
//            val uri = "tel:01687870058".toUri()
            startActivity(Intent(Intent.ACTION_CALL, uri))
        } else {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.CALL_PHONE),
                REQUEST_PERMISSION
            )
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        if (requestCode == REQUEST_PERMISSION && PermissionChecker.PERMISSION_GRANTED in grantResults) {
            makeCall()
        }
    }

    private fun offerReplacingDefaultDialer() {

        if (getSystemService(TelecomManager::class.java).defaultDialerPackage != packageName) {
            Intent(TelecomManager.ACTION_CHANGE_DEFAULT_DIALER)
                .putExtra(TelecomManager.EXTRA_CHANGE_DEFAULT_DIALER_PACKAGE_NAME, packageName)
                .let(::startActivity)
        }
    }

    companion object {
        const val REQUEST_PERMISSION = 0
    }

    fun makeCall(view: View) {

        makeCall()
    }*/
}
