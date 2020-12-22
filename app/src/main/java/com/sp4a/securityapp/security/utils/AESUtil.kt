package com.sp4a.securityapp.security.utils

import android.R.attr.data
import android.R.attr.key
import android.util.Base64
import com.sp4a.tt.security.interfaces.ISecurity
import javax.crypto.Cipher
import javax.crypto.spec.IvParameterSpec
import javax.crypto.spec.SecretKeySpec


class AESUtil: ISecurity{

    private val CipherMode = "AES/CFB/NoPadding" //使用CFB加密，需要设置IV


    override fun decryptString(source: String?): ByteArray? {
        TODO("Not yet implemented")
    }

    override fun encryptString(source: String?): String? {
        return try {
            val cipher: Cipher = Cipher.getInstance(CipherMode)
            val keyspec = SecretKeySpec(key.getBytes(), "AES")
            cipher.init(Cipher.ENCRYPT_MODE, keyspec, IvParameterSpec(ByteArray(cipher.getBlockSize())))
            val encrypted: ByteArray = cipher.doFinal(data.getBytes())
            Base64.encodeToString(encrypted, Base64.DEFAULT)
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

}