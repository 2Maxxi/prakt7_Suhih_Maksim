fun main()
{
    try
    {
        println("Введите радиус(R) окружности ")
        var r = readLine()!!.toDouble()
        println("Введите сторону вписанного(а) многоугольника ")
        var a = readLine()!!.toDouble()

        var otv =Math.sqrt(2*Math.pow(r, 2.0)-2*r*Math.sqrt(Math.pow(r, 2.0)-(Math.pow(a, 2.0)/4)))




        println("Ответ="+otv)
    }
    catch (e:Exception)
    {
        println("Ошибка ввода")
    }
}