fun main(){
    val listNumber = listOf(1,2,3,4,5,6,"Hanif")
    println(listNumber[4]) //get index ke 4
    println(listNumber.size) //panjang dari list
    val newList = listOf<Any>()
    for (i in newList.indices){
        println("iiii $i")
    }

    listNumber.forEach {
        print("$it, ")
    }
    println()
    listNumber.forEachIndexed { index, any ->
        println("index ke $index adalah $any")
    }
    println()
    for(data in listNumber){
        print("$data, ")
    }

}