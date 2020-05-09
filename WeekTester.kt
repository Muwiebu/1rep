fun main() {
    fun dzien_tygodnia(dzien: Week) {

        var wynik1 = dzien.isWeekend()
        if (wynik1 == true)
            println("$dzien jest weekendem")
        else
            println("$dzien nie jest weekendem!")

        var wynik2 = dzien.isWorkingDay()
        if (wynik2 == true)
            println("$dzien jest dniem pracującym")
        else
            println("$dzien nie jest dniem pracującym!")

    }
    dzien_tygodnia(Week.Wtorek)
    dzien_tygodnia(Week.Niedziela)
}