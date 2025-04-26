package org.example.search_insert_position

/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 * Example 2:
 *
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 * Example 3:
 *
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * nums contains distinct values sorted in ascending order.
 * -104 <= target <= 104
 * */


fun binarySearch(start: Int, end: Int, numbers: IntArray, target: Int): Int? {
    if (start > end) return null
    val mid = start + (end - start) / 2

    return when {
        numbers[mid] < target -> {
            val result = binarySearch(mid + 1, end, numbers, target)
            result ?: (mid + 1)
        }

        numbers[mid] > target -> {
            val result = binarySearch(start, mid - 1, numbers, target)
            result ?: start
        }

        else -> mid
    }
}

fun searchInsert(nums: IntArray, target: Int): Int {
    return binarySearch(0, nums.size-1, nums, target) ?: 0
}