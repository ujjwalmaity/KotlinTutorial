import java.util.*

fun main(args: Array<String>) {
    print("Hello World!")

    val name = Name()
    name.firstName = "UJJWAL"
    print("\n" + name.firstName)
    println(" ${name.lastName}")

    val nameInJava = NameInJava()
    nameInJava.firstName = "RAHUL"
    nameInJava.lastName = "MAITY"
    println("${nameInJava.firstName} ${nameInJava.lastName}")

    val num1: Int = 10
    val num2 = 2
    val sum = num1 + num2
    println(sum)
    val sub = num1 - num2
    println("$sub")
    println(num1 * num2)
    val div = num1 / num2
    println("$num1 / $num2 = $div")

    var num3: Int = 5
    var num4: Int = 10
    var result: Int = 0
    if (num3 > num4)
        result = num3
    else if (num4 > num3)
        result = num4
    println(result)
    result = if (num3 > num4)
        num3
    else if (num4 > num3)
        num4
    else
        0
    println(result)
    result = when {
        num3 > num4 -> num3
        num4 > num3 -> num4
        else -> 0
    }
    println(result)

    var str1: String = "Ujjwal"
    var str2 = "ujjwal"
    if (str1.equals(str2))
        println("Same")
    else
        println("Not Same")
    if (str1 == str2)
        println("Same")
    else
        println("Not Same")
    if (str1.equals(str2, true))
        println("Same")
    else
        println("Not Same")

    var str3 = null
    println(str3)
    var str4: Nothing? = null
    println(str4)
    var str5: String? = null
    println(str5)
    var name1 = Name();
    println(name1.gender)
    println(name1.gender?.length)
    var name2: Name? = Name()
    name2 = null
    println(name2?.gender)
    println(name2?.gender?.length)

    var num5 = 2
    when (num5) {
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
        else -> println("Give a proper input")
    }
    var msg = when (num5) {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        else -> "Give a proper input"
    }
    println(msg)

    var num6 = 0
    while (num6 < 10) {
        print("$num6 \t")
        num6++
    }
    println()
    num6 = -1
    do {
        num6++
        if (num6 == 10) {
            println("b")
            break
        }
        if (num6 % 2 != 0) {
            print("c \t")
            continue
        }
        print("$num6 \t")
    } while (num6 < 15)

    var num7 = 1..16
    for (a in num7)
        print("$a \t")
    println()
    for (a in num7 step 2)
        print("$a \t")
    println()
    var num8 = 16 downTo 1
    for (a in num8)
        print("$a \t")
    println()
    num8 = 10.downTo(0)
    println(num8.count())
    var num9 = 1 until 11
    for (a in num9)
        print("$a \t")
    println()
    for (a in num9.reversed())
        print("$a \t")
    println()
    var char1 = 'A'..'z'
    for (a in char1)
        print("$a \t")
    println()
    print("Prime No: ")
    outer@ for (n in 2..15) {
        for (d in 2 until n) {
            if (n % d == 0) continue@outer
        }
        print("$n \t")
    }
    println()

    var num10 = listOf(1, 2, 3, 4)
    for (i in num10)
        print("$i \t")
    println()
    for ((i, e) in num10.withIndex())
        print("$i : $e\t")
    println()
    var map = TreeMap<String, Int>()
    map["ujjwal"] = 22
    map["rahul"] = 23
    for ((n, a) in map)
        print("$n = $a \t")
    println()
}