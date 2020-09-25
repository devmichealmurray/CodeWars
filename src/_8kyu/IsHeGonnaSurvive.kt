package _8kyu

/**
 * Completed
 *
A hero is on his way to the castle to complete his mission. However, he's been told that the castle is surrounded
with a couple of powerful dragons! each dragon takes 2 bullets to be defeated, our hero has no idea how many bullets
he should carry. Assuming he's gonna grab a specific given number of bullets and move forward to fight another
specific given number of dragons, will he survive?

Return True if yes, False otherwise :)

https://www.codewars.com/kata/59ca8246d751df55cc00014c/train/kotlin

 */


fun main() {
    println(hero(10, 5)) // true
    println(hero(7, 4)) //false
    println(hero(4, 5)) //false
    println(hero(100, 40)) //true
    println(hero(1500, 751)) //false
    println(hero(0, 1)) //false
}


fun hero(bullets: Int, dragons: Int) : Boolean {
    return (bullets / 2 >= dragons)
}