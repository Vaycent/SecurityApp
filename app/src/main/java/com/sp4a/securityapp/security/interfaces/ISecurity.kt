package com.sp4a.tt.security.interfaces

import android.content.Context

/**
 * 加解密接口
 * Created by sunwei on 2018/2/5.
 */
interface ISecurity {


    /**
     * 解密
     * @param source 要解密的字符串
     * @return 解密后的字符串
     */
    fun decryptString(source: String?): ByteArray?

    /**
     * 加密
     * @param source   要加=密的字符串
     * @return 解密后的字符串
     */
    fun encryptString(source: String?): String?
}