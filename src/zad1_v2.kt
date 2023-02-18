fun main()
{
    try
    {
        var m = readLine()!!.toInt()
        var n = readLine()!!.toInt()

        while (m>0&&n>0)
        {
            var am = readLine()!!.toDouble()
            var an = readLine()!!.toDouble()
            var s = ((am + an) * (n - m + 1)) / 2
            println(s)
        }

    }
    catch (e:Exception)
    {
        println("Ошибка ввода")
    }
}