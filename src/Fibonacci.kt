fun main() {
    val limite = 4000000
    val lista = mutableListOf<Int>()

    var i = 0
    while (fibonacci(i) < limite){
        println(fibonacci(i))

        if (fibonacci(i) % 2 == 0){
            lista.add(fibonacci(i))
        }

        i++
    }


    println(lista)
    println("Resultado: ${lista.sum()}")
}

fun fibonacci(n: Int): Int{

    if (n < 2){
        return n
    }else {
        return fibonacci(n -1) + fibonacci(n -2)
    }
}


