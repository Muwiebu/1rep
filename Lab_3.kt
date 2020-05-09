import java.util.*

/*Zad 1
import java.util.*

fun array(tab1: Array<Int>, tab2: Array<Int>, k: Int, l: Int){ // metoda array
    tab1[k] = tab2[l].also { tab2[l] = tab1[k] } //zamiana elementów tablic
    println("Pierwsza tablica po zamianie "+Arrays.toString(tab1)) //wyświetlenie tablic po zamianie elementów
    println("Druga tablica po zamianie "+Arrays.toString(tab2))
}
fun main(args: Array<String>) { //funkcja main
    var tab1= arrayOf(1, 2, 3, 4, 5) //deklaracja tablic
    var tab2= arrayOf(6, 7, 8, 9, 10)
    println("Pierwsza tablica to "+Arrays.toString(tab1)) //wyświetlanie tablic
    println("Druga  tablica to "+Arrays.toString(tab2))

    println("Podaj indeks elementu pierwszej tablicy, który chcesz zamienić") // pobieranie od użytkownika indeksów elementów, które mają być zamienione
    val k= readLine()!!.toInt()
    println("Podaj indeks elementu drugiej tablicy, który chcesz zamienić")
    val l= readLine()!!.toInt()

    if (k<=tab1.size-1 && l<=tab2.size-1 && k>=0 && l>=0){ //sprawdzenie poprawności podanych indeksów
        array(tab1, tab2, k, l) //wywołanie metody array
    }
    else{ //wyświetlenie komunikatu o błędzie
        println("Podałeś nieprawidłową pierwszą lub drugą wartość indeksu tablicy")
    }
}

 */
/* Zad 2
fun triangle(a: Double, b: Double, c: Double){ //Utworzenie metody triangle
    if (a>=b+c || b>=a+c || c>=a+b){ //warunek na powstanie trójkąta
        println("FALSE") //wyświetlenie komunikatu FALSE
    }
    else{
         println("TRUE")
        }
}
fun main(args: Array<String>) { //funkcja main
    val tab = Array(3, { i -> 0.0 }) //tablica przechowująca wartości długości boków
    for(i in 1..3){ //pobieranie od uzytkownika długości boków
        println("Podaj długość $i boku")
        tab[i-1]= readLine()!!.toDouble() //zapisywanie długości boków w tablicy
    }
    var a=tab[0] //przypisanie zmiennym długości boków
    var b=tab[1]
    var c=tab[2]
    triangle(a, b, c) //wywołanie metody triangle
}

 */
/* Zad 3
fun lotto(m: Int, n: Int): Array<Int>{ //Utworzenie metody lotto
    var tab = Array<Int>(m, { i -> 0}) //tablica przechowująca wartości wyników losowania
    //var rand=0
    for(i in 0..(m-1)) { //pętla for wykonująca m powtórzeń
        var rand = (2..(n-1)).random() // losowanie liczby z przedziału [2,n-1], czyli (1,n)
        tab[i]=rand //zapisywanie wylosowanej liczby do tablicy
    }
    return tab //zwrócenie tablicy wylosowanych liczb całkowitych
}
fun main(args: Array<String>) { //funkcja main
    println("Podaj liczbę określającą ile liczb ma zostać wylosowanych") // pobieranie od użytkownika wartości m i n
    var m= readLine()!!.toInt()
    println("Podaj liczbę określającą górny przedział zakresu losowania")
    var n= readLine()!!.toInt()

    if(m<=0){ //sprawdzenie wpisanych przez użytkownika wartości m i n i w razie błędu wypisanie komunikatu
        println("Liczba wylosowanych liczb musi być nieujemna!")
    }
    else if(n<=2){
        println("Wartość określająca górny przedział zakresu losowania musi być większa od dwa!")
    }
    else {
        print(Arrays.toString(lotto(m, n))) //wywołanie i wyświetlenie metody lotto
    }
}

 */
/*Zad 4
fun dice(): Array<String>{ //Utworzenie metody dice
    var tab=Array<String>(6, { i -> ""}) //końcowa tablica służąca do wyświetlenia zawartości licznika i kumunikatu
    var licznik=Array<Int>(6, { i -> 0}) //tablica przechowująca wartości częstości rzutów
    for(i in 1..1000) {
        var rand = (1..6).random() //imitowanie rzutu kostką
        for (i in 1..6) { //jeśli wynik rzutu odpowiada wartości "i" odpowiedni element tablicy licznik zwiększa się
            if (rand == i){
                licznik[i-1]+=1
            }
        }
    }
    for (i in 1..6) { //zapisanie do elementów tablicy końcowej komunikatu o ilości rzutów dla konkretnej liczby oczek
        tab[i-1]="Liczbę oczek równą $i wyrzucono ${licznik[i-1]} razy"+"\n"
    }
    return tab //zwrócenie tablicy końcowej
}
fun main(args: Array<String>) { //funkcja main
    print(Arrays.toString(dice())) //wywołanie i wyświetlenie metody dice
}
*/
/*Zad 5
fun vowels(ciag: String){ //metoda vowels()
    var licznik=0 //Utworzona zmienna licznik rzechowująca liczbę samogłosek w wyrażeniu
    for (i in 0..(ciag.length-1)){ //pętla badająca kązdy znak wyrażenia (czy jest samogłoską)
        if (ciag[i]=='A' || ciag[i]=='E' || ciag[i]=='O' || ciag[i]=='U' || ciag[i]=='I' || ciag[i]=='Y'){
            licznik=licznik+1 //inkrementacja licznika
        }
    }
    println("Podany ciąg znaków zawiera $licznik samogłosek") //wyświetlenie wyniku
}
fun main(args: Array<String>) { //funkcja main
    println("Prosze podać ciąg znaków do obliczenia liczby samogłosek") //wyświetlenie polecenia użytkownikowi
    var ciag= readLine()!!.toString().toUpperCase() //Pobranie od użytkownika znaków i zamiana na duże litery
    vowels(ciag) //wywołanie metody vowels
}

 */