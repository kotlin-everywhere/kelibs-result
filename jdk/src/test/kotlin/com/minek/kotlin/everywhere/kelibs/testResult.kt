package com.minek.kotlin.everywhere.kelibs

import com.minek.kotlin.everywhere.kelibs.result.*
import org.junit.Assert
import org.junit.Test

class TestResult {
    @Test
    fun testTypeVariant() {
        val exceptionOk: Result<Exception, String> = Ok("success")
        val stringOk: Result<String, String> = Ok("success")
        Assert.assertEquals(exceptionOk, stringOk)

        val intErr: Result<String, Int> = Err("success")
        val stringErr: Result<String, String> = Err("success")
        Assert.assertEquals(intErr, stringErr)
    }

    @Test
    fun testMap() {
        Assert.assertEquals(ok(1), ok("Success").map(1))
        Assert.assertEquals(err("Fail"), err("Fail").map(1))
    }
}