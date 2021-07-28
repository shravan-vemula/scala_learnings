trait Expr {}

case class Number(n: Int) extends Expr
case class Sum(e1: Expr, e2: Expr) extends Expr
case class Var(n: Int) extends Expr
case class Product(e1: Expr, e2: Expr) extends Expr

def eval(e: Expr): Int = e match {
    case Number(n) => n
    case Sum(e1, e2) => eval(e1) + eval(e2)
    case Var(x) => x
    case Product(e1, e2) => eval(e1) * eval(e2)
}

def show(e: Expr): String = e match {
    case Number(n) => n.toString
    case Sum(e1, e2) => s"${show(e1)} + ${show(e2)}"
    case Var(n) => n.toString
    case Product(e1, e2) => s"${show(e1)} * ${show(e2)}"
}


println(s"show sum: "+ show(new Sum(new Number(1), new Number(2))))
println(s"sum value: "+ eval(new Sum(new Number(1), new Number(2))))
println(s"show product: "+ show(new Product(new Var(1), new Var(2))))
println(s"product value: "+ eval(new Product(new Var(1), new Var(2))))



