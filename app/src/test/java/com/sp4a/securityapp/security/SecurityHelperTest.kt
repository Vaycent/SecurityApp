package com.sp4a.securityapp.security

import android.content.Context
import org.junit.*

import org.junit.Assert.*
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
    fun testInstance1() {
        println("ooo@Test testInstance1 calledooo")
        mAliSecurityHelper1 = SecurityHelper.getInstance(context)
        assertNotNull(mAliSecurityHelper1)
    }

    @Test
    fun testInstance2() {
        println("ooo@Test testInstance2 calledooo")
        mAliSecurityHelper2 = SecurityHelper.getInstance(context)
        assertSame(mAliSecurityHelper1,mAliSecurityHelper2)
    }

    @Test
    fun testInstance3() {
        println("ooo@Test testInstance3 calledooo")
        mAliSecurityHelper3 = SecurityHelper.getInstance(context)
        assertSame(mAliSecurityHelper2,mAliSecurityHelper3)
    }

    @After
    fun clearDataForTest() {
        println("===@After clearDataForTest called===")
    }
}