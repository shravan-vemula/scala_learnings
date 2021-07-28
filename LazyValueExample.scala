class LazyValueExample {
    val x = { println(" regular x"); util.Random.nextInt }
    lazy val y = { println("lazy y"); util.Random.nextInt }
}

println("During instantiation")
val p = new LazyValueExample()

println("During invocation")
println(s"Values ${p.x}, ${p.y}")

println("After invocation")
println(s"Values ${p.x}, ${p.y}")