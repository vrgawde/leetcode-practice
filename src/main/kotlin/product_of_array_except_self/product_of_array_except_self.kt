package org.example.product_of_array_except_self

/**
 * Solving the "Product of Array Except Self" problem requires a bit of creative thinking and understanding how to use auxiliary arrays effectively. Here’s a step-by-step approach on how someone might come up with this solution:
 *
 * ### Step-by-Step Approach:
 *
 * 1. **Understand the Problem:**
 *    - The goal is to create an array where each element at index `i` is the product of all elements in the original array except for the element at `i`.
 *    - You must achieve this without using division and with a time complexity of O(n).
 *
 * 2. **Initial Thoughts:**
 *    - One might initially think about iterating through the array multiple times to calculate the product for each position but this would lead to an O(n^2) solution, which is not efficient.
 *
 * 3. **Using Auxiliary Arrays:**
 *    - The key insight is to use two auxiliary arrays, `leftProducts` and `rightProducts`.
 *    - `leftProducts[i]` will store the product of all elements to the left of `nums[i]`.
 *    - `rightProducts[i]` will store the product of all elements to the right of `nums[i]`.
 *
 * 4. **Calculate `leftProducts`:**
 *    - Initialize `leftProducts[0] = 1` because there are no elements to the left of the first element.
 *    - For each index `i > 0`, calculate `leftProducts[i] = nums[i-1] * leftProducts[i-1]`. This will give us the product of all elements to the left of `nums[i]`.
 *
 * 5. **Calculate `rightProducts`:**
 *    - Initialize `rightProducts[n-1] = 1` because there are no elements to the right of the last element.
 *    - For each index `i < n-1`, calculate `rightProducts[i] = nums[i+1] * rightProducts[i+1]`. This will give us the product of all elements to the right of `nums[i]`.
 *
 * 6. **Combine Results:**
 *    - The result at each position `i` is simply `leftProducts[i] * rightProducts[i]`, which gives the product of all elements except `nums[i]`.
 *
 * 7. **Optimization:**
 *    - To optimize space, you can reuse the input array to store intermediate results for `rightProducts`. This way, you only need one additional array (`leftProducts`).
 *
 * ### Example Walkthrough:
 * For `nums = [1, 2, 3, 4]`:
 *
 * - Initialize `leftProducts = [1, 1, 2, 6]`.
 * - Initialize `rightProducts = [24, 12, 4, 1]`.
 * - Calculate result: `[leftProducts[0]*rightProducts[0], leftProducts[1]*rightProducts[1], leftProducts[2]*rightProducts[2], leftProducts[3]*rightProducts[3]] = [1*24, 1*12, 2*4, 6*1] = [24, 12, 8, 6]`.
 *
 * ### Conclusion:
 * The problem can be solved efficiently by leveraging two auxiliary arrays to store the cumulative products of elements on both sides. This approach ensures that each element in the result array is computed in constant time after the initial passes through the input array.
 *
 * By breaking down the problem into smaller parts and using auxiliary arrays effectively, you can solve it with a linear time complexity and without division, making it a great exercise for understanding dynamic programming and space optimization techniques.
 * */

fun productExceptSelf(nums: List<Int>): List<Int> {
    val n = nums.size

    // Create two lists to store left and right products
    val leftProducts = MutableList(n) { 1 }
    val rightProducts = MutableList(n) { 1 }

    // Calculate left products
    for (i in 1 until n) {
        leftProducts[i] = nums[i - 1] * leftProducts[i - 1]
    }

    // Calculate right products
    for (i in n - 2 downTo 0) {
        rightProducts[i] = nums[i + 1] * rightProducts[i + 1]
    }

    // Combine results to get the final product array
    val result = MutableList(n) { leftProducts[it] * rightProducts[it] }
    return result
}
