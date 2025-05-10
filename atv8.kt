fun main (){
print("Insira um numero: ")
    var n: Int = readLine()!!.toInt()
var result = fibonacci(n)
    }

fun  fibonacci(n: Int) {
    var atual: Int = 1
    var anterior: Int = 0
    var fn: Int = 0
      print("$anterior-")
    while (atual < n) {
         print("$atual-")
        fn = anterior + atual
        anterior = atual
        atual = fn
    }
}