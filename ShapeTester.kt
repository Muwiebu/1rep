fun main() { //metoda main

    var obiektcircle=Circle("koło", 5.0)
    println(obiektcircle.getPerimeter())
    println(obiektcircle.getArea())
    obiektcircle.details()

    var obiektcircle1=Circle("koło", -3.0)
    obiektcircle1.getPerimeter()
    obiektcircle1.getArea()
    obiektcircle1.details()

    var obiektsquare=Square("kwadrat", 5.0)
    println(obiektsquare.getPerimeter())
    println(obiektsquare.getArea())
    obiektsquare.details()
    var obiektrectangle=Rectangle("prostokąt", 3.0, 5.0)
    println(obiektrectangle.getPerimeter())
    println(obiektrectangle.getArea())
    obiektrectangle.details()
    var obiekttriangle=Triangle("trójkąt", 3.0, 4.0, 5.0)
    println(obiekttriangle.getPerimeter())
    println(obiekttriangle.getArea())
    obiekttriangle.details()

}