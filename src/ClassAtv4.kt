class ClassAtv4 {
    var modelo: String = ""
    var marca: String = ""
    var ano: Int = 0
    fun teste (){
       print("Digite as informações do automovél! \n")
        print("modelo: ")
       modelo = readLine().toString()
        print("marca: ")
        marca = readLine().toString()
        print("ano: ")
        ano = readLine()!!.toInt()
        return println("Descrição: \n Modelo: $modelo \n Marca: $marca \n Ano: $ano \n")
    }
}
