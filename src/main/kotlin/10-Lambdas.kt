// LambdasInKotlin.kt

fun main() {
    // Introduction to Lambdas in Kotlin

    // A lambda is a function without a name that can be treated as a value.
    // In Kotlin, the syntax for lambda is: { arguments -> body }

    // Example 1: Simple lambda with no arguments
    val sayHello = { println("Hello from Lambda!") }
    sayHello()

    // 🐱 Real-life example: A cat greeting.
    val catGreeting = { println("Meow! 🐱") }
    catGreeting()

    // Example 2: Lambda with arguments
    val multiply = { a: Int, b: Int -> a * b }
    println("\n6 * 7 = ${multiply(6, 7)}")

    // 📚 Real-life example: Counting pages in books.
    val countPages = { chapters: Int, pagesPerChapter: Int -> chapters * pagesPerChapter }
    println("Total pages in a book: ${countPages(10, 15)} 📚")

    // Example 3: Using lambdas as function parameters
    fun travel(destination: String, modeOfTravel: (String) -> String): String {
        return modeOfTravel(destination)
    }

    val byTrain = { place: String -> "Traveling to $place by train 🚂" }
    println("\n${travel("Paris", byTrain)}")

    // 🌲 Real-life example: Choosing a path in a forest.
    fun choosePath(type: String, pathChooser: (String) -> String) {
        println(pathChooser(type))
    }

    val rockyPath = { type: String -> "Taking the $type path with rocks 🌲🪨" }
    choosePath("mountain", rockyPath)

    // Example 4: Lambdas with the `it` keyword
    // If a lambda has only one parameter, you can refer to it using the `it` keyword.
    val doubleIt = { number: Int -> number * 2 }
//    val doubleItWithIt = { it * 2 }
    println("\nDouble of 5: ${doubleIt(5)}")
//    println("Double of 5 using 'it': ${doubleItWithIt(5)}")

    // 🎵 Real-life example: Adjusting volume of a song.
    val adjustVolume = { volume: Int -> "Setting volume to ${volume * 2} 🎵" }
//    val adjustWithIt = { "Setting volume to ${it * 2} 🎵" }
    println(adjustVolume(5))
//    println(adjustWithIt(5))

    // Example 5: Using lambdas with collections
    val animals = listOf("cat", "dog", "elephant", "lion", "tiger")
    val bigAnimals = animals.filter { it.length > 3 }
    println("\nBig animals: $bigAnimals")

    // 🍕 Real-life example: Choosing pizza toppings.
    val toppings = listOf("pepperoni", "mushroom", "pineapple", "cheese")
    val preferredToppings = toppings.filter { it != "pineapple" }
    println("Preferred pizza toppings: $preferredToppings 🍕")
}

