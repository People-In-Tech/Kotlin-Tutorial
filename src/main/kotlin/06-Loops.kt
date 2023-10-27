fun main() {
    // 🌟 LOOPS IN KOTLIN 🌟

    // 🌀 WHILE LOOP 🌀
    // Imagine you have a jar of cookies 🍪. You'll continue taking cookies until the jar is empty.
    var cookiesInJar = 5
    while (cookiesInJar > 0) {
        println("Took a cookie! 🍪")
        cookiesInJar--
    }
    println("Oh no, the jar is empty! 😢")

    // 🌀 DO-WHILE LOOP 🌀
    // It's like the while loop, but you'll always take at least one cookie, even if the jar was initially empty.
    cookiesInJar = 5
    do {
        println("Took a cookie again! 🍪")
        cookiesInJar--
    } while (cookiesInJar > 0)
    println("The jar is empty again! 😢")

    // 🌀 FOR LOOP 🌀
    // Imagine you're giving high-fives to a line of people. 🙏
    val numberOfPeople = 5
    for (person in 1..numberOfPeople) {
        println("High-five to person $person! 🙏")
    }

    // 🌀 FOR LOOP WITH STEP 🌀
    // You decide to skip one person and give a high-five to every second person.
    for (person in 1..numberOfPeople step 2) {
        println("High-five to every second person: person $person! 🙏✌️")
    }

    // 🌀 FOR LOOP WITH DOWNTO 🌀
    // You decide to give high-fives from the last person to the first.
    for (person in numberOfPeople downTo 1) {
        println("Reverse high-five to person $person! 🙏🔄")
    }

    // 🌀 FOR LOOP WITH INDICES 🌀
    // You have a list of fruits 🍎🍊🍌. You want to list them with their position.
    val fruits = listOf("apple", "orange", "banana")
    for (index in fruits.indices) {
        println("Fruit at position $index is ${fruits[index]} 🍎🍊🍌")
    }
}
