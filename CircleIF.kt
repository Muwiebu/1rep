import kotlin.math.PI

class CircleIF(override var name: String, var radius: Double): ShapeIF {
    override fun getPerimeter(): Double {
        return try {
            if (radius < 0)
                throw ArithmeticException("Długość promienia musi być większa od zera")
            2 * PI * radius
        }
        catch(exception: ArithmeticException){
            println(exception.message)
            0.0
        }
    }

    override fun getArea(): Double {
        return try {
            if (radius < 0)
                throw ArithmeticException("Długość promienia musi być większa od zera")
            PI * Math.pow(radius, 2.0)
        }
        catch(exception: ArithmeticException){
            println(exception.message)
            0.0
        }
    }

    override fun details() {
        println("Kształt figury: ${this.name}")
        if (radius < 0)
            println("Długość promienia musi być większa od zera")
        else {
            println("Długość promienia: ${this.radius}")
            println("Obwód: ${this.getPerimeter()}")
            println("Pole: ${this.getArea()}")
        }
    }

}