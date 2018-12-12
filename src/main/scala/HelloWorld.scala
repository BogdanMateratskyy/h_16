package cmd
object HelloWorld {
  def main(args: Array[String]): Unit = {
    println ("Hello, World!")
    println(s"Command line arguments: ${args.toList}")
    println(s"Grouped command line arguments: ${args.toList.grouped(2).toList}")

    
  }
}
