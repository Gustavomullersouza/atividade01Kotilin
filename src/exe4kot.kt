fun main() {
    println("Digite um número para calcular o fatorial: ")
    val numero = readLine()!!.toInt()
    var fatorial = 1
    for (i in 1..numero) {
        fatorial = fatorial * i
    }
    println("O fatorial de $numero é $fatorial ")
}