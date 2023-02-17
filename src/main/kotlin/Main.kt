fun main() {
createAndPrint()
}
fun createAndPrint(){
    val name = "Björn"
    val person = Person2(name)

    print(person.name)
}