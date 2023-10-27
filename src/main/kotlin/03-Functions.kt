fun main() {
    // 🌟 Let's explore different types of functions in Kotlin!

    // 1️⃣ A simple function that returns a value.
    println("⭐️ My sum function ➡️ ${sum(1, 2)} ⭐️")

    // 2️⃣ A function using the shorthand syntax.
    println("🎉 My mul function ➡️ ${mul(1, 2)} 🎉")

    // 3️⃣ A function that prints directly with some fancy emojis.
    printMulWithEmoji(1, 2)

    // 4️⃣ Using the mul function and then printing its result.
    println("🚀 Result of printMul ➡️ ${mul(1, 2)} 🚀")

    // 5️⃣ A function with default parameters. Here, 'a' has a default value.
    println("🎯 Result of printMul1 ➡️ ${printMul1(b = 2)} 🎯")

    // 6️⃣ A function with default parameters. Here, 'b' has a default value.
    println("✨ Result of printMul2 ➡️ ${printMul2(a = 2)} ✨")
}

// This function takes two integers and returns their sum.
fun sum(a: Int, b: Int): Int {
    return a + b
}

// Shorthand syntax for defining a function. Multiplies two numbers and returns the result.
fun mul(a: Int, b: Int) = a * b

// This function prints the multiplication result in a fancy way with emojis. 😎
fun printMulWithEmoji(a: Int, b: Int) {
    println("🔥 Multiplying $a and $b gives: ${a * b} 🔥")
}

// A function that uses 'mul' to compute the product and then directly prints the result.
fun printMul(a: Int, b: Int): Unit {
    println(mul(a, b))
}

// A function with default parameters. The default value for 'a' is 0.
fun printMul1(a: Int = 0, b: Int) = a * b

// Another function with default parameters. The default value for 'b' is 0.
fun printMul2(a: Int, b: Int = 0) = a * b
