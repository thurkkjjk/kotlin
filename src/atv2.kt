fun main () {
    println("informe um numero")
    var n1 = readLine()?.toIntOrNull()
    if (n1 == null || n1 < 0) {
        println("numero invalido")
    }
    else {
var result = recursiv(n1)
        println("result: $result")
    }

}
fun recursiv (n1: Int) : Int {
    return if (n1 == 1) {
        1
    } else {
        n1 * recursiv(n1 - 1)
    }
}


