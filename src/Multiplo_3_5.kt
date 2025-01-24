
fun main() {
    var soma=0

    for( i in 1 until 1000){
        if (i % 3 == 0 || i % 5 == 0){
            println(i)
            soma = soma + i
        }
    }

    println("Resultado: $soma")
}