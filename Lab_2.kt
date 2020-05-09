fun main(args:Array<String>) {
    /*Zad 1
    var r = (1..100).random() // wybranie losowej wartości różnicy ciągu z zakresu [1:100]
    println("Podaj pierwszy wyraz ciągu")
    val a1 = readLine()!!.toInt()//zdefiniowanie 1-ego wyrazu ciągu i przypisanie mu przykładowej wartości, np. 1
    val n = 10 // zdefiniowanie zmiennej n przechowującej wartość będącą liczbą wyrazów ciągu
    var tablica = Array(n, { i -> a1 + (i * r) }) //stworzenie tablicy przechowującej wyrazy ciagu arytmetycznego
    println(Arrays.toString(tablica)) // wyświetlenie tablicy

    var suma_ciagu1 =
        tablica.sum() // zdefiniowanie zmiennej, ktora bedzie przechowywac sumę ciągu liczoną za pomocą funkcji sum
    var suma_ciagu2 =
        (a1 + tablica[9]) * n / 2 //zdefiniowanie drugiej zmiennej przechowującej wartość sumy ciągu obliczoną na podstawie wzoru

    if (suma_ciagu1 == suma_ciagu2) {
        println("Suma wyrazów ciągu zgadza się z wartością otrzymana ze wzoru") //porównanie czy sumy obliczone dwoma spodobami są takie same+wyświetlenie komunikatu
    }

     */

    /*Zad 2
    var tablica = Array(50,{ i -> "0".toDouble() }) //zdefiniowanie 50 elementowej tablicy przechowującej liczby zmiennoprzecinkowe
    var a = 0.0
    for (i in 0..tablica.size - 1) {
        a = Random().nextDouble() * 100 //wypełnienie tablicy, za pomocą pętli for, liczbami zmiennoprzecinkowymi i pseudolosowymi z zakresu 0-100
        tablica[i] = a
    }
    print(Arrays.toString(tablica)) //wyświetlenie elementów tablicy

    var max = tablica.max() //wyszukiwanie max liczby wsrod elementow tablicy
    var index_max = tablica.indexOf(tablica.max()) //wyszukiwanie indeksu max liczby
    println("\nNajwiększy element w tablicy posiada indeks= $index_max i równa się $max")

    var min = tablica.min() //wyszukiwanie min liczby wsrod elementow tablicy
    var index_min = tablica.indexOf(tablica.min()) //wyszukiwanie indeksu min liczby
    println("Najmniejszy element w tablicy posiada indeks= $index_min i równa się $min")

    var srednia = tablica.average() //obliczanie średniej za pomocą funkcji average
    println("Średnia równa się $srednia")

    var licznik = 0.0 //deklaracja zmiennej która będzie przechowywać wartość odpowiadającą licznikowi we wzorze na odchylenie s
    for (i in 0..tablica.size - 1) {
        licznik += (tablica[i] - srednia).pow(2) //obliczenie kolejnych członów licznika
    }
    var odchylenie =
        (licznik / tablica.size).pow(0.5) //Ostateczne obliczenie wartości odchylenia, licznik podzielono przez liczbę elementów tablicy i podniesiono do potęgi 0.5
    println("Odchylenie standardowe równa się $odchylenie")

    var nowa_tablica = Array(tablica.size, { i -> "0".toDouble() })
    nowa_tablica = tablica.reversedArray() //deklaracja nowej tablicy przechowującej elementy w odrotnej kolejności, użyto funkcji reversed
    print(Arrays.toString(nowa_tablica))

     */

    /*Zad 3
    println("Podaj długość tablicy") //Pobieranie od użytkownika informacji o długości tablciy
    var length= readLine()!!.toInt()
    var tablica = Array(length, { i -> 0}) //Utworzenie tablicy przechowywującej elementy
    for (i in 0..9){
        tablica[i]=(2..10).random() // wypełnienie tablicy liczbami pseudolosowymi z zakresu 2-10
    }
    println(Arrays.toString(tablica)) //wyświetlenie pierwotnej tablicy
    tablica[0] = tablica[1].also { tablica[1] = tablica[0] } //zamiana dwóch pierwszych elementów tablicy ze sobą
    println(Arrays.toString(tablica)) //wyświetlenie tablicy po zamianie

     */

    /*Zad 4
    println("Podaj ilość współczynników pierwszego wielomianu") //pobieranie informacji o długości pierwszego wielomianu
    var dł_1= readLine()!!.toInt() // zapisanie informacji o długości wielomianu w zmiennej dł
    var tablica1 = Array(dł_1,{ i ->0}) //Stworzenie "zerowej" tablicy, która będzie przechowywać współczynniki wielomianu
    var wielomian=("") //Utworzenie stringa, który będzie służył do wyświetlenia wielomianu uzytkownikowi
    for (i in 0 ..dł_1-1){ //Utworzenie pętli służącej do pobrania wartości współczynnika, zapisaniu go w tablicy jak i dodania do stringa 'wielomian'
        println("podaj współczynnik wielonianu $i stopnia")
        tablica1[i]= readLine()!!.toInt() //zapisanie współczynnika do tablicy
        wielomian+=(tablica1[i].toString()+"x^$i") //dodanie współczynnika do stringa
        if(i!=dł_1-1){ //Ta pętla służy uniknięciu wyświetlania znaku "+" po ostatnim wyrazie wielomianu
            wielomian+=("+")
        }
    }
    println("Twój pierwszy wielomian="+wielomian)

    println("Podaj ilość współczynników drugiego wielomianu")
    var dł_2= readLine()!!.toInt()
    var tablica2 = Array(dł_2,{ i ->0})
    wielomian=("")
    for (i in 0..dł_2-1){
        println("podaj współczynnik wielonianu $i stopnia")
        tablica2[i]= readLine()!!.toInt()
        wielomian+=(tablica2[i].toString()+"x^$i")
        if(i!=dł_2-1){
            wielomian+=("+")
        }
    }
    println("Twój drugi wielomian="+wielomian)

    var dł_koncowa=dł_1+dł_2-1 //Utworzenie zmiennej przechowującej wartośc długości wielomianu końcowego
    var tablica_koncowa=Array(dł_koncowa,{ i ->0}) //Utworzenie "zerowej" tablicy końcowej

    //mnozenie wspolczynnikow wielomianow
    for (i in 0..dł_1-1) { //1 pętla wykonuje obieg tyle razy jak długi jest 1 wielomian
        for(k in 0..dł_2-1){ // 2 pętla wykonuje obieg tyle razy jak długi jest 2 wielomian
            tablica_koncowa[i+k]+=tablica1[i]*tablica2[k] //mnożenie konkretnych współczynników i dodawanie ich do kolejnych współczynników tego samego stopnia wymnożonych w kolejnym obiegu
        }
    }
    wielomian=("")
    for (i in 0..dł_koncowa-1){ //pętla for służaca do wyświetlania końcowego wielomianu
        wielomian+=(tablica_koncowa[i].toString()+"x^$i")
        if(i!=dł_koncowa-1){
            wielomian+=(" + ")
        }
    }
    println("Wielomian powstały w wyniku pomnożenia 2 wielomianów to="+wielomian)
*/
}
