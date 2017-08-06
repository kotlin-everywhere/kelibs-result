package com.minek.kotlin.everywhere.kelibs

import com.minek.kotlin.everywhere.kelibs.result.*
import org.junit.Test
import kotlin.test.assertEquals

class TestResult {
    @Test
    fun testTypeVariant() {
        val exceptionOk: Result<Exception, String> = Ok("success")
        val stringOk: Result<String, String> = Ok("success")
        assertEquals<Result<*, String>>(exceptionOk, stringOk)

        val intErr: Result<String, Int> = Err("success")
        val stringErr: Result<String, String> = Err("success")
        assertEquals<Result<String, *>>(intErr, stringErr)
    }

    @Test
    fun testMap() {
        assertEquals(ok(1), ok("Success").map(1))
        assertEquals(err("Fail"), err("Fail").map(1))
    }
}