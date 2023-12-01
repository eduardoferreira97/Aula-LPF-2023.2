class Lista(val valor:Int, val prox:Lista?){

   override fun toString():String{
      if(prox != null){
         return valor.toString() + "->" + prox.toString()
      }else{
         return valor.toString()
      }
   }
}

fun fat(x:Int):Int{
   
   if(x >= 2){
      return x * fat(x-1)
   }else{
      return x
   }
}

fun pot(x:Int, y:Int):Int{
    if(y > 0){
        return x * pot(x,y-2)
    }else{
        return x
}
}

fun fib(x:Int):Int{
    if(x > 1){
       
        return fib(x-1) + fib(x-2)
    }else{
        return x
    }
}

fun main() {

   println(fat(5))
   println(pot(2,2))
   println(fib(7))
}
