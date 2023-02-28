abstract class Operator(var name:String,var price:Double,var square:Double)
{
    constructor(price:Double,square: Double):this("",price,square)
    open fun Q():Double
    {
        return (100*square)/price
    }
    abstract fun Output():String

}