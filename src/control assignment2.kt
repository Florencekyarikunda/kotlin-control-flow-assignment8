fun main() {
println(isEven(number))

    var category1=Product("juice",4,60,"fruit")
    println(category1)
    var category2=Product("Kazire",3,40,"medicine")
    println(category2)
    var category3=Product("Deligent",1,20,"other")
    println(category3)
    println( longNames("wato wato"))
    println(studentNames(arrayOf("florence","velma","sheilah")))

}
//single expressions
fun isEven(number:Int):Boolean = number%2 == 0
var number=22
var num = if (isEven(number =40 )) "even" else "odd"


data class Product( var name:String, var weight:Int,var price:Int,var category:String) {
 fun product(name:String,weight:Int,price:Int,category:Int) {
     var gloceryList = mutableListOf<String>()
     var hygieneList = mutableListOf<String>()
     var otherList = mutableListOf<String>()
     when ("category") {
         "gloceries"  -> println( gloceryList.add(name))
         "hygiene" -> println(hygieneList.add(name))
        else-> println(otherList.add(name))
     }
     println("${name}:${category}")

 }
}
fun longNames(names:String):String{

    var namesList = ""
    for (char in names) {
        if (names.indexOf(char) % 2 == 0) {
                namesList+=char

        }
    }
    return  namesList
}
fun studentNames(names:Array<String>):MutableList<String>{
    var namesList= mutableListOf<String>()
    for (name in names){
        if (name.length%2==0) {
            namesList.add(name)
        }
    }
    return namesList
}

