fun main()
{
    try
    {
        println("Введите координаты [a,b] [c,d]")
        var a = readLine()!!.toInt()
        var b = readLine()!!.toInt()
        if (a>b)
        {
            println("а должно быть меньше b")
        }
        var c = readLine()!!.toInt()
        var d = readLine()!!.toInt()
        if (c>d)
        {
            println("c должно быть меньше d")
        }
        println("Введите x")
        var x = readLine()!!.toInt()

        when(x)
        {
            in a..b-> println("x принадлежит [a b]")
            in c..d-> println("x принадлежит [c d]")
            else -> println("x не принадлежит ни одному отрезку")


        }



    }
    catch (e:Exception)
    {
        println("Ошибка ввода")
    }
}