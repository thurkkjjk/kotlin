fun main (){
print("Digite uma palavra: ")
    var palavra = readLine().toString()
    var result = veri(palavra)
    print(result)
}
fun veri (palavra: String) : Int {

    var contagem: Int  = 0
    for (n in palavra.length-1 downTo 0){
        if (palavra[n] == 'A' || palavra[n] == 'a' || palavra[n] == 'E' || palavra[n] == 'e' ||
            palavra[n] == 'I' || palavra[n] == 'i' || palavra[n] == 'O' || palavra[n] == 'o' ||
            palavra[n] == 'U' || palavra[n] == 'u'){
            contagem =  contagem + 1
        } // verfica se as posições da String são vogais e aplica uma contagem
    }
    println(contagem)
    return contagem
}