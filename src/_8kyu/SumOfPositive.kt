package _8kyu

/**
 * Completed
You get an array of numbers, return the sum of all of the positives ones.

Example [1,-4,7,12] => 1 + 7 + 12 = 20

Note: if there is nothing to sum, the sum is default to 0.
 */

fun main() {
    println(sum(intArrayOf(1, 2, 3, 4, 5)))
}

fun sum(numbers: IntArray): Int {
    var answer = 0
    numbers.forEach {
        if (it > 0) answer += it
    }
    return answer
}

// Better answer = fun sum(numbers: IntArray) = numbers.filter { it > 0 }.sum()