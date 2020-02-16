//@file:JvmName("Hello")

import java.lang.NumberFormatException
import java.math.BigInteger
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

    println(addFun1(5, 8))
    println(addFun2(3, 2))
    println(maxFun1(5, 8))
    println(maxFun2(3, 2))

    println(calAmount(50))
    println(calAmount(50, 0.03))
    println(calAmount(interest = 0.03, amt = 50))

    var str6: String = "4"
    var num11: Int = Integer.parseInt(str6)
    println(num11)
    num11 = str6.toInt()
    println(num11)

    var str7: String = "4a"
    var num12: Int = try {
        str7.toInt()
    } catch (e: NumberFormatException) {
        -1
    }
    num12++
    println(num12)

    var a1 = Alien()
    a1.skills = "Java"
    a1.show()
    var a2 = Alien()
    a2.skills = "SQL"
    a2.show()
    var a3 = a1.plus(a2)
    a3.show()

    // infix function takes one parameter
    // example of infix function - downTo, in
    var a4 = a1 plus a2
    a4.show()

    // https://kotlinlang.org/docs/reference/operator-overloading.html
    var a5 = a1 + a2
    a5.show()

    println(fact1(7))

    println(fact2(BigInteger("70")))

    println(fact3(BigInteger("70000"), BigInteger.ONE))

    var ujjwal = Human("Ujjwal")
    ujjwal.think()

    var rahul = Human2("Rahul", 22)
    rahul.think()

    val car = Car(4, 120.0)
//    val car: MotorVehicle = Car(4, 120.0)
    car.details()
    println(car.drive())

    var mayank: Person = Doctor()
    mayank.talk()
    mayank.think()

    var obj = C()
    obj.show()
    obj.display()
    obj.abc()

    var lap1 = Laptop("Lenovo", 2000)
    var lap2 = Laptop("Lenovo", 2000)
    var lap3 = Laptop("Mac", 2500)
    println(lap1)
    println(lap2)
    println(lap3)
    println(lap1 == lap2)
    println(lap1.equals(lap2))
    println(lap1 == lap3)
    var lap4 = lap3.copy()
    println(lap4)
    var lap5 = lap4.copy(price = 3000)
    println(lap5)

    BookSelf.books.add(Book("Java", 50))
    BookSelf.books.add(Book("Sql", 40))
    BookSelf.books.add(Book("Kotlin", 80))
    BookSelf.showBooks()

    var programmer: Human4 = object : Human4 {
        override fun think() {
            println("Think virtually....")
        }
    }
    programmer.think()

    D.show()

    var obj2 = E.create()
    obj2.show()

    `in`()
    System.`in`
}

fun addFun1(a: Int, b: Int): Int {
    return a + b
}

fun addFun2(a: Int, b: Int): Int = a + b

fun maxFun1(a: Int, b: Int): Int {
    return if (a > b)
        a
    else
        b
}

fun maxFun2(a: Int, b: Int): Int = if (a > b) a else b

@JvmOverloads
fun calAmount(amt: Int, interest: Double = 0.04): Int {
    return (amt + amt * interest).toInt()
}

infix operator fun Alien.plus(a: Alien): Alien {
    var newAlien = Alien()
    newAlien.skills = this.skills + " " + a.skills;
    return newAlien
}

fun fact1(num: Int): Int {
    return if (num == 0)
        1
    else
        num * fact1(num - 1)
}

fun fact2(num: BigInteger): BigInteger {
    return if (num == BigInteger.ZERO)
        BigInteger.ONE
    else
        num * fact2(num - BigInteger.ONE)
}

tailrec fun fact3(num: BigInteger, result: BigInteger): BigInteger {
    return if (num == BigInteger.ZERO)
        result
    else
        fact3(num - BigInteger.ONE, num * result)
}

//class Human public constructor(var n: String) {
//class Human constructor(var n: String) {
//class Human(var n: String = "Mr") {
class Human(var n: String) {
    var name: String = ""

    init {
        name = n
        println("Human is here...")
    }

    fun think() {
        println("Kotlin is awesome.. $name")
    }
}

class Human2(var n: String) {
    var name: String = ""
    var age: Int = 0

    constructor(name: String, age: Int) : this(name) {
        this.name = name
        this.age = age
    }

    fun think() {
        println("Kotlin is awesome.. $name : $age")
    }
}

open class MotorVehicle(val maxSpeed: Double, val horsePowers: Int) {
    init {
        println("In MotorVehicle.")
    }

    fun details() {
        println("It is MotorVehicle.")
    }

    open fun drive(): String {
        return "$horsePowers HP MotorVehicle driving at $maxSpeed MPH"
    }
}

class Car(val seatCount: Int, maxSpeed: Double) : MotorVehicle(maxSpeed, 100) {
    init {
        println("In Car.")
    }

    override fun drive(): String {
        return super.drive() + " with $seatCount seats"
    }
}

abstract class Person {
    abstract fun think()

    fun talk() {
        println("Talking...")
    }
}

class Doctor : Person() {
    override fun think() {
        println("Critical Thinking")
    }
}

interface A {
    fun show()

    fun abc() {
        println("A : abc")
    }
}

interface B {
    fun display()

    fun abc() {
        println("B : abc")
    }
}

class C : A, B {
    override fun show() {
        println("C : show of A")
    }

    override fun display() {
        println("C : display of B")
    }

    override fun abc() {
        super<B>.abc()
    }
}

/**
 * 1. Every class needs a toString()
 * 2. equals & hashCode
 * 3. copy
 */
data class Laptop(val brand: String, val price: Int) {
    fun show() {
        println("Awesome machine...")
    }
}

data class Book(var name: String, var price: Int)

object BookSelf {
    var books = arrayListOf<Book>()

    fun showBooks() {
        for (i in books)
            println(i)
    }
}

interface Human4 {
    fun think()
}

class D {
    companion object {
        @JvmStatic
        fun show() {
            println("Hello")
        }
    }
}

class E {
    companion object {
        fun create(): E = E()
    }

    fun show() {
        println("In show")
    }
}

fun `in`() {
}