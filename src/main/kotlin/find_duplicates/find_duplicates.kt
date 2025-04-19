package org.example.find_duplicates

fun findDuplicates(numbers: List<Int>): Boolean {
    // Create a HashMap to store the numbers we've seen so far
    val numMap = hashMapOf<Int, Int>()

    // Iterate through each number in the list
    numbers.forEach { value ->
        // Check if the current number is already in the map
        if (numMap[value] != null) {
            // If it is, then we found a duplicate, so return true
            return true
        }
        // If it's not, add it to the map with its value as the key
        numMap[value] = value
    }

    // If we've gone through all numbers and found no duplicates, return false
    return false
}
