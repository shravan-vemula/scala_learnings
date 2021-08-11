def isort(xs: List[Int]): List[Int] = xs match {
    case List() => List()
    case y :: ys => insert(y, isort(ys))
}

def insert(x: Int, xs: List[Int]): List[Int] = xs match {
    case List() => List(x)
    case y :: ys => {
        if(x < y) {
            return x :: xs
        }
        else {
            return y :: insert(x,ys)
        }
    }
}

println(isort(List(5,1,3,2)))