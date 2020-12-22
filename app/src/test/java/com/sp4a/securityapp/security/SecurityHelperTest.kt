package com.sp4a.securityapp.security

import android.content.Context
import com.sp4a.securityapp.security.SecurityHelper.Companion.getInstance
import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito.mock
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class SecurityHelperTest {


    companion object{
        lateinit var context: Context
        lateinit var mAliSecurityHelper1: SecurityHelper
        lateinit var mAliSecurityHelper2: SecurityHelper
        lateinit var mAliSecurityHelper3: SecurityHelper
    }
    @Before
    fun init() {
        println("===@Before init called===")
        context = mock(Context::class.java)
        mAliSecurityHelper1 = SecurityHelper.getInstance(context)
        mAliSecurityHelper2 = SecurityHelper.getInstance(context)
        mAliSecurityHelper3 = SecurityHelper.getInstance(context)
    }

    @Test
    fun decryptString() {
        println("===@Test decryptString called===")
    }

    @Test
    fun encryptString() {
        println("===@Test encryptString called===")
    }

    @Test
    fun testInstanceOnce() {
        println("ooo@Test testInstance1 calledooo")
        assertNotNull(mAliSecurityHelper1)
    }

    @Test
    fun testInstanceTwice() {
        println("ooo@Test testInstance2 calledooo")
        assertSame(mAliSecurityHelper1, mAliSecurityHelper2)
    }

    @Test
    fun testInstanceThird() {
        println("ooo@Test testInstance3 calledooo")
        assertEquals(mAliSecurityHelper3.javaClass.name, mAliSecurityHelper2.javaClass.name)
    }

    @After
    fun clearDataForTest() {
        println("===@After clearDataForTest called===")
    }
}