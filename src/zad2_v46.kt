fun main()
{
    try
    {
        println("Введите какой у вас рабочий график 5 дней в неделю или 6")
        var f = readLine()!!.toInt()
        if(f!=5 || f!=6)
        {
            println("Введите либо 5, либо 6 -_-")
        }

        println("Введите координаты еомер дня недели")

        var a = readLine()!!.toInt()
       if (a<1 && a>7)
       {
           println("всего 7 дней недели-_-")
       }
        if (f==5)
        {
            when(a)
            {
                in 1..5->println("рабочий день")
                in 6..7->println("выходной день")
            }
        }
        if (f==6)
        {
            when(a)
            {
                in 1..6->println("рабочий день")
                in 7..7->println("выходной день")
            }

        }



    }
    catch (e:Exception)
    {
        println("Ошибка ввода")
    }
}