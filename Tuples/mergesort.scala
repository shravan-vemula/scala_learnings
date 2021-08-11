
def splitAt[T](xs: List[T], n: Int): (List[T], List[T]) = {
    return (xs.take(n), xs.drop(n))
}

println("splitAt "+ splitAt(List(1,2,3,4), 2))

def merge(xs: List[Int], ys: List[Int]): List[Int] = (xs,ys) match {
    case (xs, Nil) => xs
    case (Nil, ys) => ys
    case (x :: xs1, y :: ys1) => {
        if(x < y) {
            return x :: merge(xs1, ys)
        }
        else {
            return y :: merge(xs, ys1)
        }
    }
}

def msort(xs: List[Int]): List[Int] = {
    val n = xs.length / 2
    if(n == 0) {
        return xs
    }
    else{
        val (first, second) = splitAt(xs, n)
        merge(msort(first), msort(second))
    }
}

println(" merge sort:[2,1,5,3,7] ", msort(List(2,1,5,3,7)))


// def splitAt[T](xs: List[T], n: Int): (List[T], List[T]) = {
//     return (xs.take(n), xs.drop(n))
// }

// println("splitAt "+ splitAt(List(1,2,3,4), 2))



// def msort[T](xs: List[T])(lt: (T,T) => Boolean): List[T] = {
//     val n = xs.length / 2
//     if(n == 0) {
//         return xs
//     }
//     else{
//         def merge[T](xs: List[T], ys: List[T]): List[T] = (xs,ys) match {
//     case (xs, Nil) => xs
//     case (Nil, ys) => ys
//     case (x :: xs1, y :: ys1) => {
//         if(lt(x, y)) {
//             return x :: merge(xs1, ys)
//         }
//         else {
//             return y :: merge(xs, ys1)
//         }
//     }
// }
//         val (first, second) = splitAt(xs, n)
//         merge(msort(first)(lt), msort(second)(lt))
//     }
// }

// println(" merge sort:[2,1,5,3,7] ", msort(List(2,1,5,3,7))((x: Int,y: Int) => x < y))