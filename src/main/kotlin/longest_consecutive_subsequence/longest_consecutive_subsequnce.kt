package org.example.longest_consecutive_subsequnce

fun longestConsecutiveSubsequence(numbers: List<Int>): Int {
    val sortedList = numbers.sorted()
    var ans = 0

    for (index in sortedList) {
        if (index == sortedList.size) continue
        val diff = sortedList[index+1] - sortedList[index]
        val areElementSame = sortedList[index+1] == sortedList[index]

        if (areElementSame) continue
        if (diff == 1 && areElementSame.not()) {
            ans++
        } else {
            ans = 0
        }
    }
//    sortedList.forEach { index ->
//        if (index == sortedList.size) return@forEach
//        val diff = sortedList[index+1] - sortedList[index]
//        val areElementSame = sortedList[index+1] == sortedList[index]
//        if (diff == 1 && areElementSame.not()) {
//            ans++
//        } else {
//            ans = 0
//        }
//    }

    return ans
}