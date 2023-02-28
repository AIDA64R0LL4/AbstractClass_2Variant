fun main (){
    println("Выберите оператора связи")
    println("Нажмите 1 чтобы выбрать оператора Мотив")
    println("Нажмите 2 чтобы выбрать оператора МТС")
    var X = readLine()!!.toInt()
    if (X==1){
        println("Вы выбрали оператора Мотив")
    println("Напишите стоимость  стоимость за 1 минуту")
    var price= readLine()!!.toDouble()
    println("Напишите площадь покрытия.")
    var square= readLine()!!.toDouble()
    if(price>0&&square>0)
    {
        var Motiv=Price("Мотив",price,square,true)
        println(Motiv.Output())
    }
    else println("Значения не могут быть отрицательными")
    }
    if (X==2){
        println("Вы выбрали оператора МТС")
        println("Напишите стоимость  стоимость за 1 минуту")
        var price= readLine()!!.toDouble()
        println("Напишите площадь покрытия.")
        var square= readLine()!!.toDouble()
        if(price>0&&square>0)
        {
            var MTS=Price("МТС",price,square,false)
            println(MTS.Output())
        }
        else println("Значения не могут быть отрицательными")
    }
}