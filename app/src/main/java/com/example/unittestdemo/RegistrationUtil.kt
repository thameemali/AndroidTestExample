package com.example.unittestdemo

object RegistrationUtil {

    private val existingUsers = listOf("Thameem", "Nithin")

    /**
     * the input is invalid if...
     * ---username/mobile is empty
     * ---username already exists
     * ---mobile number less than 10 digits
     */

    fun validateRegInputs(
        username: String,
        mobile: String
    ): Boolean {
        if (username.isEmpty() || mobile.isEmpty()) {
            return false
        }
        if (username in existingUsers) {
            return false
        }
        if (mobile.length < 10) {
            return false
        }
        if (!username.isEmpty() && mobile.length >= 10) {
            return true
        }
        return true
    }
}