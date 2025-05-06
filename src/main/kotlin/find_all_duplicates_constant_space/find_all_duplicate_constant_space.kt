package org.example.find_all_duplicates_constant_space

import kotlin.math.abs


/**
 * Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears at most twice, return an array of all the integers that appears twice.
 *
 * You must write an algorithm that runs in O(n) time and uses only constant auxiliary space, excluding the space needed to store the output
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [4,3,2,7,8,2,3,1]
 * Output: [2,3]
 * Example 2:
 *
 * Input: nums = [1,1,2]
 * Output: [1]
 * Example 3:
 *
 * Input: nums = [1]
 * Output: []
 *
 *
 * Constraints:
 *
 * n == nums.length
 * 1 <= n <= 105
 * 1 <= nums[i] <= n
 * Each element in nums appears once or twice.
 * */
fun findDuplicatesConstantSpace(nums: IntArray): List<Int> {
    val result = mutableListOf<Int>()
    nums.forEach { value ->
        val absoluteValue = abs(value)
        val indexToBeFlipped = absoluteValue - 1
        if (nums[indexToBeFlipped] < 0) {
            result.add(absoluteValue)
        } else {
            nums[indexToBeFlipped] = -nums[indexToBeFlipped]
        }
    }
    return result
}