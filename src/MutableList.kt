fun main(){
    //Mutable List punya CRUD

    val mutableListNumber = mutableListOf(1,2,"new")
    val newMutableListNumber = mutableListOf<Any>()

    //Menambahkan element baru
    mutableListNumber.add(10)
    mutableListNumber.add(120)
    mutableListNumber.add(19)
    mutableListNumber.add("Khoirul")
    mutableListNumber.cetakElements()
    newMutableListNumber.add("Hanif")
    newMutableListNumber.add(12)
    newMutableListNumber.add(10)
    newMutableListNumber.cetakElement()

    //Update element
    mutableListNumber[0] = 100
    mutableListNumber.cetakElements()

    //Remove element
    mutableListNumber.removeAt(0)
    mutableListNumber.cetakElements()

    //Replace All
    val myMutableList = mutableListOf("hanif","khoirul")
    println("Sebelum Di replaceall")
    myMutableList.cetakElements()
    myMutableList.replaceAll {
        it.toUpperCase()
    }
    println("Sebelum Di replaceall")
    myMutableList.cetakElements()

    //Get random element
    println(mutableListNumber.random())

    mutableListNumber.clear()
    println("Setelah Diclear")
    mutableListNumber.cetakElements()

}

fun <E> MutableList<E>.cetakElements() {
    this.forEachIndexed { index, any ->
        println("index ke $index adalah $any.")
    }
    println()
}

fun MutableList<Any>.cetakElement(){

    this.forEachIndexed { index, any ->
        println("index ke $index adalah $any.")
    }
    println()
}