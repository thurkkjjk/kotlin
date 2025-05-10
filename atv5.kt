fun main (){
    print("Digite um numero: ")
    var n:Int=readLine()!!.toInt()
    for ( i in 1 until n+1 ){

        if (i%2!=0) {
            print("$i ")
        }

    }
}