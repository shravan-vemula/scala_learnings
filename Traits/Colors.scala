// example 2
// extending parent's features

class RGBColor(val color: Int) {
    def hex = f"$color%06X"
}

trait Opaque extends RGBColor {
    override def hex = s"${super.hex}FF"
}

trait Sheer extends RGBColor { 
    override def hex = s"${super.hex}33" 
}

class Paint(color: Int) extends RGBColor(color) with Opaque

class Overlay(color: Int) extends RGBColor(color) with Sheer

val red = new Paint(192)
println(red.hex)

val blue =  new Overlay(190)
println(blue.hex)