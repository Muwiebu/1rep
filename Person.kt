//class Person { //konstruktor domyślny
//}

//class Person constructor(_name: String){ //konstruktor główny z jednym argumentem
//    val name:String
//    init {
//        name=_name
//    }
//}

//class Person (_name:String){
//    val name=_name
//}

class Person (var name:String="defaultName", var age: Int=0) { //klasa person, pole name typu string
    var study=Study("PWR", "iB")
    constructor(name:String): this(name, 0)
    constructor(yearOfBirth: Int, name: String): this(name, 2020- yearOfBirth)

    fun changeName(newName: String){
        this.name=newName
    }

    fun addAge(person2: Person): Int{
        var age1=this.age
        var age2=person2.age

        return age1+age2
    }
}