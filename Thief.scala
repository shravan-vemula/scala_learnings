// case class example

case class Thief(name: String, isThief: Boolean)

val thief = Thief("John", true)
val notThief = thief.copy(isThief = false)
val otherThief = thief.copy(name = "Bob")

println(thief.equals(notThief))
println(thief)
