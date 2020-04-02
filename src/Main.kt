
fun main(){
    println("Hello World")
    var nama = "Hanif"
    println(nama)
    nama = "Khoirul"
    println(nama)

    var name : String? = null
    println(name?.length)

    name = "New Name"
    println(name.length)

    //Tipe Data Number

    //Integer
    val integerNumber  = 3
    println(integerNumber)
    //Short
    val shortNumber : Short = 3
    println(shortNumber)
    //Long
    val longNumber  = 8L
    println(longNumber)
    //Float
    val floatNumber  =4.5F
    println(floatNumber)
    //Byte
    val byteNumber  = 0b000010
    println(byteNumber)
    //Double
    val doubleNumber  = 40.4
    println(doubleNumber)

    //String
    val newString = "My Name is Hanif"
    println(newString)
    //Char
    val newChar = 'a'
    println(newChar)
    //Boolean
    val newBoolean = false
    println(newBoolean)

    //Pemanggilan function
    printName("Hanif Khoirul")
    val addNumber = addNumber(10,20)
    println(addNumber)


    newString.printLength()
    val newInt = 18
    newInt.printNegative()
}

//Deklarasi Unit Function
fun printName(name : String) {
    println(name)
    println(name.length)
}
//Deklarasi FUnction dengan tipe data
fun addNumber(num1 : Int, num2 : Int) : Int = num1+num2

//Extension Function
fun String.printLength(){
    println("Isi variabel String: $this")
    println("Panjang variabel String: ${this.length}")
}
fun Int.printNegative(){
    println("Hasil negatif dari $this adalah ${this*-1}")
}













