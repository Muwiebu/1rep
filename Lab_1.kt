import java.util.*

fun main(args:Array<String>) {  //Utworzenie funkcji main
    /*ZAD 1a
    for (i in 1..13 step 3) { //Utworzenie pętli for wybierającej liczby od jeden do 13 z krokiem 3
        println(i) //Wyświetlenie wybranych liczb za pomocą polecenia println
    }
     */
    /*ZAD 1b
    var j=32 //Utworzenie zmiennej o początkowej wartosci wyświetlanej w konsoli
    for (i in 1..5){ //Utworzenie pętli for wykonującej się 5 razy
    println(j) //Wyświetlenie wartości początkowej w konsoli
    j=j/2 //Podzielenie wartości poprzednie wyświetlanej przez 2
    }
    */
    /*ZAD 2
    for (i in 1..5) { //Utworzenie pętli for wykonującej się 5 razy
        var tablica = IntArray(i, { i -> i + 1 }) // Utworzenie tablicy przechowującej zmienne typu int, zwiększające się o 1
        println(Arrays.toString(tablica)) //Wyświetlenie tablicy
    }
    */
    /*ZAD 3
    println("Podaj liczbę do obliczenia silni") //Wyświetlenie w konsoli polecenia dla użytkownika
    var Liczba = readLine()!!.toLong() //Pobranie z konsoli odpowiedzi użytkownika
    var Suma: Long = 1 // Stworzenie zmiennej typu long o wartości 1, będącej 1 wyrazem silni
    for (i in 1..Liczba) { //Utworzenie pętli wykonującej się ilość razy podaną przez użytkownika
        Suma = Suma * i // Mnożenie kolejnych wyrazó silni
    }
    println("Silnia $Liczba ! równa się $Suma") //Wyświetlenie wartosci silni
*/
    /*ZAD 4a
    var i = 10 //Utworzenie poczatkowej zmiennej i o wartości 10
    while (i < 21) { //Wykonanie pętli while wykonującej sie aż i osiągnie wartość 20
        println(i) // Wyświetlenie wartości zmiennej i
        i++ //inkrementacja
    }
*/
    /*ZAD 4b
    var i=10 //Wykonanie zmiennej początkowej o wartości 10
    while(i<41) { //Wykonanie pętli while wykonującej się aż zmienna i osiągnie wartosc 40
        val Reszta = (i).rem(2) //Obliczenie stałej Reszta przechowującej resztę z dzielenia zmiennej i przez 2
        if (Reszta> 0){ // wykonanie pętli if sprawdzającej czy wartość stałej reszta jest większa od zera
            println(i) //wyświetlenie zmiennej i
            i++ //inkrementacja
        }
        else{ //jeśli pętla if nie wykonuje się oznacza to, że dzielenie odbywa się bez reszty, liczba jest parzysta
            i++ //inkrementacja
        }
    }
*/
    /*ZAD 5
    var i = 65; //Wykonanie zmiennej początkowej o wartosci 65, odpowiadającej literze A
    var j = 97 // Wykonanie zmiennej poczatkowej o wartosci 97, odpowiadającej literze a
    while (i < 91) { // Wykonanie pętli while wykonującej się aż zmienna i osiągnie wartość 90, odpowiadającej literze Z
        println(i.toChar() + " " + j.toChar()) // Wyświetlenie dużej i małej litery alfabetu za pomocą polecenia toChar zamieniającego liczbę na znak
        i++ //inkrementacja
        j++ //inkrementacja
    }

    i = 65 // przypisanie ponowne zmiennym i i j wartości początkowych
    j = 97
    do { //wykonanie pętli do while
        println(i.toChar() + " " + j.toChar()) // Wyświetlenie dużej i małej litery alfabetu za pomocą polecenia toChar zamieniającego liczbę na znak
        i++ //inkrementacja
        j++ //inkrementacja

    } while (i < 91) //pętla wykona się conajmniej raz i będzie się wykonywać aż zmienna i osiągnie wartość 90

*/
    /* ZAD 6
    println("Podaj maksymalną liczbę punktów, jaką można uzyskać z listy") //wyświetlenie komuniaktu z zapytaniem o max liczbę punktów
    val MaxLiczbaPunktow= readLine()!!.toLong() //Pobranie odpowiedzi użytkownika z konsoli

    println("Podaj liczbę uzyskanych punktów") //wyświetlenie komuniaktu z zapytaniem o uzyskaną liczbę punktów
    var Punkty= readLine()!!.toLong() //Pobranie odpowiedzi użytkownika z konsoli

    var Procenty= (Punkty*100)/ MaxLiczbaPunktow //Obliczenie procentowej ilości uzyskanych punktów

    if (Procenty>=91 && Procenty<=100){ //wykonanie pętli else if zwracającej uzyskaną ocenę
        println("Uzyskano ocenę 5.0")
    }
    else if (Procenty>=81 && Procenty<=90){
        println("Uzyskano ocenę 4.5")
    }
    else if (Procenty>=71 && Procenty<=80){
        println("Uzyskano ocenę 4.0")
    }
    else if (Procenty>=61 && Procenty<=70){
        println("Uzyskano ocenę 3.5")
    }
    else if (Procenty>=51 && Procenty<=60){
        println("Uzyskano ocenę 3.0")
    }
    else if (Procenty>=0 && Procenty<=50){
        println("Uzyskano ocenę 2.0")
    }
    else{ // przy podaniu nieprawidłowej ilości punktów wyświetli się odpowiedni komunikat
        println("Podano niepoprawną ilość punktów")
    }
    */
}