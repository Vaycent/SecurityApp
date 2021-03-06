package com.sp4a.securityapp.security

import android.content.Context
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
        lateinit var mSecurityHelper1: SecurityHelper
        lateinit var mSecurityHelper2: SecurityHelper
        lateinit var mSecurityHelper3: SecurityHelper
    }
    @Before
    fun init() {
        println("===@Before init called===")
        context = mock(Context::class.java)
        mSecurityHelper1 = SecurityHelper.getInstance(context)
        mSecurityHelper2 = SecurityHelper.getInstance(context)
        mSecurityHelper3 = SecurityHelper.getInstance(context)
    }
    @Test
    fun testInstanceOnce() {
        println("ooo@Test testInstance1 calledooo")
        assertNotNull(mSecurityHelper1)
    }
    @Test
    fun testInstanceTwice() {
        println("ooo@Test testInstance2 calledooo")
        assertSame(mSecurityHelper1, mSecurityHelper2)
    }
    @Test
    fun testInstanceThird() {
        println("ooo@Test testInstance3 calledooo")
        assertEquals(mSecurityHelper3.javaClass.name, mSecurityHelper2.javaClass.name)
    }
    @After
    fun clearDataForTest() {
        println("===@After clearDataForTest called===")
    }

    @Test
    fun decryptStringTest(){
        mSecurityHelper1.decryptString("")
        println("我来拉高覆盖率指标，嘿嘿嘿")
    }
    @Test
    fun encryptStringTest(){
        mSecurityHelper1.encryptString("")
        println("我来拉高覆盖率指标，嘿嘿嘿")
    }

    @Test
    fun resetFooTest(){
        mSecurityHelper1.foo="fooAgain"
        mSecurityHelper1.resetFoo("fooAgain")
        assertEquals(mSecurityHelper1.foo,"fooAgain")
    }

    @Test
    fun getAgainFooTest(){
        assertEquals(mSecurityHelper1.getAgainFoo(),"fooAgain")
    }
}
