// ElvisOperatorInKotlin.kt

fun main() {
    // Introduction to the Elvis Operator in Kotlin

    // The Elvis operator (?:) is used to return the expression on its left if it's not null,
    // and the expression on its right otherwise.

    // Example 1: Basic usage of the Elvis operator
    val name: String? = null
    val safeName: String = name ?: "Default Name"
    println("Name is: $safeName")

    // 🍔 Real-life example: Ordering a burger with an optional topping.
    val topping: String? = null
    val burgerTopping: String = topping ?: "Cheese"
    println("Your burger with $burgerTopping topping is ready! 🍔")

    // Example 2: Using Elvis operator with functions
    fun getLength(str: String?): Int {
        return str?.length ?: 0
    }

    println("\nLength of 'Hello': ${getLength("Hello")}")
    println("Length of null: ${getLength(null)}")

    // 📦 Real-life example: Measuring the size of a package, but the package might be missing.
    fun getPackageSize(pkg: String?): Int {
        return pkg?.length ?: 0
    }

    val package1: String? = "BigBox"
    val package2: String? = null
    println("Size of package1: ${getPackageSize(package1)} 📦")
    println("Size of package2: ${getPackageSize(package2)} 📦")

    // Example 3: Chaining with the Elvis operator
    val listWithNulls: List<String?> = listOf("Kotlin", null, "Java", null)
    for (item in listWithNulls) {
        val value = item ?: continue
        println(value)
    }

    // 🌍 Real-life example: Traveling to cities, but some destinations might be unknown.
    val destinations: List<String?> = listOf("Paris", null, "London", null)
    println("\nTravel itinerary:")
    for (city in destinations) {
        val destination = city ?: "Unknown"
        println("Next stop: $destination 🌍")
    }
}

