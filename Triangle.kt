import kotlin.math.sqrt

class Triangle(name: String, var dlugosc_boku1: Double, var dlugosc_boku2: Double, var dlugosc_boku3: Double): Shape(name)  {

    override fun getPerimeter(): Double {
        return try {
            if (dlugosc_boku1 < 0 || dlugosc_boku2 < 0 || dlugosc_boku3 < 0 || (dlugosc_boku1>=dlugosc_boku2+
                        dlugosc_boku3) || (dlugosc_boku2>=dlugosc_boku3+dlugosc_boku1) || (dlugosc_boku3>=dlugosc_boku1
                        +dlugosc_boku2))
                throw ArithmeticException("Nieodpowiednie długości boków trójkąta")
            dlugosc_boku1+dlugosc_boku2+dlugosc_boku3
        }
        catch(exception: ArithmeticException){
            println(exception.message)
            0.0
        }
    }

    override fun getArea(): Double {
        var polowa_obwodu=0.5*(getPerimeter())
        return try {
            if (dlugosc_boku1 < 0 || dlugosc_boku2 < 0 || dlugosc_boku3 < 0 || (dlugosc_boku1>=dlugosc_boku2+
                        dlugosc_boku3) || (dlugosc_boku2>=dlugosc_boku3+dlugosc_boku1) || (dlugosc_boku3>=dlugosc_boku1
                        +dlugosc_boku2))
                throw ArithmeticException("Nieodpowiednie długości boków trójkąta")
            sqrt(polowa_obwodu*(polowa_obwodu-dlugosc_boku1)*(polowa_obwodu-dlugosc_boku2)
                    *(polowa_obwodu-dlugosc_boku3))
        }
        catch(exception: ArithmeticException){
            println(exception.message)
            0.0
        }
    }

    override fun details() {
        println("Kształt figury: ${this.name}")
        if (dlugosc_boku1 < 0 || dlugosc_boku2 < 0 || dlugosc_boku3 < 0 || (dlugosc_boku1>=dlugosc_boku2+
                    dlugosc_boku3) || (dlugosc_boku2>=dlugosc_boku3+dlugosc_boku1) || (dlugosc_boku3>=dlugosc_boku1
                    +dlugosc_boku2))
            println(("Nieodpowiednie długości boków trójkąta"))
        else {
            println("Długość boku 1: ${this.dlugosc_boku1}")
            println("Długość boku 2: ${this.dlugosc_boku2}")
            println("Długość boku 3: ${this.dlugosc_boku3}")
            println("Obwód: ${this.getPerimeter()}")
            println("Pole: ${this.getArea()}")
        }
    }
}