fun main (){
    var numero = ArrayList<Int>()
    do {
        print("digite um numero inteiro ou 'S' para sair: ")
        var entrada = readLine()

        if (entrada == "s") {
        break
        } // aqui verifica para sair
        var n = entrada?.toIntOrNull()
        if (n == null) {
            numero.add(0)
        } // aqui verifica se é nulo, se for, ele adiciona 0

        else{ // adicionando o valor dentro da Arraylist Int
            var valor : Int = n
            numero.add(valor)
        }
    } while (entrada != "S" || entrada != "s") // fim do laço  que se for S maiúsculo ou minúsculo ele sai
media(numero)

}

// variável que receba o tamanho da lista para  poder dividir // variável que receba a soma da lista, posição por posição .


fun media(numero:ArrayList<Int>){
    var valor: Int = 0
    var tamanho: Int = numero.size // tamanho da ArrayList para poder dvidir pela soma
    for (n in numero){ // fazendo a soma de todos os itens da arraylist
        valor = valor + n
    }
    var result : Float = 0.0f
    result = valor / tamanho.toFloat() // divide e faz a média

    println("MEDIA DOS NUMEROS: ")

    println(result)

    println("NUMEROS DIGITADOS: ") // aqui exibe os números
    for (n in numero){
        print("$n-")
    }
    println("FIM")
}