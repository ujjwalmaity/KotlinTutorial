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
}