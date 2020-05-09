class SquareIF(override var name: String, var dlugosc_boku: Double): ShapeIF {
    override fun getPerimeter(): Double {
        return try {
            if (dlugosc_boku < 0)
                throw ArithmeticException("Długość boku kwadratu musi być większa od zera")
            4 * dlugosc_boku
        }
        catch(exception: ArithmeticException){
            println(exception.message)
            0.0
        }
    }

    override fun getArea(): Double {
        return try {
            if (dlugosc_boku < 0)
                throw ArithmeticException("Długość boku kwadratu musi być większa od zera")
            Math.pow(dlugosc_boku, 2.0)
        }
        catch(exception: ArithmeticException){
            println(exception.message)
            0.0
        }
    }

    override fun details() {
        println("Kształt figury: ${this.name}")
        if (dlugosc_boku < 0)
            println("Długość boku kwadratu musi być większa od zera")
        else {
            println("Długość boku: ${this.dlugosc_boku}")
            println("Obwód: ${this.getPerimeter()}")
            println("Pole: ${this.getArea()}")
        }
    }
}
