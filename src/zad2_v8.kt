 fun min()
 {
     try
     {
        println("Введите первое вещественное число")
         var a = readLine()!!.toInt()
         println("Введите второе вещественное число")
         var b = readLine()!!.toInt()


        if (a<b || a==b)
        {
            a=0
        }

         println("первое число="+a)
         println("Второе число="+b)
     }
     catch (e:Exception)
     {
         println("Ошибка ввода")
     }
 }