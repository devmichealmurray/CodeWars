package _8kyu

/**
 * Completed
 *
 * In this simple assignment you are given a number and have to make it negative. But maybe the number is already negative?

 * Example:
 * Kata().makeNegative(1)  // return -1
 * Kata().makeNegative(-5) // return -5
 * Kata().makeNegative(0)  // return 0
 * Notes:

 * The number can be negative already, in which case no change is required.
 * Zero (0) is not checked for any specific sign. Negative zeros make no mathematical sense.
 *
 * https://www.codewars.com/kata/55685cd7ad70877c23000102/train/kotlin
 */


fun main() {

    println(-42 == makeNegative(42))
    println(-15 == makeNegative(15))
    println(0 == makeNegative(0))
    println(-12 == makeNegative(-12))

}

fun makeNegative(x: Int) = if(x > 0) x * -1  else x
