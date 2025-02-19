fun main() {

     println("Digite um número")
    val numero = readLine()!!.toInt()
    var ehPrimo: Boolean = true
    if (numero <= 1){
        ehPrimo = false;
    }else {
        for(i in 2 until numero){
        if (numero % i == 0){
            ehPrimo = false
            break
        }
    }

    if(ehPrimo){
        println("$numero é um número primo")
    }else {
        println("$numero não é um numero primo")
    }
}}
