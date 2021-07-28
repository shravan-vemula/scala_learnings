// apply method in a class example
class Multiplier(factor: Int) {
    def apply(input: Int) = input * factor
}

val triple = new Multiplier(3)
println(triple(10))

// apply method in an object

class Multiplier2(val x: Int) {
    def product(y: Int) = x *y
}

object Multiplier2 {
    def apply(x: Int) =  new Multiplier2(x);
}

val double = Multiplier2(6)

println(double.product(2))

