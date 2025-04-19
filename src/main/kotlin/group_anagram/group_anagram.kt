package org.example.group_anagram

fun groupAnagrams(strs: List<String>): List<List<String>> {
    // Create a map to store groups of anagrams
    val map = mutableMapOf<String, MutableList<String>>()

    for (str in strs) {
        // Convert the string to a sorted version
        val sortedStr = str.toCharArray().sorted().joinToString("")

        // If this sorted version is not already a key in our map, add it with an empty list
        if (!map.containsKey(sortedStr)) {
            map[sortedStr] = mutableListOf()
        }

        // Add the original string to its corresponding group
        map[sortedStr]?.add(str)
    }

    // Return all the groups of anagrams
    return map.values.toList()
}
