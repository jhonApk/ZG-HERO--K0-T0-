fun main() {
    val numero: Long = 600851475143L

    var num = numero
    var divisor = 2L

    while (num % divisor == 0L){
        num /= divisor
    }

    divisor = 3L
    var maiorFator = divisor

    while (divisor * divisor <= num){
        while (num % divisor == 0L){
            num /= divisor
            maiorFator = divisor
        }

        divisor += 2
    }

    if (num > 2){
        maiorFator = num
    }

    println("Maior Fator Primo de $numero é: $maiorFator")
}


