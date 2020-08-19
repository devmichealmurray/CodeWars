package _8kyu

/**
 *  Our football team finished the championship. The result of each match look like "x:y". Results of all matches
 *  are recorded in the collection.
 *  For example: ["3:1", "2:2", "0:1", ...]
 *
 *  Write a function that takes such collection and counts the points of our team in the championship. Rules for
 *  counting points for each match:
 *
 *  if x>y - 3 points
 *  if x<y - 0 point
 *  if x=y - 1 point
 *
 *  https://www.codewars.com/kata/5bb904724c47249b10000131/train/kotlin
 */


fun main() {

    println(30 == points(listOf("1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3")))
    println(10 == points(listOf("1:1", "2:2", "3:3", "4:4", "2:2", "3:3", "4:4", "3:3", "4:4", "4:4")))
    println(0 == points(listOf("0:1", "0:2", "0:3", "0:4", "1:2", "1:3", "1:4", "2:3", "2:4", "3:4")))
    println(15 == points(listOf("1:0", "2:0", "3:0", "4:0", "2:1", "1:3", "1:4", "2:3", "2:4", "3:4")))
    println(12 == points(listOf("1:0", "2:0", "3:0", "4:4", "2:2", "3:3", "1:4", "2:3", "2:4", "3:4")))

}

fun points(games: List<String>): Int {
    var score = 0
    games.forEach {
        if (it.substring(0, 1) == it.substring(2))
            score += 1
        else if (it.substring(0, 1) > it.substring(2))
            score += 3
    }
    return score
}