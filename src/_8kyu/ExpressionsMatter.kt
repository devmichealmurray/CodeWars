package _8kyu

import kotlin.math.exp

/**
 * Completed
 * Task
 * Given three integers a ,b ,c, return the largest number obtained after inserting the following operators and
 * brackets: +, *, ()
 * In other words , try every combination of a,b,c with [*+()] , and return the Maximum Obtained
 *
 * https://www.codewars.com/kata/5ae62fcf252e66d44d00008e/train/kotlin
 */

fun main() {
    val kata = Kata
    kata.expressionsMatter(1, 2, 3)
}

class Kata {
    companion object {

        fun expressionsMatter(a: Int, b: Int, c: Int): Int {
            val one: Int = a * b * c
            val two: Int = (a * b) * c
            val three: Int = a * (b * c)
            val four: Int = a + b + c
            val five: Int = (a + b) + c
            val six: Int = a + (b + c)
            val seven: Int = a * (b + c)
            val eight: Int = (a * b) + c
            val nine: Int = a + (b * c)
            val ten: Int = (a + b) * c
            val eleven: Int = a + b + c
            val twelve: Int = a * b + c
            val thirteen: Int = a + b * c

            return arrayOf(one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen)
                .max()!!

        }

    }
}

// Better Solution =
// fun expressionsMatter(a : Int, b : Int, c : Int) =
//  intArrayOf(a + b + c, a + b * c, a * b * c, a * b + c, (a + b) * c, a * (b + c)).max()