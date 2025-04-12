fun main (){
    print("Verifique o Palindromo:\n Digite uma palavra: ")
    var str1 : String = readLine().toString()
    var str2 : String = verifica(str1)
    println(str2)
}
fun verifica (str1 : String) : String {
    var str2: String = str1.reversed()
    return if (str2 == str1){
         "É palindromo"
    }
    else {
        "Não é palindromo"
    }
}