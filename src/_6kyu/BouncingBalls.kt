package _6kyu

/**
 * A child is playing with a ball on the nth floor of a tall building. The height of
 * this floor, h, is known.  He drops the ball out of the window. The ball bounces
 * (for example), to two-thirds of its height (a bounce of 0.66). His mother looks
 * out of a window 1.5 meters from the ground. How many times will the mother see
 * the ball pass in front of her window (including when it's falling and bouncing?)
 */


fun main() {
    val firstTest = bouncingBall(3.0, 0.66, 1.5)
    val secondTest = bouncingBall(30.0, 0.66, 1.5)
    correctAnswer(firstTest, secondTest)

}

fun bouncingBall(h: Double, bounce: Double, window: Double): Int {
    var answer = 1
    var dropHeight = h
    val bounceHeight = dropHeight * bounce
    val willSee = window <= bounceHeight

    println("This is original height: $dropHeight")



    println("New Height: $dropHeight")

    return answer
}


fun correctAnswer(test1: Int, test2: Int) {
    if (test1 == 3 && test2 == 15) {
        println("Correct")
    } else {
        println("Incorrect")
    }
}


