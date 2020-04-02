
fun main(){
    val arrayNumbers = arrayOf(1,2,3,4,5,6)
    val newArrayNumbers = arrayOfNulls<Int>(10)

    for (i in 0..10){

    }
    newArrayNumbers.forEach {
        print("$it, ")
    }

    //Isi array of nulls
    for (i in newArrayNumbers.indices){
        newArrayNumbers[i] = i+2
    }

    newArrayNumbers.forEach {
        print("$it, ")
    }

    println()
    println(arrayNumbers[5])
    for (number in arrayNumbers){
        print("$number, ")
    }
    println()
    arrayNumbers.forEach {number:Int ->
        print("$number, ")
    }
    println()
    arrayNumbers.forEachIndexed { index, number: Int ->
        println("Index ke $index adalah $number")
    }
}