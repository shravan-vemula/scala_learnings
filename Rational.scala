class Rational(x: Int, y: Int){

   require(y > 0, "Denominator should be positive")
   private def gcd(x: Int, y: Int): Int = {
       if(y == 0)
         return x
       return gcd(y, x%y)
   }

   def this(x: Int) = this(x, 1)

    def numer = x / gcd(x,y)
    def denom = y / gcd(x,y)

    def add(r: Rational) = 
       new Rational(numer * r.denom + r.numer * denom, denom * r.denom)
    
    def product(r: Rational) = 
        new Rational(this.numer * r.numer, this.denom * r.denom)

    override def toString: String = {
        if(denom == 1)
            return s"$numer" 
        else
          return s"$numer/$denom"
    }
}


val r1 = new Rational(1,2)
println("hi "+r1.add(new Rational(1,2)).product(new Rational(4)))
// println("using extensions "+ (r1+ new Rational(1,2) + new Rational(4)))
    