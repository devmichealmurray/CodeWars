package _7kyu

/**
 * In this Kata, you will be given a string that may have mixed uppercase and lowercase
 * letters and your task is to convert that string to either lowercase only or uppercase
 * only based on: make as few changes as possible.
 * if the string contains equal number of uppercase and lowercase letters, convert the
 * string to lowercase.
 */

fun main() {

    solve("code")

}

fun solve(s: String): String {
    var upper = 0
    var lower = 0

    val stringArray = s.toCharArray()
    stringArray.forEach {
        if (it.isLowerCase()) lower++ else upper++
    }

    return if (lower >= upper) s.toLowerCase() else s.toUpperCase()
}