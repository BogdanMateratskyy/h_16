package cmd

import People.Person

object HelloWorld {
  def main(args: Array[String]): Unit = {
    println ("Hello, World!")
    println(s"Command line arguments: ${args.toList}")
    println(s"Grouped command line arguments: ${args.toList.grouped(2).toList}")

    val people = args.grouped(2).map { pair =>
      val name = pair(0)
      val age = pair(1).toInt

      Person(name, age)
    }.toList

    val kids = people.filter(p => p.age < 12)
    val elders = people.filter(p => p.age > 60)

    println(s"People: ${people}")
    println(s"Kids: ${kids}")
    println(s"Elders: ${elders}")

    val byAge = people.sortBy(_.age)

    println(s"People sorted by age: ${byAge}")
  }
}
