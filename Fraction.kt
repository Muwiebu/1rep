import kotlin.math.absoluteValue

class Fraction(m: Int) { //klasa Fraction+konstruktor domyślny z parametrem m
    var mianownik: Int=1 //pole klasy- mianownik
    var licznik: Int=m //pole klasy- licznik

    constructor(mian: Int, licz: Int) : this(licz) { //konstruktor dodatkowy z parametrami licznik i mianownik
        mianownik = mian //przypisanie mianownikownikowi wartosci mian
    }

    fun fractiontoString(): String{ //metoda fractiontoString
        return "${licznik}/${mianownik}" //zwracanie ulamka jako lancucha znakow
    }
    fun NWD():Int{ //metoda największy wspólny dzielnik (licznika i mianownika)
        var nwd: Int = 0 //zmienna nwd
        var i = 1
        while (i <= mianownik.absoluteValue && i <= licznik.absoluteValue) {
            //petla while wykonujaca az i osiagnie wartosc licznika lub mianownika
            if (mianownik % i == 0 && licznik % i == 0) //sprawdzenie czy licz i mian dzielą się bez reszty przez i
                nwd = i //dla spelnionego warunku wyżej nwd otrzymuje wartosc i
            ++i //inkrementacja
        }
        return nwd //zwrócenie zminnej nwd
    }
    fun reduce(): Fraction{ //metoda reduce
        return Fraction(mianownik/NWD(), licznik/NWD()) //zwrocenie obiektu klasy fraction z nowymi parametr
    }
    fun quot(input: Fraction): Fraction{ //metoda quot
        return Fraction(mianownik * input.licznik, licznik * input.mianownik)
        //zwrocenie obiektu klasy fraction będącego ilorazem dwoch ułamków
    }
    fun quot(input: Int): Fraction{ //metoda quot z innym parametrem wejsciowym
        return Fraction(mianownik * input, licznik)
        //zwrocenie obiektu klasy fraction będącego ilorazem ułamka i liczby całkowitej
    }
    fun NWW(input: Int):Int{ //metoda najmniejsza wspolna wielokrotnosc
        var nww:Int=0 //zmienna nww
        nww = if (mianownik > input) mianownik else input //przypisanie zmiennej nww wartosci wiekszego mianownika
        while (true) {
            if (nww % mianownik == 0 && nww % input == 0) { // jezeli reszta z dzielenia mian i licz przez nww =0
                //nastepuje przerwanie petli
                break
            }
            ++nww //inkrementacja

        }
        return nww //zwrocenie zmiennej nww
    }
    fun add(input: Fraction):Fraction{ //metoda add z parametrem reprezentujacym ulamek
        var nww:Int=NWW(input.mianownik) //nowy obiekt klasy NWW z parametrem bedącym mianownikiem ułamka
        return Fraction(nww, licznik *(nww/mianownik)+input.licznik*(nww/input.mianownik))
        //zwrocenie obiektu klasy fraction będącego sumą dwóch ułamków
    }
    fun add(input: Int):Fraction{ //metoda add z parametrem reprezentujacym liczbę całkowitą
        var nww:Int=NWW(1) ////nowy obiekt klasy NWW z parametrem bedącym mianownikiem liczby całkowitej czyli 1
        return Fraction(nww, licznik *(nww/mianownik)+input*(nww))
        //zwrocenie obiektu klasy fraction będącego sumą ułamka i liczby całkowitej
    }
    fun Inv(): Fraction{ //metoda Inv
        return Fraction(mianownik,-1*licznik)
        //zwrocenie obiektu klasy Fraction,
        // reprezentującego ułamek przeciwny do ułamka zawartego w obiekcie wywołującym metodę Inv
    }
}

fun main(args: Array<String>) { //metoda main

    var ułamek1 = Fraction(4, 2) //obiekt metody Fraction reprezentujący pierwszy ułamek
    var ułamek2 = Fraction(8, -6) //obiekt metody Fraction reprezentujący drugi ułamek
    var liczba_cał: Int = 5 //liczba całkowita
    var par_m = Fraction(7) //obiekt metody Fraction reprezentujący parametr całkowity m
    println("Ułamek pierwszy = ${ułamek1.fractiontoString()}")
    println("Ułamek drugi = ${ułamek2.fractiontoString()}")
    println("Ułamek trzeci = ${par_m.fractiontoString()}")

    println("Skrócony ułamek pierwszy = ${ułamek1.reduce().fractiontoString()}")
    println("Skrócony ułamek drugi = ${ułamek2.reduce().fractiontoString()}")
    //wyświetlenie i wywołanie metody quot z parametrem reprezentującym ułamek
    println("${ułamek2.fractiontoString()} / ${ułamek1.fractiontoString()}  = ${ułamek2.quot(ułamek1).fractiontoString()}")
    //wyświetlenie i wywołanie metody quot z parametrem reprezentującym liczbę całkowitą
    println("${ułamek2.fractiontoString()} / ${liczba_cał}  = ${ułamek2.quot(liczba_cał).fractiontoString()}")
    //wyświetlenie i wywołanie metody add z parametrem reprezentującym ułamek
    println("${ułamek2.fractiontoString()} + ${ułamek1.fractiontoString()}  = ${ułamek2.add(ułamek1).fractiontoString()}")
    //wyświetlenie i wywołanie metody add przez obiekt ułamek2 z parametrem reprezentującym liczbę całkowitą
    println("${ułamek2.fractiontoString()} + ${liczba_cał}  = ${ułamek2.add(liczba_cał).fractiontoString()}")
    //wyświetlenie i wywołanie metody Inv przez obiekt reprezentujący ułamek
    println("Odwrotność ${ułamek2.fractiontoString()} to ${ułamek2.Inv().fractiontoString()}")
}