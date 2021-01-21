fun main () {
    print ("Скорость первого автомобиля:" )
    var V1 = readLine().toString()!!.toDouble()
    print ("Скорость второго автомобиля:" )
    var V2 = readLine().toString()!!.toDouble()
    print ("Расстояние на момент начала рассчета:" )
    var Sbegin = readLine().toString()!!.toDouble()
    print ("Время прошедшее со старта:" )
    var T = readLine().toString()!!.toDouble()
    var Sfinal = Sbegin+V1*T+V2*T
    print ("Итоговый рассчет: $Sfinal" )
}