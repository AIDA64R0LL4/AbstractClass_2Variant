class Price(name:String,price:Double,square:Double,public var P:Boolean):Operator(name,price,square)
{
    constructor(name:String,price:Double,square: Double):this(name,price,square,true)
    override fun Q():Double {
        if (P==true)
            return 0.7*super.Q()
        else
            return 1.5*super.Q()
    }
    override fun Output(): String
    {
        return "оператор связи $name, стоимость минут составляет $price, плошаль покрытия $square и стоимость звонка ${Q()}"
    }
}