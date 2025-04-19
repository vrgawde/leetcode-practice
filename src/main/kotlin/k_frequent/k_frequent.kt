package org.example.k_frequent

fun topKFrequent(nums: List<Int>, k: Int): List<Int> {
    val freqMap = HashMap<Int, Int>()
    val bucket = MutableList<MutableList<Int>>(nums.size + 1) { mutableListOf() }

    // Count frequency of each element
    for (num in nums) {
        freqMap[num] = freqMap.getOrDefault(num, 0) + 1
    }

    // Populate the bucket array
    for ((num, freq) in freqMap) {
        bucket[freq].add(num)
    }

    // Collect top k frequent elements
    val result = ArrayList<Int>()
    for (i in bucket.size - 1 downTo 0) {
        if (result.size == k) break
        result.addAll(bucket[i])
    }

    return result
}
