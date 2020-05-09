import java.util.*
import kotlin.collections.ArrayList

/*Zad_1
fun palindrome(wejscie: String){ // metoda palindrome
    var helper=true //pomocna zmienna helper
for(i in 0..wejscie.length-1){ //pętla porównująca pierwszy znak z ostatnim, potem drugi z przedostatnim itd
    if(wejscie[i]!==wejscie[wejscie.length-(i+1)]){
        helper=false //przy braku zgodności pomocnicza zmienna zmienia się z true na false
    }
}
    if(helper==true){ //wyświetlenie odpowiedniego komunikatu w zależności od wartości zmiennej helper
        println("Podany wyraz jest palindromem")
    }
    else{
        println("Podany wyraz nie jest palindromem")
    }
}
fun main(args: Array<String>) { //funkcja main
    println("Prosze podać ciąg znaków do detererminacji czy jest palindromem") //komunikat
    var wejscie= readLine().toString() //pobranie argumentu wejściowego od użytkownika
    if (wejscie.length==0){ //w razie nie podania argumentu użytkownik otrzyma komunikat
        print("Nie podałeś żadnego ciągu znaków!")
    }
    else { //wywołanie metody palindrome
        palindrome(wejscie)
    }
}
*/
/*Zad_2
fun bracketsCount(wyrazenie: String): Int { // metoda bracketsCount
    var licz_otwarty = 0 //zmienne przechowujące liczbę otwartych i zamniętych nawiasów
    var licz_zamkniety = 0
    for (i in 0..wyrazenie.length - 1) { // pętla porównująca znaki wyrażenia do znaków '(' i ')'
        if (wyrazenie[i] == '(') {
            licz_otwarty += 1 //inkrementacja zmiennej
        }
        if (wyrazenie[i] == ')') {
            licz_zamkniety += 1
        }
        if (licz_zamkniety > licz_otwarty) { //dana pętla sprawdza poprawną kolejność występowania nawiasów
            return 2
        }
    }
    if (licz_otwarty == 0 && licz_zamkniety == 0) { // w razie braku nawiasów=komunikat
        return 0
    }
    if (licz_otwarty == licz_zamkniety) { //zgodnosc obu zmiennych oznacza poprawne sparowanie
        return 1
    }
    else {
        return 2 //brak zgodnosci=brak poprawnego sparowania
    }
}

fun main(args: Array<String>) { //metoda main
    var helper=true //pomocnicza zmienna helper
    println("Proszę podać wyrażenie arytmetyczne") //polecenie dla uzytkownika
    var wyrazenie = readLine().toString() //odczytanie znakow z klawiatury
    for (i in 0..wyrazenie.length - 1) { // sprawdzenie czy podane wyrażenie zawiera spację
        if (wyrazenie[i] == ' ') {
            helper=false //zmiana wartości pomocniczej zmiennej
        }
    }
    if (helper==false){ //w razie nie podania jednego ciągu znaków=komunikat
        println("Należy podać jeden ciąg znaków, bez spacji!")
    }
    else if (wyrazenie.length == 0) { //w razie nie podania żadnego argumentu użytkownik otrzyma komunikat
        println("Nie podałeś żadnego wyrażenia!")
    }
    else {
        var wynik=bracketsCount(wyrazenie) //przypisanie zmiennej 'wynik' wartości zwróconej przez metodę bracketsCount
        if(wynik==0){ //jeżeli wynik równa się 0 podany przez użytkownika ciąg znaków nie zawierał żadnych nawiasów
            println("Wyrażenie nie zawiera żadnych nawiasów")
        }
        else if (wynik==1){ //jeżeli wynik równa się 1 to nawiasy są poprawnie sparowane
            println("Nawiasy są poprawnie sparowane")
        }
        else{ //jeżeli wynik równa się 2 to nawiasy są niepoprawnie sparowane
            println("Nawiasy nie są poprawnie sparowane")
        }
    }

}

 */
/*Zad_3
fun CaesarCode(ciag: String, n: Int){ //metoda CaesarCode
    var ciag_zaszyfr: String="" //zmienna która będzie przechowywać zaszyfrowany tekst
    var tablica= arrayOf('A', 'B', 'C','D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', //tablica przechowująca alfabet
    'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z')
    for(k in 0..ciag.length-1) { //pętla zewnętrzna for zmieniająca kolejne znaki w ciągu podanym przez użytkownika
        for (i in 0..tablica.size - 1) { //pętla wewnętrzna for zmieniająca kolejne wyrazy tablicy przechowującej alfabet
            if (ciag[k] == tablica[i]) { //porównanie znaku z elementem tablicy
                ciag_zaszyfr +=tablica[(i+n).rem(tablica.size)] //zapisywanie do stringa ciag_zaszyfr kolejnych zaszyfrowanych liter za pomocą funkcji modulo
                //reszta z dzielenia sumy elementu tablicy i parametru n przez rozmiar tablicy zwraca element tablicy przechowujący zaszyfrowaną literkę
            }
        }
    }
    print("Zaszyfrowany tekst: \n${ciag_zaszyfr.toString()}") //wyśietlenie szyfru
}
fun main(args: Array<String>) { //funkcja main
    println("Proszę podać parametr n") //prosba o podanie parametru n
    var n= readLine()!!.toInt() //pobranie parametru n od użytkownika
    println("Proszę podać ciąg tekstowy skłądający się z dużych liter") //prosba o podanie ciagu tekstowego
    var ciag= readLine().toString() //pobranie argumentu wejściowego od użytkownika
    if (ciag.length==0){ //w razie nie podania argumentu użytkownik otrzyma komunikat
        print("Nie podałeś żadnego ciągu tekstowego!")
    }
    else { //wywołanie metody CaesarCode
        CaesarCode(ciag, n)
    }
}

 */
/*Zad_4
fun baseToExp(base: Int, exp: Int ): Int{ //metoda baseToExp
    var wynik=1 //pomocnicza zmienna wynik o wartości początkowej 1
    for (i in 1..exp){ //pętla wykonująca mnożenie przez siebie wartości base exp razy
        wynik=wynik*base
    }
    println("$base ^ $exp =") //wyświetlenie wyniku
    return wynik
}

fun isNumber(input: String): Boolean{ //metoda isNumber sprawdzająca czy wartości podane przez użytkownika są intami
    for(i in 0..input.length-1) //pętla bada każdy znak ciągu przekazanaego przez użytkownika
        if(!input[i].isDigit()) //jeśli dany znak nie jest liczbą metoda zwraca false
            return false
    return true //jesli kazdy znak jest liczbą metoda zwraca true
}

fun main(args: Array<String>) { //metoda main
    println("Podaj podstawę potęgi") //pytanie użytkownika o wartość podstawy potęgi
    val base: String= readLine()!! //zapisanie odp z konsoli
    if (isNumber(base)) { // dla metody isNumber=true wywołanie zewnętrznej pętli if
        println("Podaj wykładnik potęgi") //pytanie użytkownika o wartość wykładnika potęgi
        val exp:String = readLine()!! //zapisanie odp z konsoli
        if (isNumber(exp) && exp.toInt() >= 0) { // dla metody isNumber=true i exp>=0 wywołanie wewnętrznej pętli if
            println(baseToExp(base.toInt(), exp.toInt())) //wywołanie metody baseToExp
        }
        else{
            println("Podałeś nieodpowiednią wartość wykładnika potęgi!") //jeśli exp nie jest intem >=0 użytkownik otrzyma komunikat
        }
    }
    else{
        println("Podałeś nieodpowiedni typ podstawy potęgi!") //jeśli base nie jest intem użytkownik otrzyma komunikat
    }
}

 */
/*Zad_5
fun swapArrays(tab1: Array<Int>, tab2: Array<Int> ): Boolean{ //metoda swapArrays
    if (tab1.size==tab2.size){ //porównanie długosci tablic
        for(i in 0..tab1.size-1) {
            tab1[i] = tab2[i].also { tab2[i] = tab1[i] } //zamiana elemntow tablic
        }
        return true //zwracanie true
    }
    return false //zwracanie false
}
fun main(args: Array<String>) { //metoda main
    println("Podaj długość pierwszej tablicy") //pytanie użytkownika o dł pierwszej tablicy
    var n1= readLine()!!.toInt()
    var tab1 = Array<Int>(n1, { i -> 0})
    for(i in 0..n1-1){ //zapisanie kolejnych wyrazów do tablicy
        println("Podaj ${i+1} element tablicy")
        tab1[i]= readLine()!!.toInt()
    }
    println("Pierwsza tablica: "+Arrays.toString(tab1))
    println("Podaj długość drugiej tablicy") //pytanie użytkownika o dł drugiej tablicy
    var n2= readLine()!!.toInt()
    var tab2 = Array<Int>(n2, { i -> 0})
    for(i in 0..n2-1){ //zapisanie kolejnych wyrazów do tablicy
        println("Podaj ${i+1} element tablicy")
        tab2[i]= readLine()!!.toInt()
    }
    println("Druga tablica: "+Arrays.toString(tab2))
    println(swapArrays(tab1, tab2)) //wywołanie metody swapArrays
}

 */
/*Zad_6
fun consoleHistogram(n: Int ) { //metoda consoleHistogram
    var tab = Array<Int>(n, { i -> 0 }) //tablica przechowująca wylosowane liczby
    for (i in 0..n - 1) { //losowanie liczb z zakresu (0:100> n razy
        tab[i] = (1..100).random() //zapisywanie do tablicy tab
    }
    println("Wylosowane liczby: " + Arrays.toString(tab)) //wyświetlenie wylosowanych liczb
    var licznik = Array<Int>(10, { i -> 0 }) //tablica licznik przechowująca ilość wystąpień liczby z i zakresu
    var vertical = Array<String>(10, { i -> "" }) //tablica przechowująca gwiazki do histogramu pionowego
    val horizontal = Array<String>(10, { i -> "" }) ////tablica przechowująca gwiazki do histogramu poziomego
    for (i in 0..9) { //pętla zewnętrzna for gdzie i oznacza kolejne 10 zakresów liczbowych
        for (k in 0..(n - 1)) { //pętla wewnętrzna for gdzie k oznacza kolejne wylosowane liczby
            if(i<9) {
                if (tab[k] >= (0 + i * 10) && tab[k] <= (9 + i * 10)) { //sprawdzanie czy liczba miesci sie w zakresie
                    licznik[i] += 1
                    vertical[i] += "*" //inkrementacja
                    horizontal[i] += "*"
                }
            }
            if(i==9) { //wyjątek dla i=9 ponieważ ostatni zakres obejmuje 100 włącznie
                if (tab[k] >= (0 + i * 10) && tab[k] <= (10 + i * 10)) {
                    licznik[i] += 1
                    vertical[i] += "*" //inkrementacja
                    horizontal[i] += "*"
                }
            }
        }
        for(j in horizontal[i].length..horizontal.size){ //wypełnienie reszty pionowej kolumny gwiazdek spacjami
            horizontal[i] += " "
        }
    }
    println("Ilość wystąpień: " + Arrays.toString(licznik))

    for (i in 0..9) { //wyświetlenie pionowego histogramu
        if (i == 9) {
            println("90 - 100" + " ${vertical[i]}") //wyświetlenie zakresu i liczby gwiazdek dla i=9
        } else {
            println("${0 + i * 10}" + " - " + "${9 + i * 10}" + " ${vertical[i]}") // -//- dla i: 0-8
        }
    }
    for (i in 9 downTo 0) { //petla for gdzie i oznacza wiersze
        //wyświetlanie odbywa się od końca ponieważ gwiazdki w kolumnie chcę wyświetlić na dole a nie u góry
        for (k in 0..9) { //k oznacza kolumny
            print(horizontal[k][i]) //wyświetlenie histogramu poziomego
            print("       ") //wyswietlenie odstępu pomiędzy kolumnami gwiazdek
        }
        print("\n") //przejscie do nowej linii
    }
    for (i in 0..9) { //wyświetlenie zakresów liczbowych dla histogramu poziomego
        print("${0 + i * 10}" + " - " + "${9 + i * 10} ")
    }
}
fun isNumber(input: String): Boolean { //metoda isDigit sprawdzająca czy input jest Intem (dzialanie opisane w zad 4)
    for (i in 0..input.length - 1)
        if (!input[i].isDigit())
            return false
    return true
}

fun main(args: Array<String>) { //metoda main
    println("Podaj ilość liczb, które chcesz wylosować") //pobieranie informacji od użytkownika
    var n = readLine()!!
    if (isNumber(n) && n.toInt() >= 0) { //jeśli wartość jest intem nieujemnym wywołanie metody consoleHistogram
        consoleHistogram(n.toInt())
    } else {
        print("Podałeś błędną wartość, ilość liczb musi być nieujemną liczbą całkowitą!") // blad=komunikat
    }

}

 */


