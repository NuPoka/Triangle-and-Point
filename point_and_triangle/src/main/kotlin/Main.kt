fun main() {

    print("Введите координаты точки (x y через enter): ")
    var (x,y) = Pair(vvod(),vvod())
    print("Введите координаты точки (x1 y1 через enter): ")
    var (x1,y1) = Pair(vvod(),vvod())
    print("Введите координаты точки (x2 y2 через enter): ")
    var (x2,y2) = Pair(vvod(),vvod())
    print("Введите координаты точки (x3 y3 через enter): ")
    var (x3,y3) = Pair(vvod(),vvod())
    var ras = m().rashet(x,x1,x2,x3,y,y1,y2,y3)
}
fun vvod():Int{
    var buf:String
    do {
        buf = readln()
        if (buf.toIntOrNull()==null)
            println("Введите целое число!")
    }while (buf.toIntOrNull()==null)
    return buf.toInt()
}
class m{
fun rashet( x: Int, x1: Int, x2: Int, x3:Int, y:Int, y1:Int, y2:Int, y3:Int){
    if ((x1-x) * (y2-y1) - (x2 - x1) * (y1 - y) >= 0 && (x2-x) * (y3-y2) - (x3 - x2) * (y2 - y) >= 0 && (x3-x) * (y1-y3) - (x1 - x3) * (y3 - y) >= 0)
    {
        println("Точка принадлежит треугольнику!")
        return
    }
    if ((x1-x) * (y2-y1) - (x2 - x1) * (y1 - y) <= 0 && (x2-x) * (y3-y2) - (x3 - x2) * (y2 - y) <= 0 && (x3-x) * (y1-y3) - (x1 - x3) * (y3 - y) <= 0)
    {
        println("Точка принадлежит треугольнику!")
        return
    } else println("Точка не принадлежит треугольнику!")
}
}