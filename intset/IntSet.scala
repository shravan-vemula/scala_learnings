abstract class IntSet {
    def incl(x: Int): IntSet
    def contains(x: Int): Boolean
}


class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet{

    def incl(x: Int): IntSet = {
        if(x<elem) {
            return new NonEmpty(elem, left.incl(x), right)
        }
        else if(x>elem) {
            return new NonEmpty(elem, left, right.incl(x))
        }
        else {
            return this
        }
    }

    def contains(x: Int): Boolean = {
        if(x<elem) {
            return left.contains(x)
        }
        else if(x>elem) {
            return right.contains(x);
        }
        else {
            return true;
        }
    }
}


class Empty() extends IntSet {
    def contains(x: Int): Boolean = false

    def incl(x: Int): IntSet = new NonEmpty(x, new Empty(), new Empty())
}

// singleton object
object Empty extends IntSet {
    def contains(x: Int): Boolean = false

    def incl(x: Int): IntSet = new NonEmpty(x, Empty, Empty)
}

val obj1 = new NonEmpty(12, Empty, Empty)

println(obj1.incl(10).contains(10))