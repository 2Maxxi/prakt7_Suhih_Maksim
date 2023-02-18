fun main()
{
    try
    {
        println("Введите размеры отверстия a,b")
        var a = readLine()!!.toInt()
        var b = readLine()!!.toInt()

        println("Введите размеры керпича x,y,z")

        var x = readLine()!!.toInt()
        var y = readLine()!!.toInt()
        var z = readLine()!!.toInt()





        if (x<=a && y<=b|| x<=a&&z<=b || x<=b && y<=a|| x<=b&&z<=a || y<=a && z<=b ||y<=b && z<=a)
        {
            println("Кирпич пройдёт в отверстие")
        }
        else
        {
            println("Кирпич не пройдёт в отверстие")
        }

    }
    catch (e:Exception)
    {
        println("Ошибка ввода")
    }
}