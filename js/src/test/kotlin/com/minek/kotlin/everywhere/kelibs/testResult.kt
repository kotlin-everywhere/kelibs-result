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
        // test same type
        assertEquals(ok(2), ok(1).map { it * 2 })
        // test change type on map
        assertEquals(ok(7), ok("Success").map { it.length })
        // test skip map on error
        assertEquals(err("Fail"), err("Fail").map { 1 })
    }
}