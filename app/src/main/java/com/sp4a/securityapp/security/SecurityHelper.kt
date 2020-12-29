package com.sp4a.securityapp.security

import android.content.Context
import android.text.TextUtils
import com.sp4a.tt.security.interfaces.ISecurity


class SecurityHelper constructor(private val context: Context): ISecurity{


    companion object {
        @Volatile private var instance: SecurityHelper? = null
        @JvmStatic fun getInstance(context: Context) =
                instance ?: synchronized(this) {
                    instance ?: SecurityHelper(context).also { instance = it }
                }
    }

    override fun decryptString(source: String?): String? {
        return ""

    }

    override fun encryptString(source: String?): String? {
        return ""
    }


}