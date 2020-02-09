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
}