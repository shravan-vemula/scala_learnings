// example 1
// objects are instantiated from right to left
trait Base {
    override def toString() = "Base"
}

class A extends Base {
    override def toString() = "A -> " + super.toString() 
}

trait B extends Base {
    override def toString() = "B -> " + super.toString()
} 

trait C extends Base {
    override def toString() = "C -> " + super.toString()
}

class D extends A with B with C {
    override def toString() = "D -> " + super.toString()
}

val obj = new D()

println(obj)