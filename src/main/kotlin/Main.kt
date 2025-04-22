package org.example

import org.example.container_with_most_water.containerWithMostWater
import org.example.find_anagram.findAnagram
import org.example.find_anagram.findAnagramHashMap
import org.example.find_duplicates.findDuplicates
import org.example.group_anagram.groupAnagrams
import org.example.k_frequent.topKFrequent
import org.example.longest_consecutive_subsequnce.longestConsecutiveSubsequence
import org.example.palindrome.isPalindrome
import org.example.product_of_array_except_self.productExceptSelf
import org.example.threesum.threeSum
import org.example.two_sum.twoSum

fun main() {
    println("Find Duplicates")
    var result = findDuplicates(listOf(1, 2, 3, 4, 1))
    println(result)

    result = findDuplicates(listOf(1, 2, 3, 4, 5))
    println(result)
    println("-------------------------------")


    println("Find Anagram")
    result = findAnagram("rat", "tar")
    println(result)

    result = findAnagram("cat", "tac")
    println(result)

    result = findAnagram("hike", "bike")
    println(result)

    result = findAnagramHashMap("rat", "tar")
    println(result)

    result = findAnagramHashMap("cat", "tac")
    println(result)

    result = findAnagramHashMap("hike", "bike")
    println(result)
    println("-------------------------------")


    println("Two Sum")
    var indexOfSum = twoSum(arrayOf(1, 2, 3, 4, 5, 6), 9)
    println(indexOfSum)

    indexOfSum = twoSum(arrayOf(1, 2, 3, 4, 5, 6), 11)
    println(indexOfSum)

    indexOfSum = twoSum(arrayOf(1, 2, 3, 4, 5, 6), 19)
    println(indexOfSum)
    println("-------------------------------")


    println("Group Anagram")
    var listOfAnagram = groupAnagrams(listOf("eat", "tea", "tan", "ate", "nat", "bat"))
    println(listOfAnagram)

    listOfAnagram = groupAnagrams(listOf(""))
    println(listOfAnagram)
    println("-------------------------------")

    println("Top k frequent")
    val k_frequent = topKFrequent(listOf(1, 1, 1, 2, 2, 3, 4, 5, 5), 3)
    println(k_frequent)
    println("-------------------------------")


    println("Product of Array Except Self")
    val product_of_array = productExceptSelf(listOf(1, 2, 3, 4))
    println(product_of_array)
    println("-------------------------------")


//    println("Longest Consecutive Subsequence")
//    val longest_subsequence = longestConsecutiveSubsequence(listOf(0, 5, 3, -1, 200, -1, 0, 2, 7, 4))
//    println(longest_subsequence)
//    println("-------------------------------")

    println("Palindrome")
    val palindrome = isPalindrome("Was it a car or a cat I saw?")
    println(palindrome)
    println("-------------------------------")

    println("Three Sum")
    val threeSum = threeSum(intArrayOf(-1,0,1,2,-1,-4))
    println(threeSum)
    println("-------------------------------")


    println("Container with Most Water")
    val containerWithMostWater = containerWithMostWater(intArrayOf(1,8,6,2,5,4,8,3,7))
    println(containerWithMostWater)
    println("-------------------------------")

}