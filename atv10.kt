
class Estudante (){
    var nome : String = ""
    var idade : Int = 0
    var nota: Float = 0f
    var Resnota: Float = 0f
    var nota2: Float = 0f
    var nota3: Float = 0f
    fun info(){
        print("Nome do estudante: ")
        nome = readLine()!!.toString()
        print("Idade: ")
        idade = readLine()!!.toInt()
        print("Nota no primeiro  trimestre: ")
        nota = readLine()!!.toFloat()
        print("Nota no segundo  trimestre: ")
        nota2 = readLine()!!.toFloat()
        print("Nota no terceiro  trimestre: ")
        nota3 = readLine()!!.toFloat()
        Resnota = calc(nota, nota2, nota3) // manda as notas para calcular
        println("REST: $Resnota ") // confere o resultado que foi  retornado e diz se é maior que 7 ou não
        if (Resnota > 7) {
            println("Com base nas notas dos trimestes, o estudante : $nome, foi aprovado! ")
        } else {
            println("Com base nas notas dos trimestes, o estudante : $nome, foi reprovado! ")

        }

    }
    fun calc(nota1: Float, nota21: Float, nota31: Float) : Float { // função que calcula e devolve o valor calculado

var Rest: Float = (nota1 + nota21 + nota31 )/ 3
        return Rest
    }

    }

fun main (){
val aluno = Estudante()
    do { // do/while  para verificar se quer verificar a nota de outro  aluno. Este código pode ser aprimorado para salvar os dados em arquivo ou BD
    aluno.info()
        print("deseja verificar outro aluno? 1 - SIM | 2 - NAO: ")
        var veri : Int  = readLine()!!.toInt()
        var VeriAluno: Boolean = false
        when (veri){
            1 -> VeriAluno = true
            2 -> VeriAluno = false
        }
    } while (VeriAluno == true )

}
