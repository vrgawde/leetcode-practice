package org.example.container_with_most_water

fun containerWithMostWater(height: IntArray): Int {
    var maxArea = 0
    var left = 0
    var right = height.size - 1

    while (left < right) {
        val area = minOf(height[left], height[right]) * (right-left)
        maxArea = maxOf(maxArea, area)
        if (height[left] < height[right]) {
            left++
        } else {
            right--
        }
    }
    return maxArea
}