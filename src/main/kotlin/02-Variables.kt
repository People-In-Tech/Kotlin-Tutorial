// 🌟 Here's our 'const val' declaration:
// 'const val' is declared at the top level of the file.
const val NAME = "KOTLIN"

fun main() {
    // 📘 In Kotlin, there are two main ways to declare variables: using 'val' and 'var'.

    // --- Using 'val' ---
    // 🚫 'val' stands for 'value'. Once you assign a value to a 'val', you can't change it.
    // Think of it like a constant or something that's set in stone.
    val myName: String = "Alice"
    // myName = "Bob" // ❌ This would cause an error because you can't change a 'val'.

    // --- Using 'var' ---
    // ✅ 'var' stands for 'variable'. It's something that can vary or change.
    // You can assign a value to it, and then change that value later on.
    var myAge = 25 // 🧐 Notice how we didn't mention it's an 'Int'? Kotlin is smart and guesses the type for us!
    myAge = 26 // 🔄 This is perfectly fine since 'myAge' is a 'var'.

    // 🌟 Now, let's see some other cool things about variables in Kotlin.

    // 1️⃣ Type inference:
    // Kotlin can often guess the type of a variable from its value.
    var favoriteColor = "Blue" // 🎨 Kotlin knows this is a String.

    // 2️⃣ Deferred assignment:
    // Sometimes, you might want to declare a variable now and assign a value to it later.
    // This is called 'deferred assignment'.
    var myPet: String
    myPet = "Dog" // 🐶 Now, we give 'myPet' a value.

    // 🎤 Let's talk about 'const val':
    println("The NAME constant is: $NAME")

// That's the end of our lesson on 'val', 'var' and 'const val' in Kotlin! 🎉
// Try playing around with the values and see the results. Happy Coding! ✨
}
