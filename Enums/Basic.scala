object Main extends Enumeration 
{
    type Main = Value
      
    val first = Value("Thriller")
    val second = Value("Horror")
    val third = Value("Comedy")
    val fourth = Value("Romance")
      
    def main(args: Array[String])
    {
        println(s"values = "+ Main.values)
        println(s"third = "+ Main.third)

    }
}