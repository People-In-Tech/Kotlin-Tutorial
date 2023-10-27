fun main() {
    // 🌟 CONDITIONALS 🌟
    // In Kotlin (and many other programming languages like Java), conditionals are the way
    // to make decisions in code based on whether something is true or false.

    // 🌟 AND (&&) 🌟
    // Both conditions must be TRUE for the entire expression to be true.
    // Think of it like needing both a key AND a password to open a safe.
    val hasKey = true
    val knowsPassword = true

    if (hasKey && knowsPassword) {
        println("Safe opened! 💰")
    } else {
        println("Access denied! 🔒")
    }

    // 🌟 OR (||) 🌟
    // If ANY of the conditions is TRUE, the entire expression is true.
    // Think of it as entering a club if you're either on the guest list OR you have a VIP pass.
    val onGuestList = false
    val hasVipPass = true

    if (onGuestList || hasVipPass) {
        println("Welcome to the club! 🎉")
    } else {
        println("Sorry, you can't enter. 🚫")
    }

    // 🌟 AND (&&) vs. AND in Kotlin & Java 🌟
    // In Kotlin, '&&' is used just like in Java. There isn't a big difference in behavior.
    // However, Kotlin also has 'and' which is a bitwise operator and works on bits rather than logical values.

    // 🌟 OR (||) vs. OR in Kotlin & Java 🌟
    // In Kotlin, '||' is used just like in Java. Again, no major difference in behavior.
    // However, Kotlin also has 'or' which is a bitwise operator and works on bits rather than logical values.
}
