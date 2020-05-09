class RectangleIF(override var name: String, var dlugosc_boku1: Double, var dlugosc_boku2: Double): ShapeIF {
    override fun getPerimeter(): Double {

        return try {
            if (dlugosc_boku1 < 0 || dlugosc_boku2 < 0)
                throw ArithmeticException("Długość boków prostokąta musi być większa od zera")
            (2* dlugosc_boku1)+(2*dlugosc_boku2)
        }
        catch(exception: ArithmeticException){
            println(exception.message)
            0.0
        }
    }

    override fun getArea(): Double {
        return try {
            if (dlugosc_boku1 < 0 || dlugosc_boku2 < 0)
                throw ArithmeticException("Długość boków prostokąta musi być większa od zera")
            dlugosc_boku1*dlugosc_boku2
        }
        catch(exception: ArithmeticException){
            println(exception.message)
            0.0
        }
    }

    override fun details() {
        println("Kształt figury: ${this.name}")
        if (dlugosc_boku1 < 0 || dlugosc_boku2 < 0)
            println("Długość boków prostokąta musi być większa od zera")
        else {
            println("Długość boku 1: ${this.dlugosc_boku1}")
            println("Długość boku 2: ${this.dlugosc_boku2}")
            println("Obwód: ${this.getPerimeter()}")
            println("Pole: ${this.getArea()}")
        }
    }
}