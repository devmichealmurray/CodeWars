package _8kyu

/**
 * Completed
 * Given a random non-negative number, you have to return the digits of this number
 * within an array in reverse order.
 */

fun main() {

    val digs = digitize(372846)
    digs.forEach { println(it) }

}

fun digitize(n: Long) = n.toString().reversed().map { it.toString().toInt() }.toIntArray()

