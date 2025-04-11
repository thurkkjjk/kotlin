
fun main () {
        var n1: Int
        var n2: Int
        print ("informe o primeiro numero")
        n1 = readLine()!!.toInt()
        print ("informe o segundo numero")
        n2 = readLine()!!.toInt()
     val result = cal(n1,n2)
        print("resultado: $result")
    }

fun cal(v1: Int,v2: Int): Int {
        var rest: Int = 0
        var opcao: Int = 0
        do {
                println("Bem vindo a Calculadora! \n digite...\n 1 - soma, 2 - subtração, 3 - multiplicação, 4 - divisao e 0 para sair")
                opcao = readLine()!!.toInt()
                when (opcao) {
                        1 -> rest = v1 + v2
                        2 -> rest = v1 - v2
                        3 -> rest = v1 * v2
                        4 -> if (v1 == 0 || v2 == 0) {
                                println("erro")
                        } else {
                                rest = v1 / v2
                        }
                }

        } while (opcao != 0)
        return rest
}