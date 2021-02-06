package com.sp4a.securityapp.security

import android.content.Context
import android.text.TextUtils
import com.sp4a.tt.security.interfaces.ISecurity


class SecurityHelper constructor(private val context: Context) : ISecurity {

    lateinit var foo: String

    fun resetFoo(source: String) {
        foo = source
    }

    fun getAgainFoo(): String {
        return foo
    }

    fun returnFei(source: Int): Boolean {

        if (source >= 14) { //==
            return true
        }
//        if (source == 2) {
//            return true
//        }
//        if (source == 3) {
//            return true
//        }
        return false
    }

    companion object {
        @Volatile
        private var instance: SecurityHelper? = null

        @JvmStatic
        fun getInstance(context: Context) =
            instance ?: synchronized(this) {
                instance ?: SecurityHelper(context).also { instance = it }
            }
    }

    override fun encryptString(source: String?): String? {
        return "sec_$source"
    }

    override fun decryptString(source: String?): String? {
        if (source != null) {
//            return source.replace("sec_","")
            return source.substring(4, source.length)

        }
        return null.toString()
    }
}


