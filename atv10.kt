// Estrutura pronta, basta eu saber como a média vai ser calculada! deve ser maior ou menor que 7
// criar uma função que diga se esta a baixo ou não da média 
class Estudante (){ //
    var nome : String = ""
    var idade : Int = 0
    var nota: Float = 0f
    var Resnota: Float = 0f
    var nota2: Float = 0f
    var nota3: Float = 0f
    fun info(){
        println("Nome do estudante: ")
        nome = readLine()!!.toString()
        println("Idade: ")
        idade = readLine()!!.toInt()
        println("Nota no primeiro  trimestre: ")
        nota = readLine()!!.toFloat()
        println("Nota no segundo  trimestre: ")
        nota2 = readLine()!!.toFloat()
        println("Nota no terceiro  trimestre: ")
        nota3 = readLine()!!.toFloat()
        Resnota = calc(nota, nota2, nota3)
        println("REST: $Resnota ")
    }
    fun calc(nota1: Float, nota21: Float, nota31: Float) : Float {
var Rest: Float = nota1 + nota21 + nota31 / 3
        return Rest
    }
}

fun main (){
val aluno = Estudante()
    aluno.info()
}
