package org.example.find_anagram

fun findAnagram(s: String, t: String): Boolean {
    // Check if the lengths of s and t are different
    if (s.length != t.length) return false

    // Declare an array to count occurrences of each character (26 letters in English alphabet)
    val alphabets = Array(26) { 0 }

    // Iterate over each character in s and corresponding character in t
    s.forEachIndexed { index, _ ->
        // Increment the count for the character in s
        alphabets[s[index] - 'a']++
        // Decrement the count for the corresponding character in t
        alphabets[t[index] - 'a']--
    }

    // Iterate over all elements in the alphabets array
    alphabets.forEach { value ->
        // If any element is not zero, it means the counts do not match
        if (value != 0) {
            return false
        }
    }

    // If all counts are balanced (zero), the strings are anagrams
    return true
}

fun findAnagramHashMap(s: String, t: String): Boolean {
    if (s.length != t.length) return false
    val sHashMap = hashMapOf<Char, Int>()
    val tHashMap = hashMapOf<Char, Int>()
    s.forEach { character ->
        sHashMap[character] = sHashMap[character]?.plus(1) ?: 1
    }

    t.forEach { character ->
        tHashMap[character] = tHashMap[character]?.plus(1) ?: 1
    }

    sHashMap.forEach { value ->
        if (tHashMap[value.key] != value.value) return false
    }
    return true
}
