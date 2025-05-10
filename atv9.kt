import kotlin.random.Random

fun main  (){
println("\n BEM-VINDO AO JOGO DE ADIVINHAÇÃO! Tente acertar um numero entre 0 e 100")
    var verifica: Boolean = false
    var aleatorio = Random.nextInt(0, 101)
    println("Numero gerado!")
  do {
      print("Tente acertar  o numero entre 0 e 100: ")
      var n = readLine()!!.toInt()
      if (n != aleatorio) {
          print(aleatorio)
          if (aleatorio > n){
              println ("você errou, tente novamente! O numero gerado é maior que $n")
          }
          verifica = false
      } else{
        println("Você acertou, parabéns!!")
        verifica = true
      }
  } while (verifica == false)
}