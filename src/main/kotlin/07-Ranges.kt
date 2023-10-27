// RangesInKotlin.kt

fun main() {
    // Introduction to Ranges in Kotlin

    // A range is a sequence of numbers between a start and an end value.
    // In Kotlin, you can create a range using the ".." operator.

    // Example 1: Simple range from 1 to 5
    val oneToFive = 1..5
    println("Simple range from 1 to 5: $oneToFive")

    // You can iterate over a range using a for loop.
    for (number in oneToFive) {
        println("Number: $number")
    }

    // 🍎 Real-life example: Imagine you have 5 apples and you want to count them.
    println("🍎 Apple counting:")
    for (apple in 1..5) {
        println("Apple $apple 🍎")
    }

    // Ranges can also be used with characters.
    val aToE = 'a'..'e'
    println("\nCharacter range from a to e: $aToE")

    // 🎈 Real-life example: Imagine you have balloons with letters on them.
    println("🎈 Balloon letters:")
    for (char in aToE) {
        println("Balloon with letter: $char 🎈")
    }

    // You can also create a range that goes backwards using the `downTo` function.
    val fiveToOne = 5.downTo(1)
    println("\nCounting down from 5 to 1:")
    for (number in fiveToOne) {
        println(number)
    }

    // 🚗 Real-life example: Imagine cars in a race and they're counting down to start.
    println("🚗 Race countdown:")
    for (count in 3.downTo(1)) {
        println("🚗 $count")
    }
    println("🚗 GO!")

    // You can also specify steps in a range using the `step` function.
    val evenNumbers = 2..10 step 2
    println("\nEven numbers from 2 to 10:")
    for (number in evenNumbers) {
        println(number)
    }

    // 🍪 Real-life example: Imagine you're eating cookies every other day.
    println("🍪 Eating cookies every other day:")
    for (day in 1..5 step 2) {
        println("Day $day: 🍪")
    }

    // To check if a value is within a range, you can use the `in` keyword.
    val isThreeInRange = 3 in 1..5
    println("\nIs 3 in the range 1 to 5? $isThreeInRange")

    // 🎁 Real-life example: Checking if a birthday falls within a certain range.
    val myBirthday = 7
    val giftRange = 5..10
    if (myBirthday in giftRange) {
        println("🎁 I get a gift on day $myBirthday!")
    } else {
        println("No gift on day $myBirthday 😢")
    }
}

