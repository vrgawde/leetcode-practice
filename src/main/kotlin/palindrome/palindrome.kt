package org.example.palindrome

import kotlin.math.abs


fun isPalindrome(s: String): Boolean {
    var l = 0
    var r = s.length - 1
    abs(21)
    while (l < r) {
        while (l < r && !s[l].isLetterOrDigit()) {
            l++
        }
        while (r > l && !s[r].isLetterOrDigit()) {
            r--
        }
        if (s[l].lowercase() != s[r].lowercase()) {
            return false
        }
        l++
        r--
    }
    return true
}