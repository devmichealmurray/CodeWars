package _8kyu

/**
 * Clock shows 'h' hours, 'm' minutes and 's' seconds after midnight.

Your task is to make 'Past' function which returns time converted to milliseconds.

Example:
past(0, 1, 1) == 61000
Input constraints: 0 <= h <= 23, 0 <= m <= 59, 0 <= s <= 59

https://www.codewars.com/kata/55f9bca8ecaa9eac7100004a/train/kotlin
 */

fun main() {
    println(past(0, 1, 1))
    println(past(0, 1, 1))
    println(past(0, 0, 0))
    println(past(1, 0, 1))


}

fun past(h: Int, m: Int, s: Int): Int {
    val millie: Int = 1000
    return ((h * (60 * (60 * millie))) + (m * (60 * millie)) + (s * millie))
}