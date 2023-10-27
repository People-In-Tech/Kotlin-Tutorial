// NullSafetyInKotlin.kt

fun main() {
    // Introduction to Null Safety in Kotlin

    // In many programming languages, the null reference is a common cause of runtime errors.
    // Kotlin aims to eliminate the null reference errors by making all types non-nullable by default.

    // Example 1: Declaring a non-nullable String
    // val nonNullableString: String = null  // This will cause a compile-time error

    // To declare a nullable type in Kotlin, you can use the "?" suffix.
    val nullableString: String? = null
    println("Nullable String: $nullableString")

    // 📦 Real-life example: Imagine a box that might or might not contain a toy.
    val toyBox: String? = null
    if (toyBox != null) {
        println("The box contains: $toyBox 🧸")
    } else {
        println("The box is empty 📦")
    }

    // Safe Calls using "?." operator
    // This returns the length if `nullableString` is not null, and null otherwise.
    val length: Int? = nullableString?.length
    println("\nLength of nullable string: $length")

    // 📏 Real-life example: Measuring the length of a rope, but the rope might be missing.
    val rope: String? = null
    val ropeLength: Int? = rope?.length
    if (ropeLength != null) {
        println("The rope is $ropeLength meters long 📏")
    } else {
        println("There's no rope to measure 🤷")
    }

    // The Elvis Operator "?:"
    // If the expression to the left of "?:" is not null, it returns it, otherwise it returns the expression to the right.
    val name: String? = null
    val safeName: String = name ?: "Unknown"
    println("\nName is: $safeName")

    // 🤖 Real-life example: A robot trying to identify a person, but the person might be unknown.
    val person: String? = null
    val personName: String = person ?: "Unknown person"
    println("Hello, $personName 🤖")

    // The "!!" operator
    // This converts any value to a non-nullable type and throws an exception if the value is null.
    // Use this with caution!
    // val unsafeName: String = name!!  // This will throw a KotlinNullPointerException

    // 🎈 Real-life example: Insisting that a balloon is in a box, even if it might not be.
    val balloonBox: String? = null
    // val balloon: String = balloonBox!!  // This will pop! 💥
    // println("Here's the balloon: $balloon 🎈")

    // Safe casting using "as?"
    // This tries to cast the type and returns null if the casting is unsuccessful.
    val anyType: Any = "Hello"
    val castedString: String? = anyType as? String
    val castedInt: Int? = anyType as? Int
    println("\nCasted as String: $castedString")
    println("Casted as Int: $castedInt")

    // 🎭 Real-life example: Trying on different masks, but not all of them fit.
    val mask: Any = "Clown"
    val clownMask: String? = mask as? String
    val superheroMask: Int? = mask as? Int
    println("Is it a clown mask? $clownMask 🤡")
    println("Is it a superhero mask? $superheroMask 🦸")
}

