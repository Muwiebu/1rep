fun main(args: Array<String>) {
val defaultPerson=Person()
    println(defaultPerson.name)
    println(defaultPerson.age)
    println(defaultPerson.study.fieldofstudy)

    defaultPerson.study.changefieldofstudy("INF")
    println(defaultPerson.study.fieldofstudy)
    //val newPerson=Person(1993, "Paweł")

    //newPerson.changeName("Tomasz")
}