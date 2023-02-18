fun main()
{
    try
    {
        println("Введите координату а, она не должна быть 0")

        var a = readLine()!!.toDouble()
        if (a==0.0)
        {
            println("а не должна быть равно 0")
        }
        println("Введите координату b")
        var b = readLine()!!.toDouble()
        println("Введите координату c")
        var c = readLine()!!.toDouble()

        var diskr = Math.pow(b , 2.0)-4*a*c

        var x1 = (-b + Math.sqrt(diskr))/(2*a)
        var x2 = (-b - Math.sqrt(diskr))/(2*a)

        println("первая вершина пораболы= "+x1)
        println("вторая вершина пораболы= "+x2)





    }
    catch (e: Exception)
    {
        println("Ошибка ввода")
    }
}