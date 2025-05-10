import kotlin.random.Random

fun main  () {
    do {
    println("\n BEM-VINDO AO JOGO DE ADIVINHAÇÃO! Tente acertar um numero entre 0 e 100")
    var verifica: Boolean = false
        var verifica2: Boolean = false
        var verInt = 0
        var aleatorio = Random.nextInt(0, 101)
    println("Numero gerado!")
    do {
        print("Tente acertar  o numero entre 0 e 100: ")
        var n = readLine()!!.toInt()

        if (n == aleatorio) {
            print("PARABENS,VOCE ACERTOU!")
            verifica = true
        } else {
            println("$aleatorio")
            verifica = false
            if (n < aleatorio) {
                print("O numero gerado é maior que $n \n")
            } else {
                print("O numero gerado é menor que $n \n")
            }
        }


    } while (!verifica)

    print("Deseja jogar novamente?  1 - SIM || 2 - NAO: ")
    verInt = readLine()!!.toInt()
 when (verInt) {
     1 -> verifica2 = false
     2 -> verifica2 = true
 }

} while (!verifica2)

print ("JOGO FINALIZADO")
}