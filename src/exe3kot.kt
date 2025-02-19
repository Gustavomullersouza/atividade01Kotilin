import kotlin.random.Random
fun main(){

    val numeroAleatorio = Random.nextInt(1,101)

    while(true) {
        println("digite seu numero entre 1 a 100")
        var numero = readLine()!!.toInt()

        if (numero == numeroAleatorio) {
            println("Parabéns, você acertou $numeroAleatorio ")
            break
        } else if (numero < numeroAleatorio){
            println("Tente um número maior")
        } else{
            println("Tente um número menor")
        }
    }}