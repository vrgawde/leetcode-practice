package org.example.two_sum

fun twoSum(numbers: Array<Int>, sum: Int): List<Int> {
    val hashMap = hashMapOf<Int, Int>()

    numbers.forEachIndexed { index, value ->
        val target = sum - value
        if (hashMap.contains(target)) {
            val n = hashMap[target]
            n?.let {
                return listOf(it, index)
            }
        } else {
            hashMap[value] = index
        }
    }

    return listOf()
}