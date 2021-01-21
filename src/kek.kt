//fun main () {
//    println("Сейчас мы находим S между автомобилями через t часов.")
//    print ("Скорость первого автомобиля(В км/ч):" )
//    var V1 = readLine().toString()!!.toDouble()
//    print ("Скорость второго автомобиля(В км/ч):" )
//    var V2 = readLine().toString()!!.toDouble()
//    print ("Расстояние на момент начала рассчета(В километрах):" )
//    var Sbegin = readLine().toString()!!.toDouble()
//    print ("Время прошедшее со старта(В часах):" )
//    var t = readLine().toString()!!.toDouble()
//    var Sfinal = Sbegin+V1*t+V2*t
//    print ("Итоговый рассчет: $Sfinal" )
//}
fun main () {
    println("Сейчас мы работаем с кубом.")
    println("Сторона куба:")
    var a = readLine().toString()!!.toDouble()
    println("Операция (L - Сумма всех ребер, Sb - площадь боковой грани, S - площадь всего куба):")
    var oper = readLine().toString()
    if (oper == "L") {
        var L = a*12
        print(L)
    } else if (oper == "1L") {

    }
}