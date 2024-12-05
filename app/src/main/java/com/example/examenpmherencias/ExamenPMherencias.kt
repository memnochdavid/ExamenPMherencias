package com.example.examenpmherencias



//Ejercicio 01
class Videojuego(
    var nombre: String ="",
    var plataforma:String="",
    var ano:Int=0
)

//Ejercicio 02

fun filtraJuegos(catalogo:List<Videojuego>, ano_input:Int): MutableList<Videojuego> {
    var devuelve=mutableListOf<Videojuego>()
    for(juego in catalogo){
        if(juego.ano==ano_input){
            devuelve+=juego
        }
    }
    return devuelve
}

//Ejercicio 03
fun mapaJuegos(juegos:List<Videojuego>):Map<String,Int> {
    var mapa=mutableMapOf<String, Int>()
    for(juego in juegos){
        if (mapa.containsKey(juego.plataforma)) {

        }
    }
}





//Ejercicio 04
fun plataformas(juegos:List<Videojuego>):MutableList<String>{
    var plataformas=mutableListOf<String>(juegos[0].plataforma)
    for(juego in juegos){
        if(juego.plataforma !in plataformas)
            plataformas+=juego.plataforma
    }
    return plataformas
}


//Ejercicio 05
open class Circunferencia(var radio:Float=0.0f){
constructor(
    x:Float,
    y:Float,
    centro:List<Float>
):this()

    fun longitud():Float{
        return (2*Math.PI*radio).toFloat()
    }

    override fun toString(): String {
        return "Radio: $radio, Longitud: ${longitud()}"
    }
}

//Ejercicio 08
class Circulo(radio: Float, val color: String) : Circunferencia(radio) {
    constructor(centro: List<Float>, x: Float, y: Float, color: String) : this(
        calculaRadio(centro, x, y),
        color
    )
    override fun toString(): String {
        return "Radio: $radio, Area: ${area(radio)}, color: $color, Longitud: ${longitud()}"
    }


    fun area( radio: Float): Float {
        return (3.14f * (radio*radio))
    }
    companion object {
        fun calculaRadio(centro: List<Float>, x: Float, y: Float): Float {//internet!!!!!
            val centerX = centro[0]
            val centerY = centro[1]
            return Math.sqrt(Math.pow((x - centerX).toDouble(), 2.0) + Math.pow((y-centerY).toDouble(), 2.0)).toFloat()
        }
    }
}

//Ejercicio 09
class Equipo(
    var nombre:String,
    var pais:String
)

//Ejercicio 10
var liga= mutableListOf<Equipo>(
    Equipo("Arsenal","Inglaterra"),
    Equipo("Aston Vila","Italia"),
    Equipo("Atalanta","Italia"),
    Equipo("Atlético de Madrid","España"),
    Equipo("Barcelona","España"),
    Equipo("Bayer Leverkusen","Alemania"),
    Equipo("Benfica","Portugal"),
    Equipo("Borussia Dortmund","Alemania"),
    Equipo("Celtic","Escocia"),
    Equipo("Dinamo Zagreb","Croacia"),
    Equipo("Real Madrid","España"),
    Equipo("Girona","España"),
    Equipo("Liverpool","Inglaterra"),
    Equipo("Milan","Italia"),
    Equipo("Stuttgart","Alemania"),
    Equipo("Paris Saint-Germain","Francia"),
    Equipo("Juventus","Italia"),
)



fun main(){


}