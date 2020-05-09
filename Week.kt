enum class Week{
    Poniedzialek, Wtorek, Sroda, Czwartek, Piatek, Sobota, Niedziela;

    fun isWeekend(): Boolean{
        if ( this == Sobota || this == Niedziela)
            return true
        else
            return false

    }
    fun isWorkingDay(): Boolean{
        if (this == Poniedzialek || this == Wtorek || this == Sroda || this == Czwartek || this == Piatek)
            return true
        else
            return false
    }
}


