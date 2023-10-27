fun main() {
    // 🌟 IF-ELSE EXPRESSION 🌟
    val weather = "sunny"
    var activity: String

    // 🌤 Traditional if-else
    // Think of it as deciding what to wear based on the weather.
    if (weather == "sunny") {
        activity = "Let's go to the beach! 🏖"
    } else {
        activity = "Let's stay indoors and read a book. 📖"
    }
    println(activity)

    // ☀️ If as an expression
    // Imagine choosing an umbrella color based on the weather.
    val umbrella = if (weather == "rainy") "Take a blue umbrella! ☔" else "No need for an umbrella. 🌂"
    println(umbrella)

    // 🌟 WHEN EXPRESSION 🌟

    // 🍦 Traditional when
    // Think of it as choosing an ice cream flavor based on your mood.
    val mood = "happy"
    when (mood) {
        "happy" -> println("I'll have vanilla! 🍨")
        "sad" -> println("I'll have chocolate. 🍫")
        else -> println("Surprise me! 🍦")
    }

    // 🍩 When as an expression
    // Imagine picking a donut flavor based on the day of the week.
    val dayOfWeek = "Monday"
    val donut = when (dayOfWeek) {
        "Monday" -> "Start the week with a chocolate donut! 🍩"
        "Friday" -> "Celebrate with a strawberry donut! 🍓"
        else -> "Any donut will do! 🍩"
    }
    println(donut)

    // 🚦 Checking multiple conditions in when
    // Think of it as a traffic light.
    val lightColor = "red"
    when {
        lightColor == "green" -> println("Go! 🚗")
        lightColor == "yellow" -> println("Slow down! ⚠️")
        else -> println("Stop! 🛑")
    }

}
