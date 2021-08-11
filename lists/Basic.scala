val fruit: List[String] = List("apples", "oranges")
val diag: List[List[Int]] = List(List(1,0,0), List(0,1,0), List(0,0,1))

println(diag)


// using construction operation

val fruita = "apples" :: "oranges" :: "pears" :: Nil
val nums = 1 :: 2 :: 3 :: 4 :: Nil

println("head "+fruit.head)
println("tail "+fruit.tail.head)


// implementing different methods

def concat[T](xs: List[T], xs1: List[T]): List[T] = xs match {
    case Nil => xs1
    case y :: ys => y :: concat(ys, xs1)
}

println("concat "+ concat(List(1,2,3), List(4,5,6)))

def reverse[T](xs: List[T]): List[T] = xs match {
    case Nil => Nil
    case y :: ys => concat(reverse(ys), y :: Nil)
}

println("reverse "+ reverse(List(1,2,3,4)))

def customLast[T](xs: List[T]): T = xs match {
    case List() => throw new Error("empty list")
    case List(x) => x
    case y :: ys => customLast(ys)
}

println(s"last: "+customLast(List(1,2,3,4)))

def customInit[T](xs: List[T]): List[T] = xs match {
    case Nil => Nil
    case List(x) => List()
    case y :: ys => concat(y:: Nil, customInit(ys))
}

println(s"init: "+ customInit(List(1,2,3,4)))

def customRemoveAt[T](index: Int, xs: List[T]): List[T] = xs match {
    case Nil => Nil
    case y :: ys => {
        if(index == 0){
            return ys
        }
        else {
            return y :: customRemoveAt(index - 1, ys)
        }
    }
}

println("remove at 1: "+customRemoveAt(1, List(1,2,3,4)))
