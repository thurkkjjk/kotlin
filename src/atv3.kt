fun main (){
    print("Verifique o Palindromo:\n Digite uma palavra: ")
    var str1 : String = readLine().toString()
    var str2 : String = verificar(str1)
    println(str2)
}
fun verificar(str1: String): String {
    // a primeira posição vai receber a ultima
    // str2(1) = str1(10)
    var i: Int  = 0
    var j: Int = 0
    var str2: String = ""
        for (i in str1.length - 1 downTo 0) {
            str2 += str1[i]
        }
    return if (str2 == str1) {
         "É palindromo"
    } else {
         "Não é palindromo"
    }
}