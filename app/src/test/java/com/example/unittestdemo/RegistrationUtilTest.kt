package com.example.unittestdemo

import com.google.common.truth.Truth.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

class RegistrationUtilTest{
    @Test
    fun `if username is empty`(){
        val result=RegistrationUtil.validateRegInputs("","")
        assertThat(result).isFalse()
    }
    @Test
    fun unsernameExists(){
        val result=RegistrationUtil.validateRegInputs("Thameem","1234567890")
        assertThat(result).isFalse()
    }

}