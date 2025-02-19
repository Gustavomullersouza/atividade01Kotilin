import java.util.*

fun main() {


    println("Digite a primeira nota")
    val nota1= readLine()!!.toDouble()
    println("Digite a segundo nota")
    val nota2= readLine()!!.toDouble()
    println("Digite a terceira nota")
    val nota3= readLine()!!.toDouble()

    var soma = nota1 + nota2 + nota3;
    var media = soma / 3

    println(media)

    if(media >= 7){
        println("Aprovado")
    }else if(media >= 5){
        println("Recuperação")
    }else{
        println("Reprovado")
    }


}