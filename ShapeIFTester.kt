fun main() { //metoda main
    """
    var obiektcircle1=CircleIF("koło", 2.5)
    println(obiektcircle1.getPerimeter())
    println(obiektcircle1.getArea())
    obiektcircle1.details()

    var obiektsquare=SquareIF("kwadrat", 4.5)
    println(obiektsquare.getPerimeter())
    println(obiektsquare.getArea())
    obiektsquare.details()

    var obiektrectangle=RectangleIF("prostokąt", 5.0, 6.0)
    println(obiektrectangle.getPerimeter())
    println(obiektrectangle.getArea())
    obiektrectangle.details()

    var obiekttriangle=TriangleIF("trójkąt", 3.0, 4.0, 5.0)
    println(obiekttriangle.getPerimeter())
    println(obiekttriangle.getArea())
    obiekttriangle.details()
    """
    var obiektcircle1=CircleIF("koło", -2.5)
    obiektcircle1.getPerimeter()
    obiektcircle1.getArea()
    obiektcircle1.details()

    var obiektsquare=Square("kwadrat", -5.0)
    obiektsquare.getPerimeter()
    obiektsquare.getArea()
    obiektsquare.details()

    var obiektrectangle=Rectangle("prostokąt", 10.0, -5.0)
    obiektrectangle.getPerimeter()
    obiektrectangle.getArea()
    obiektrectangle.details()

    var obiekttriangle=Triangle("trójkąt", 3.0, -4.0, 5.0)
    obiekttriangle.getPerimeter()
    obiekttriangle.getArea()
    obiekttriangle.details()

}