object hello_world {
  def main(args: Array[String]): Unit = {
    println("Hello World")

    var newV : Int = 25
    println("Integer Value:" + newV)

    //re initialize value
    newV = 30
    println("Char new Value"+newV)

    // collection of data
    var vaList : List[String] = List("Apricot","Blueberry","Cherry","Donut","Egg")

    // Array : Mutable, Fixed length, Homogenous, Can access using indexing
    //List : Immutable, Homogenous, Variable length

    vaList.foreach(println)

    //Empty list declaration
    var emptyList: List[Nothing] = List()
  }
}
